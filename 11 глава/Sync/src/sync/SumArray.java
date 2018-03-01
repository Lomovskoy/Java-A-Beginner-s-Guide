package sync;

import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

/**
 * Синхронизированный метод
 *
 * @author lomov
 */
public class SumArray {

    private int sum;

    synchronized int sumArray(int nums[]) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для "
                    + Thread.currentThread().getName() + ": " + sum);

            try {
                Thread.sleep(10);//разрешить переключение задач
            } catch (InterruptedException exc) {
                System.out.println("Прерывание оснеовного потока");
            }
        }
        return sum;
    }
}
