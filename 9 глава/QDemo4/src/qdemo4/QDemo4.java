package qdemo4;

import classes.Stack;
import exceptions.StackEmptyException;
import exceptions.StackFullException;

/**
 * Добавить в класс Stack специальные исключения реагирующие на попытку выйти за
 * пределы массива
 *
 * @author lomov
 */
public class QDemo4 {

    public static void main(String[] args) throws StackFullException, StackEmptyException {

        Stack bigS = new Stack(100);
        Stack smallS = new Stack(4);
        char ch;
        int i;

        System.out.println("Использование стека bigS для сохранения алфавита");
        //Поместить буквенные символы в стек bigS
        for (i = 0; i < 26; i++) {
            bigS.put((char) ('A' + i));
        }

        try {
            //Извречь буквенные символы в стек bigS
            System.out.println("Содержимое стека bigS: ");
            for (i = 0; i < 26; i++) {
                ch = bigS.pop();
                if (ch != (char) 0) {
                    System.out.print(ch);
                }
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println("\n");

        System.out.println("Использование стека smallS для ганерации ошибок");

        try {
            //Использовать стека smallS для ганерации ошибок
            for (i = 0; i < 5; i++) {
                System.out.println("Попытка сохранения " + (char) ('Z' - i));
                smallS.put((char) ('Z' - i));
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            //Добавление ошибки при обращении к очереди smallS
            System.out.print("Содержание smallS: ");
            for (i = 0; i < 5; i++) {
                ch = smallS.pop();
                if (ch != (char) 0) {
                    System.out.print(ch);
                }
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
