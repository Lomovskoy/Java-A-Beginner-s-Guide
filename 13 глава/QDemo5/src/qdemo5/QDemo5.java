package qdemo5;

import classes.GenStack;
import exceptions.StackEmptyException;
import exceptions.StackFullException;

/**
 * Добавить в класс GenStack специальные исключения реагирующие на попытку выйти за
 пределы массива
 *
 * @author lomov
 */
public class QDemo5 {

    public static void main(String[] args) throws StackFullException, StackEmptyException {

        Character iStore[] = new Character[100];
        GenStack<Character> bigS = new GenStack<Character>(iStore);
        
        Character iSmall[] = new Character[4];
        GenStack smallS = new GenStack(iSmall);
        
        Character ch;
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
                ch = (char) smallS.pop();
                if (ch != (char) 0) {
                    System.out.print(ch);
                }
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
