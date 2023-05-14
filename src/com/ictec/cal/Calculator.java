package com.ictec.cal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    //Add two integers
    public int addTwoIntegers(int x, int y)throws RemoteException;
    public int substractTwoIntegers(int a, int b) throws RemoteException;

    public int multiplyTwoIntegers(int x, int y) throws RemoteException;

    public int divideTwoIntegers(int a, int b) throws RemoteException ,ArithmeticException;
}
