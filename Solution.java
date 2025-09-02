class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;  // or use: result = (result << 1) | head.val;
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
