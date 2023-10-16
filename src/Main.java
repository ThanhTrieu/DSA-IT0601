// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* LinkedList */
        LinkedList<String> animals = new LinkedList<>();
        // 1 - operator add
        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals, 0, "Tiger");
        LinkedListADT.getElementByIndex(animals, 2);
        LinkedListADT.scanElementLinkedList(animals);

        /*Stack*/
        Stack<Integer> numbers = new Stack<>();
        // 1 - push stack
        StackADT.stackPush(numbers);
        // 2 - pop stack
        StackADT.stackPop(numbers);
        // 3 - peek stack
        StackADT.stackPeek(numbers);
        // 4 - search stack
        StackADT.stackSearch(numbers, 3);
        // 5 - empty stack
        StackADT.checkEmptyStack(numbers);

        /* Queue implement LinkedList */
        Queue<String> fruits = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruits);
        Queue<Integer> number = new LinkedList<>();
        QueueLinkedListADT.queueOffer(number);
        QueueLinkedListADT.queuePeek(number);
        QueueLinkedListADT.queueSearch(number, 8);
        QueueLinkedListADT.queuePoll(number);
        QueueLinkedListADT.forQueue(number);

        /* Cac thuat toan sap xep */
        /* 1- Bubble Sort */
//        int[] randomNumbers = {100,3,1,20,5,4};
//        BubbleSortALU.bubbleSort(randomNumbers, randomNumbers.length);
//        BubbleSortALU.printResult(randomNumbers);
        /* 2 - Insertion Sort */
//        int[] randomNumbers2 = {100,3,1,20,5,4};
//        InsertionSortALU.insertionSort(randomNumbers2);
//        InsertionSortALU.printResult(randomNumbers2);
        // 3 - Selection Sort
//        int[] randomNumbers3 = {100,3,1,20,5,4};
//        SelectionSortALU.selectionSort(randomNumbers3);
//        SelectionSortALU.printResult(randomNumbers3);
        // 4 - merge sort
        int[] randomNumbers4 = {100,3,1,20,5,4};
        MergeSortALU.sort(randomNumbers4, 0, randomNumbers4.length - 1);
        MergeSortALU.printResult(randomNumbers4);
    }
}