package Leetcode;


public class problem_82 {

    private Node head;
    private Node tail;
    private int size;

    public problem_82() {
        this.size = 0;
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

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
