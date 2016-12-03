package com.rasulov.task56;

import com.rasulov.task56.DeliveranceDuplicate;
import com.rasulov.task56.Node;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DeliveranceDuplicateTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void testDeliveranceDuplicate() {
        Node node4 = new Node(3);
        Node node3 = new Node(2, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node = new Node(1, node1);
        Node actualResult = DeliveranceDuplicate.deliveranceDuplicate(node);
        Node expectedResult = new Node(1, new Node(2, node4));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeliveranceDuplicateWhenAllElementsUnique() {
        Node node4 = new Node(5);
        Node node3 = new Node(4, node4);
        Node node2 = new Node(3, node3);
        Node node1 = new Node(2, node2);
        Node node = new Node(1, node1);
        Node actualResult = DeliveranceDuplicate.deliveranceDuplicate(node);
        Node expectedResult = new Node(1, new Node(2, new Node(3, new Node(4, node4))));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeliveranceDuplicateWhenNotHaveUniqueElements(){
        Node node5 = new Node(3);
        Node node4 = new Node(3, node5);
        Node node3 = new Node(2, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node node = new Node(1, node1);
        Node actualResult = DeliveranceDuplicate.deliveranceDuplicate(node);
        Node expectedResult = new Node(1, new Node(2, node5));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeliveranceDuplicateWhenDuplicateLastElement(){
        Node node5 = new Node(5);
        Node node4 = new Node(5, node5);
        Node node3 = new Node(4, node4);
        Node node2 = new Node(3, node3);
        Node node1 = new Node(2, node2);
        Node node = new Node(1, node1);
        Node actualResult = DeliveranceDuplicate.deliveranceDuplicate(node);
        Node expectedResult = new Node(1, new Node(2, new Node(3, new Node(4, node5))));
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeliveranceDuplicateWhenNullException(){
        expectedException.expect(NullPointerException.class);
        DeliveranceDuplicate.deliveranceDuplicate(null);
    }

}