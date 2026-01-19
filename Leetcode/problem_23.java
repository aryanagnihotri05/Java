package Leetcode;

import java.util.PriorityQueue;

public class problem_23 {

    public class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.value - b.value);

        for (ListNode node: lists){
            if (node != null){
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!pq.isEmpty()){
            ListNode smallest = pq.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null){
                pq.offer(smallest.next);
            }
        }
        return dummy.next;
    }

    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        problem_23 prob = new problem_23();
        ListNode[] lists = new ListNode[3];

        lists[0] = prob.new ListNode(1,
                prob.new ListNode(4,
                        prob.new ListNode(5)));

        lists[1] = prob.new ListNode(1,
                prob.new ListNode(3,
                        prob.new ListNode(4)));

        lists[2] = prob.new ListNode(2,
                prob.new ListNode(6));

        ListNode result = prob.mergeKLists(lists);;
        prob.printList(result);

    }

}
