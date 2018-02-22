/*
    ПРименение интерфейсных ссылок
*/

package seriesdemo;

import classes.ByThrees;
import classes.ByTows;
import classes.Series;

public class SeriesDemo2 {

    public static void main(String[] args) {
        ByTows twoOb = new ByTows();
        ByThrees threeOb = new ByThrees();
        Series ob;
        
        for(int i=0; i < 5; i++){
            
            //Доступ к обьекту по интерфейсной сслыке
            ob = twoOb;
            System.out.println("Следующее значение ByTows: " + ob.getNext());
            
            ob = threeOb;
            System.out.println("Следующее значение ByThrees: " + ob.getNext());
        }
    }
}
