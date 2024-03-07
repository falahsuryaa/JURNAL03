public class listnode<E> {
    E data;
    listnode<E> next;

    public listnode(E object){
        data = object;
        this.next = null;
    }

    public E getData(){
        return data;
    }
}
