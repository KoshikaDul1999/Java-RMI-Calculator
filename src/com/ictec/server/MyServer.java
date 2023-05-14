package com.ictec.server;

import com.ictec.cal.Calculator;
import com.ictec.cal.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        //need to have a registry
        try {
            //Create the registry
            Registry myReg = LocateRegistry.createRegistry(55321);
            //Binding the remote object
            Calculator myCal = new MyCalculator();
            myReg.rebind("MyCalculatorServer", myCal);

            //To identify server is running?
            System.out.println("My calculator server is running");
        } catch (RemoteException e) {
            System.out.println("Exception in creating registry....." + e.getMessage());
        }
    }
}
