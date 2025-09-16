package Leetcode;

public class prob1 {

    public class LL {

        private Node head;
        private Node tail;
        private int size;


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

        public int lengthCycle(Node head){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow){
                    Node temp = slow;
                    int length = 0;
                    do {
                        temp = temp.next;
                    }
                    while (temp != slow);
                    return length;
                }
            }
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

}
