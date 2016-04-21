package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Test.PersonEntity;

public interface PersonService extends Remote {
    public List<PersonEntity> GetList() throws RemoteException;
}
