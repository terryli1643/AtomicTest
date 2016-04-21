package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import Test.PersonEntity;

public class Test {
    public static void main(String[] args) {
        try {
            
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 6600);
            PersonService personService = (PersonService)registry.lookup("rmi://127.0.0.1:6600/PersonService");
            List<PersonEntity> personList = personService.GetList();
            for (PersonEntity person : personList) {
                System.out.println("ID:" + person.getId() + " Age:" + person.getAge() + " Name:" + person.getName());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
