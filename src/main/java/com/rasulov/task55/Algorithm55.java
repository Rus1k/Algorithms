package com.rasulov.task55;


public class Algorithm55 {

    public static Node getCentralElement(Node firstElem) throws PairNumberElementsException {
        Node returnResult = firstElem;
        Node firstElement = firstElem;
        int quantityElement = 1;
        while (firstElement.next != null) {
            firstElement = firstElement.next;
            quantityElement++;
        }
        if (quantityElement % 2 == 0) {
            throw new PairNumberElementsException();
        }
        int numberCentralElement = (quantityElement + 1) / 2;
        for(int i = 1; i < numberCentralElement; i ++){
            returnResult = returnResult.next;
        }
        return returnResult;
    }

}
