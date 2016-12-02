package testpkg;

/**
 * Created by jayendrakumar_m on 12/1/2016.
 */

public class test1 {

    private Node head;
    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node reverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        System.out.println("Node :" +node.value);

        Node remaining = reverseLinkedList(node.next);

        System.out.println("Remaining : " + remaining.value);

        node.next.next = node;
        node.next = null;
        return remaining;
    }

    public static void main(String args[])
    {
        System.out.println("Hello World");

        test1 ts = new test1();

        Node head = new Node(5);

        System.out.println(head);

        ts.addToTheLast(head);
        ts.addToTheLast(new Node(6));
        ts.addToTheLast(new Node(7));
        ts.addToTheLast(new Node(1));
        ts.addToTheLast(new Node(2));
        ts.addToTheLast(new Node(8));
        ts.addToTheLast(new Node(9));
        ts.addToTheLast(new Node(10));
        ts.printList(head);

        Node reverseHead=reverseLinkedList(head);
        System.out.println("After reversing");
        ts.printList(reverseHead);

    }
}


