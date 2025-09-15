package DSAKK.LL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertMid(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

//        temp.next = new Node(val, temp.next);

        size++;

    }

    public void insertRec(int val, int index){

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        Node temp = get(size-1);
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void remove_duplicate_sorted(){
        Node curr = head;
        while(curr != null && curr.next != null){
            if (curr.value != curr.next.value){
                curr = curr.next;
            }
            else{
                Node temp = curr.next;
                curr.next = temp.next;
            }
        }
    }

    public void remove_duplicate_sorted2(){
        Node temp;
        while(head != null && head.next != null && head.value == head.next.value){
            int val = head.value;
            while(head != null && head.value == val){
                head = head.next;
            }
        }
        Node curr = head;

        while (curr != null && curr.next != null){
            if (curr.next.next != null && curr.next.value == curr.next.next.value){
                int val = curr.next.value;
                while (curr.next != null && curr.next.value == val){
                curr.next = curr.next.next;
                }
            }
            else{
                curr = curr.next;
                }
        }
    }

    public static LL merge(LL list1, LL list2) {
        // Dummy node to simplify edge cases
        Node f = list1.head;
        Node s = list2.head;

        LL ans = new LL();
        // Traverse both lists
        while (f != null && s != null) {
            if (f.value <= s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        // Attach remaining part
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(){
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
