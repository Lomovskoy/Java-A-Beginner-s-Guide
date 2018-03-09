package methodrefdemo3;

/**
 * Функциональный интерфейс для числовык предикатов, которые
 * воздействуют на объект типа MyIntNum и целочесленное значение
 * @author lomov
 */
public interface MyIntNumPredicate {
    boolean test(MyIntNum mv, int n);
}
