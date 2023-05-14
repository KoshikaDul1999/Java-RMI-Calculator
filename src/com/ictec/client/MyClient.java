package com.ictec.client;

import com.ictec.cal.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            //1. Locate the registry
            Registry myReg = LocateRegistry.getRegistry("localhost",55321);

            //2. To locating remote location
            Calculator myCal = (Calculator) myReg.lookup("MyCalculatorServer");

            //3. Invite the method
            int addition = myCal.addTwoIntegers(12,20);
            System.out.println("Addition of two  numbers : " + addition);

            int substraction = myCal.substractTwoIntegers(25, 6);
            System.out.println("Substraction of two numbers : " + substraction);

            int multiplication = myCal.multiplyTwoIntegers(8, 12);
            System.out.println("Multiplication of two numbers : " + multiplication);

            int division = myCal.divideTwoIntegers(64, 0);
            System.out.println("Division of two numbers : " + division);

        } catch (RemoteException e) {
            System.out.println("Exception in client" + e.getMessage());
        } catch (NotBoundException e) {
            System.out.println("Remote object not found" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Exception occur : " + e.getMessage());
        }
    }
}
