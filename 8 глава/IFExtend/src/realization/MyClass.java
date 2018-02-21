package realization;

import interfaces.B;

/**
 * Этот класс должен реализовать все методы,
 * объявленные в интерфейсах А и В
 * @author imxo
 */
public class MyClass implements B{

    @Override
    public void methl() {
        System.out.println("Peaлизaция метода meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Peaлизaция метода meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Peaлизaция метода meth3().");
    }
    
}
