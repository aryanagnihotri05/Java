package Leetcode;


public class problem_21 {

    private Node head;
    private Node tail;
    private int size;

    public problem_21() {
        this.size = 0;
    }


    public Node mergeTwoLists(Node list1, Node list2) {
        // Dummy node to simplify edge cases
        Node dummy = new Node();
        Node list3 = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                list3.next = list1;
                list1 = list1.next;
            } else {
                list3.next = list2;
                list2 = list2.next;
            }
            list3 = list3.next;
        }

        // Attach remaining part
        if (list1 != null) {
            list3.next = list1;
        } else {
            list3.next = list2;
        }

        return dummy.next;
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
