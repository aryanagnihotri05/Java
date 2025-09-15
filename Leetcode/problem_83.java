package Leetcode;


public class problem_83 {

    private Node head;
    private Node tail;
    private int size;

    public problem_83() {
        this.size = 0;
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

//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode curr = head;
//        ListNode prev = null;
//        while(curr != null){
//            if(curr.next != null && curr.val == curr.next.val){
//                int val = curr.val;
//                while(curr != null && curr.val == val){
//                    curr = curr.next;
//                }
//
//                if(prev != null){
//                    prev.next = curr;
//                }else{
//                    head = curr;
//                }
//            }else{
//                prev = curr;
//                curr = curr.next;
//            }
//        }
//        return head;
//    }
//}
