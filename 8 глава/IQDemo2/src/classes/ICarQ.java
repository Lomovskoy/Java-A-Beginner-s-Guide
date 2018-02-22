package classes;

/**
 * Интерфейс для очереди символов
 * @author lomov
 */
public interface ICarQ {
    
    //Поместить символ в очередь
    void put(char ch);
    
    //Извлеч символ из очереди
    char get();
    
    //Сброс очереди с исходное состояние
    void reset();
    
}