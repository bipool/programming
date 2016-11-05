package programming.linkedList;

/**
 * Created by Bipool on 11/4/16.
 */
public class Node {
    private String data;
    private Node next;

    public Node() {

    }

    public Node(final String data) {
        this.data = data;
    }

    public Node(final String data, final Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}
