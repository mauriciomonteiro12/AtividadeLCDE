package ListaCircularDuplamenteEncadeada;

public class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public String displayForward() {
        if (head == null) {
            return "A lista está vazia.";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        do {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        } while (temp != head);
        return sb.toString().trim();
    }

    public String displayBackward() {
        if (head == null) {
            return "A lista está vazia.";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head.prev;
        do {
            sb.append(temp.data).append(" ");
            temp = temp.prev;
        } while (temp != head.prev);
        return sb.toString().trim();
    }

    public void remove(int data) {
        if (head == null) return;

        Node current = head;

        if (head.data == data) {
            if (head.next == head) {
                head = null;
            } else {
                Node tail = head.prev;
                tail.next = head.next;
                head.next.prev = tail;
                head = head.next;
            }
            return;
        }

        Node temp = head;
        do {
            if (temp.data == data) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }
}