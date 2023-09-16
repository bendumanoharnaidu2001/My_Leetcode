/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h;
        ListNode t;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            h = list1;
            t = list1;
            list1 = list1.next;
        }
        else {
            h = list2;
            t = list2;
            list2 = list2.next;
        }
        while (list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                t.next = list1;
                t = t.next;
                list1 = list1.next;
            }
            else {
                t.next = list2;
                t = t.next;
                list2 = list2.next;
            }
        }
        if (list1==null) {
            t.next = list2;
        }
        if (list2==null) {
            t.next = list1;
        }
        return h;
    }
}