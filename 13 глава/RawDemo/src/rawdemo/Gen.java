package rawdemo;

/**
 * Демонстрация использования базового типа
 * @author lomov
 */
public class Gen<T> {
    T ob; // Обьявлем обьект обощённого типа

    //ПЕредать конструктору ссылку на обьект типа T
    public Gen(T ob) {
        this.ob = ob;
    }
    
    //Вернуть обьект ob
    T getOb(){
        return ob;
    }
}
