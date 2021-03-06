package TADs.Implementaciones;

import TADs.Excepciones.EmptyQueueException;
import TADs.Interfaces.MyQueue;

public class LinkedListQueue<T> extends ListaEnlazada<T> implements MyQueue<T> {

    int tiempoDemora = 0;

    @Override
    public void enqueue(T element) { add(element);
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        T valorSacado = null;
        Nodo<T> newfirst = null;
        newfirst.setValue(primerNodo.getNextValue().getValue());
        newfirst.setNextValue(primerNodo.getNextValue().getNextValue());
        primerNodo.getNextValue().setNextValue(null);
        primerNodo.setNextValue(null);
        valorSacado = (T) primerNodo.getValue();
        primerNodo = newfirst;
        return valorSacado;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        boolean resultado = false;
        if (size() == 0){
            resultado = true;}
        return resultado;
    }
}
