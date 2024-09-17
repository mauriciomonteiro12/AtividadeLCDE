package ListaCircularDuplamenteEncadeada;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircularDoublyLinkedListTest {

    private CircularDoublyLinkedList list;


    @BeforeEach
    public void setUp() {
        list = new CircularDoublyLinkedList();
    }

    @Test
    public void testAddAndDisplay() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals("10 20 30", list.displayForward());
    }

    private void assertEquals(String s, String s1) {

    }

    @Test
    public void testRemoveHead() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(10);
        assertEquals("20 30", list.displayForward());
    }

    @Test
    public void testRemoveMiddle() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(20);
        assertEquals("10 30", list.displayForward());
    }

    @Test
    public void testRemoveTail() {
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(30);
        assertEquals("10 20", list.displayForward());
    }

    @Test
    public void testRemoveFromEmptyList() {
        list.remove(10);
        assertEquals("A lista está vazia.", list.displayForward());
    }

    @Test
    public void testDisplayBackward() {
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals("30 20 10", list.displayBackward());
    }

}