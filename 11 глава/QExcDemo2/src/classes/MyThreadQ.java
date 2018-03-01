package classes;

/**
 *
 * @author lomov
 */
public class MyThreadQ implements Runnable {

    public Queue quOb;
    public Thread thrd;
    public char ch;

    public MyThreadQ(String name, Queue qu) {
        thrd = new Thread(this, name);
        quOb = qu;
    }

    @Override
    synchronized public void run() {
        try {
            if (thrd.getName().equals("Big Queue")) {
                System.out.println("Извречь буквенные символы в очередь");
                for (int i = 0; i < 26; i++) {
                    ch = quOb.get();
                    
                    if (ch != (char) 0) {
                        System.out.println(ch+ " - Извлечён из очереди");
                    }
                }
            } else if (thrd.getName().equals("Small Queue")){
                System.out.println("Поместить буквенные символы в очередь");
                for (int i = 0; i < 26; i++) {
                    quOb.put((char) ('A' + i));
                    System.out.println((char) ('A' + i) + " - помещён в очередь ");
                }
            }
        } catch (Exception e) {
            System.out.println("Мой поток выдал исключение: " + e);
        }
    }

}
