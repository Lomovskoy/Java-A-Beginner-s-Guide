package excdemo5;

/**
 * В операторах catch исключения подкласса должны предшествовать исключениям
 * суперкласса
 *
 * @author imxo
 */
public class ExcDemo5 {

    public static void main(String[] args) {

        // Длина массива numer превьШiает длину массива denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / "
                        + denom[i] + " равно " + numer[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException ехс) {
                // Перехватить исключение подкnоссо
                System.out.println("Cooтвeтcтвyющий элемент не найден");
            } catch (Throwable ехс) {
                System.out.println("Boзниклo исключение");
            }
        }
    }
}
