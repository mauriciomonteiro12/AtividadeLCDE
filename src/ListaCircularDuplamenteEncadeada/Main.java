package ListaCircularDuplamenteEncadeada;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        System.out.println("Adicionando elementos à lista:");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Lista (direta): " + list.displayForward());
        System.out.println("Lista (inversa): " + list.displayBackward());

        System.out.println("Removendo 20 da lista:");
        list.remove(20);
        System.out.println("Lista após remoção: " + list.displayForward());

        System.out.println("Removendo 10 da lista:");
        list.remove(10);
        System.out.println("Lista após remoção: " + list.displayForward());
    }
}