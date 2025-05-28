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

        //day one of coding refresher/learning: dummy nodes. notes for self reference.
        ListNode dummy = new ListNode(1); //a new listnode obj with a filler value (a dummy node)
        ListNode current = dummy; //current references the same node obj
        //current is added onto (see below) but dummy is the "bookmark" for the dummy header. Still same obj.

        while (list1 != null && list2 != null) { //null is end of the list
            if (list1.val <= list2.val) {
                current.next = list1; //set next node in current to list1
                list1 = list1.next; //iterate through list
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; //iterate through current
        }

        //after while loop ends (end of one list is reached)
        if (list1 != null) { //list1 is not the one that ended
            current.next = list1; //link (not add, LINK) rest of list1 to current
        } else {
            current.next = list2;
        }

        return dummy.next; //return current after dummy "bookmark", aka the head of current.
    }
}
