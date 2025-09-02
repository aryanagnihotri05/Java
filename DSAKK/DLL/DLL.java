package DSAKK.DLL;

public class DLL {
    Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if (head != null){
            head.prev = node;
        }
        head = node;
        size += 1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;

            return;
        }

        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size += 1;
    }

    public void insertMid(int val, int index){
        if (index == 1){
            insertFirst(val);
            return;
        }
        if (index == size+1){
            insertLast(val);
            return;
        }
        if (index > size || index < 0){
            System.out.println("Index not available");
            return;
        }
        Node temp = head;
        for (int i = 2; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size += 1;
    }

    public int deleteFirst(){
        if (head == null) {
            return 0;
        }
        Node temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        size--;
        // Return new head
        return temp.val;
    }

    public int deleteLast(){
        if (head == null) {
            return 0;
        }
        if (head.next == null){
            return 0;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
               temp.prev.next = null;

        size--;
        // Return new head
        return temp.val;
    }

    public int delete(int index) {
        if (index == 1) {
            return deleteFirst();
        } else if (index == size ) {
            return deleteLast();
        } else if (index > 1 && index < size) {
            Node temp = get(index-1);
            int num = temp.next.val;

            temp.next = temp.next.next;
            temp.next.prev = temp;

            return num;
        } else {
            System.out.println("Index out of bound");
            return 0;
        }
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
        Node last =  null;
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println();

        System.out.println("PRINT IN REVERSE");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println();


        System.out.print("START");
        System.out.println();
//        System.out.println("Size of linked list is: "+size);

    }

    public void displayRev(){
        Node node = head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

