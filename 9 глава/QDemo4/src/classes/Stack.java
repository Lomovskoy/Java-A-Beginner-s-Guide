package classes;

import exceptions.StackEmptyException;
import exceptions.StackFullException;

/**
 * Класс, реализующий стек для хранения символов
 * @author lomov
 */
public class Stack {

    private char stck[];		//Массив для хранения элементов стека
    private int tos;	//индексы для вставки и извлечения элементов стека

    public Stack(int size) {
        stck = new char[size + 1];//Выделить память для стека
        tos= 0;
    }

    //Поместить символ в стек
    public void put(char ch) throws StackFullException{
        if (tos == stck.length - 1) {
            throw new StackFullException(stck.length);
        }
        stck[tos] = ch;
        tos++;
    }

    //Извлеч символ из стека
    public char pop() throws StackEmptyException{

        if (tos== 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}
