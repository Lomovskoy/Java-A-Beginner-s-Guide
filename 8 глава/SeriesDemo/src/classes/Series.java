package classes;

public interface Series {
    int getNext();          //возвратить следующее по порядку число
    void reset();           //сброс
    void setStart(int x);   //установить начальное значение
}
