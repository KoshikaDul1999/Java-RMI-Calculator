package com.ictec.cal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {

    public MyCalculator() throws RemoteException {
        super();
    }

    @Override
    public int addTwoIntegers(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public int substractTwoIntegers(int a, int b) throws RemoteException {
        return (a-b);
    }

    @Override
    public int multiplyTwoIntegers(int x, int y) throws RemoteException {
        return (x*y);
    }

    @Override
    public int divideTwoIntegers(int a, int b) throws RemoteException {
        return (a/b);
    }
}
