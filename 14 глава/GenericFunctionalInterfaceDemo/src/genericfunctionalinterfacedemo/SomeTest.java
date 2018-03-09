package genericfunctionalinterfacedemo;

/**
 * Обощённый функциональный интерфейс с двумя примерами,
 * который возвращает результат типа boolean
 * @author lomov
 */
public interface SomeTest<T> {
    boolean test(T n, T m);
}
