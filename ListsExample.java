import java.util.ArrayList;
import java.util.LinkedList;

public class ListsExample {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("123");
        myList.add(0, "345");

        myList.add("567");

        for (String el : myList) {
            System.out.println(el);
        }

        myList.remove(2);
        System.out.println();

        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("apple");
        myList2.add("banana");

        myList.addAll(myList2);

        for (String el : myList) {
            System.out.println(el);
        }

        System.out.println();

        LinkedList<Boolean> myLinkedList = new LinkedList<>();
        myLinkedList.add(true);
        myLinkedList.add(false);

        myLinkedList.addFirst(true);
        myLinkedList.addLast(false);

        System.out.println(myLinkedList.poll());
        System.out.println(myLinkedList.poll());
        System.out.println(myLinkedList.poll());
        System.out.println(myLinkedList.poll());
        System.out.println(myLinkedList.pop());

        System.out.println();

        for (Boolean el : myLinkedList) {
            System.out.println(el);
        }

    }
}
