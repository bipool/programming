package programming.linkedList;

/**
 * Created by Bipool on 11/4/16.
 */
public class SinglyLinkedList {

    private Node head = null;

    private void traverse() {
        if(head == null) {
            System.out.println("NONE");
            return;
        }


        Node list = head;
        while (list != null) {
            System.out.println(list.getData());
            list = list.getNext();
        }
    }

    private void insertFirst(final String value) {
        final Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    private void insertLast(final String value) {
        final Node node = new Node(value);
        node.setNext(null);
        if (head == null) {
           head = node;
            return;
        }

        Node list = head;
        while (list.getNext() != null) {
            list = list.getNext();
        }
        list.setNext(node);
    }

    private void deleteFirst() {
        if ( head == null) {
            return;
        }

        head = head.getNext();
    }

    private void deleteLast() {

        if ( head == null) {
            return;
        }

        if (head.getNext() == null) {
            head = null;
            return;
        }

        Node list = head;
        while (list.getNext().getNext() != null) {
            list = list.getNext();
        }

        list.setNext(null);
    }

    private void deleteValue(final String value) {
        if (head == null) {
            return;
        }

        if(head.getData().equals(value)) {
            head = head.getNext();
            return;
        }

        Node list = head;
        while (list.getNext() != null) {
            if (list.getNext().getData().equals(value)){
                list.setNext(list.getNext().getNext());
                return;
            }
            list = list.getNext();
        }
    }

    private void deleteAll() {
        head = null;
    }

    private boolean searchValue(final String value) {

        Node list = head;
        while (list != null) {
            if(list.getData().equals(value)) {
                return true;
            }
            list = list.getNext();
        }

        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertLast("A");
        singlyLinkedList.insertFirst("B");
        singlyLinkedList.insertLast("C");
        if(singlyLinkedList.searchValue("C")){
            System.out.println("Found C");
        };

        if(singlyLinkedList.searchValue("D")){
            System.out.println("Found D");
        };

        singlyLinkedList.deleteValue("D");

        singlyLinkedList.deleteLast();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.deleteLast();
        singlyLinkedList.deleteLast();
        singlyLinkedList.traverse();
    }
}
