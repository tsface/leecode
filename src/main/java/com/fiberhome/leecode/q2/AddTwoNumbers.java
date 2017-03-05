/*
 * @(#)AddTwoNumbers 2017/3/5
 */
package com.fiberhome.leecode.q2;

/**
 * @author liyan
 * @version 2017/3/5
 * @see
 * @since 1.0
 */


public class AddTwoNumbers {

    //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //Output: 7 -> 0 -> 8
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
            sum=0;
        }
//        if (sum / 10 == 1) {
//            d.next = new ListNode(1);
//        }
        return sentinel.next;

    }
}
