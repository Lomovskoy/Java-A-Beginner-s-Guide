package classes;

import exceptions.StackEmptyException;
import exceptions.StackFullException;

/**
 * Класс, реализующий стек для хранения символов
 * @author lomov
 */
public class GenStack<T> implements IGenStack<T>{
    
    private T stck[];	//Массив для хранения элементов стека
    private int tos;	//индексы для вставки и извлечения элементов стека

    //Выделить память для стека
    public GenStack(T[] stck) {
        this.stck = stck;
        this.tos = 0;
    }

    //Поместить символ в стек
    @Override
    public void put(T ob) throws StackFullException {
        if (tos == stck.length - 1) {
            throw new StackFullException(stck.length);
        }
        stck[tos] = ob;
        tos++;
    }

    //Извлеч символ из стека
    @Override
    public T pop() throws StackEmptyException {
        if (tos== 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}
