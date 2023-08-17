package algo.투포인터슬라이딩윈도;

public class MergeTwoSortedLists {

    // leet code : https://leetcode.com/problems/merge-two-sorted-lists/

    static ListNode answer = new ListNode(-1);

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4, new ListNode(6))));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        mergeTwoLists(list1,list2);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode answerr = new ListNode(-1);
        ListNode answer = answerr;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                answer.next = list1;
                list1 = list1.next;
            } else {
                answer.next = list2;
                list2 = list2.next;
            }
            answer = answer.next;

        }
        if (list1 == null)
            answer.next = list2;

        if (list2 == null)
            answer.next = list1;

        return answerr.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}