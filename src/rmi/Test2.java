package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Test2 {

    public static void main(String[] args) {
        try {
            PersonService personService = new PersonServiceImpl();
            Registry registry = LocateRegistry.createRegistry(6600);
            registry.rebind("1111", personService);
            System.out.println("Service Start!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
