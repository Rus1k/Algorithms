package com.rasulov;

//  Write, efficient code for extracting unique elements from a sorted list of array. e.g.
//  (1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9) -> (1, 3, 5, 9).

public class DeliveranceDuplicate {

    public static Node deliveranceDuplicate(Node withDuplicateRemade) {
        Node left = withDuplicateRemade;
        Node right = left.getNext();

        if (withDuplicateRemade == null) {
            return null;
        }
        while (left.getNext() != null) {
            if (left.getValue() == right.getValue()) {
                deleteDuplicate(left, right);
            }
            left = right;
            right = left.getNext();
        }
        return withDuplicateRemade;
    }

    private static Node deleteDuplicate(Node result, Node duplicate) {
        Node left = result;
        Node right = left.getNext();
        while (left.getNext() != null) {
            if (left.getValue() == duplicate.getValue()) {
                if (left.getNext().getValue() == duplicate.getValue()) {
                    left.setNext(duplicate.getNext());
                    System.out.println("DUPLICATE " + duplicate.getValue());
                    break;
                }
            }
            left = right;
            right = left.getNext();
        }
        return result;
    }
}
