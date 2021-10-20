package ico.fes.unam.edd1358;

public class LinkedListADT {

  private class Nodo<T> {

        T data;
        Nodo next;

        public Nodo(T valor) {
            this.data = valor;
        }

        public Nodo(T valor, Nodo siguiente) {
            this.data = valor;
            this.next = siguiente;
        }
    }

    private Nodo head;
    public LinkedListADT(){
        this.head = null;
    }
    public boolean isEmpty(){
        return this.head == null;
    } 
    public Nodo getTail(){
        Nodo currNode = this.head;
        if(!this.isEmpty()){
            while(currNode.next != null){
                currNode = currNode.next;
            }
        }
        return currNode;
    }
    public void append(Object valor ){
        if(this.isEmpty()){
            this.head = new Nodo(valor);
        }else{
            this.getTail().next = new Nodo(valor);
        }
    }
    public void transversal(){
        Nodo currNode = this.head;
        while(currNode != null){
            System.out.println(currNode.data + "-->");
            currNode =  currNode.next;
        }
        System.out.println("");
    }
}
