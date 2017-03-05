/*
 * @(#)AddTwoNumbersTest 2017/3/5
 */
package com.fiberhome.leecode.q2;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * @author liyan
 * @version 2017/3/5
 */
public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;
    private ListNode listNode1 = new ListNode(0);
    private ListNode listNode2 = new ListNode(0);

    @Before
    public void setUp() throws Exception {
        addTwoNumbers = new AddTwoNumbers();
        ListNode tmpNext = listNode1;
        for(int i=0;i<5;i++){
            System.out.print(" " +i);
            tmpNext.next = new ListNode(i);
            if(i == 0){
                listNode1.val = tmpNext.next.val;
                continue;
            }
            tmpNext = tmpNext.next;
        }
        System.out.println();
        tmpNext = listNode2;
        for(int i=6;i<11;i++){
            System.out.print(" " +i);
            tmpNext.next = new ListNode(i);
            if(i == 6){
                listNode2.val = tmpNext.next.val;
                continue;
            }
            tmpNext = tmpNext.next;
        }
        System.out.println();

    }

    @Test
    public void testAddTwoNumbers(){
//        while (listNode1 != null){
//            System.out.print(" "+ listNode1.val);
//            listNode1 = listNode1.next;
//        }
//        System.out.println();
//        while (listNode2 != null){
//            System.out.print(" "+ listNode2.val);
//            listNode2 = listNode2.next;
//        }
        ListNode resultNode = addTwoNumbers.addTwoNumbers(listNode1, listNode2);
        while (resultNode != null){
            System.out.print(" "+ resultNode.val);
            resultNode = resultNode.next;
        }
    }
}
