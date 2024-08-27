// Punto 4
public class StackDis<T> {

    private Node<T> head;

    public T pop() {
        T popedElement = head.element;
        head = head.next;
        return popedElement;
    }

    public void push(T element) throws Exception {
        if(!element.getClass().equals(head.element.getClass())) throw new Exception("Object type dont equal");

        var node = new Node<T>(element);
        node.setNext(head);
        head = node;
    }

    private class Node<T>{
        private T element;
        private Node<T> next;

        public Node(T element){
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
