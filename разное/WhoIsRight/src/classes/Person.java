/*
 * Этот пакет будет содержать все необходимые классы
 */
package classes;

/**
 * Это фундаментальный класс от которого будут наследоваться 
 * все субкультуры которые будут использолваться в программк
 * @author lomov
 */
public class Person implements Runnable{
    
    Thread thrd;
    private String name;
    private String color;
    private String tatement[];
    private Integer random;
    private Integer min = 500;
    private Integer max = 2000; 
    private Integer time;
    private Integer points;
    private Boolean start;
        
    public Person(String name, String color, String[] tatement, Boolean start) {
        this.name = name;
        this.color = color;
        this.tatement = tatement;
        this.start = start;
        thrd = new Thread(this, name);
        if(start)
            thrd.start();
        points = 0;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public Integer getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    
    @Override
    public void run(){
        try {
            while (start) {
                time = min + (int) (Math.random() * max);
                Thread.sleep(time);
                if(start){
                    System.out.println(color + name + tatement[(int) (Math.random() * (tatement.length))]);
                    points += 1;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
}
