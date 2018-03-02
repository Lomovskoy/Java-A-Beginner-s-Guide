package enumdemo3;

/**
 * Использоывание конструктора, переменной экземпляра
 * и метода перечисления
 * @author lomov
 */
public enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);//обратите внимание наспособ инициализации констант
    
    //Добавдение переменной экземпляра
    private int speed;//Типичная скорость транспортного средства
    
    //конструктор
    private Transport(int speed) {
        this.speed = speed;//Добавление конструктора
    }
    
    //метод
    public int getSpeed() {
        return speed;
    }
    
}
