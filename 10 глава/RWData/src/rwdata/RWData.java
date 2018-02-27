package rwdata;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Запись и чтение двоичных данных
 * @author lomov
 */
public class RWData {

    public static void main(String[] args) throws IOException {
        String file = "testdata"; 
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        
        //Записать рад значений
        try(DataOutputStream dataOut = 
                new DataOutputStream(new FileOutputStream(file))){
            
            System.out.println("Записанно: " + i);
            dataOut.writeInt(i);
            
            System.out.println("Записанно: " + d);
            dataOut.writeDouble(d);
            
            System.out.println("Записанно: " + b);
            dataOut.writeBoolean(b);
            
            System.out.println("Записанно: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }catch(IOException exc){
            System.out.println("Ошибка при записи.");
            return;
        }
        System.out.println();

        //А теперь прочитать записанные значения
        try(DataInputStream dataIn = 
                new DataInputStream(new FileInputStream(file))){
            
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);
            
            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);
            
            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);
            
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении.");
        }
    }
    
}
