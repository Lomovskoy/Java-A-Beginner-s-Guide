package implementation;

import interfaces.MyIF;

/**
 * Предоставляются реализации обоих методов -
 * getUserID() и getAdminID()
 * @author imxo
 */
public class MyIFimp2 implements MyIF{

    @Override
    public int getUserID() {
        return 100;
    }

    @Override
    public int getAdminID() {
        return 42;
    }
    
}
