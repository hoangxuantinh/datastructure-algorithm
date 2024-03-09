//import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> test = new LinkedList<Integer>();
//        test.set(4,4);


        LinkedList newLinkedList = new LinkedList();
//        newLinkedList.append(0);
//        newLinkedList.append(1);
//        newLinkedList.append(2); // 0 1 2
//
//        newLinkedList.removeLast(); // 0 1
//        newLinkedList.removeLast(); // 0
//        System.out.println(newLinkedList.removeLast());
//
//        newLinkedList.preAppend(2);
//        newLinkedList.preAppend(1); // 1 2
//
//        newLinkedList.removeFirst();
//        newLinkedList.removeFirst(); // remove all
//        newLinkedList.insert(2, 2);
//        newLinkedList.remove(4); // 0 1 2 3

        newLinkedList.append(0); // 0
        newLinkedList.append(1); // 0
        newLinkedList.append(2); // 0 1
        newLinkedList.append(3); // 0 1 2
//        newLinkedList.append(4); // 0 1 2
//        newLinkedList.append(5); // 0 1 2

//        newLinkedList.revert();
        newLinkedList.findMiddleNode();

        newLinkedList.printList();
        newLinkedList.getLength();

    }
}