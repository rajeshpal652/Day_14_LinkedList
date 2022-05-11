package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3NumbersWhereLastNodeIsDeletedShouldPassTheResultTestCase(){
        MyNode<Integer>  myFirstNode = new MyNode(56);
        MyNode<Integer> mySecondNode = new MyNode(30);
        MyNode<Integer>  myThirdNode = new MyNode(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printNodes();
        boolean result = myLinkedList.head.equals(myFirstNode)
                && myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
}