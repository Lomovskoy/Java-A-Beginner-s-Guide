package implementation;

import interfaces.MyIF;

/**
 * Реализация интерфейса MyIF
 * @author imxo
 */
public class MyIFimp implements MyIF{
    // Реализации подлежит лишь метод getUserID() интерфейса My!F.
    // Делать это для метода getAdminID() необязательно, поскольку
    // при необходимости может быть использована его реализация,
    // заданная по умолчанию.
    @Override
    public int getUserID() {
        return 100;
    }    
}
