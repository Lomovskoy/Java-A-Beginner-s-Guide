package methodrafdemo;

/**
 * Функциональный интерфейс для числовых предикатов, которые
 * воздействуют на целочисленные значения
 * @author lomov
 */
public interface IntPredicate {
    boolean test(int n);
}
