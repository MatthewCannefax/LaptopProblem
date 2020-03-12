package com.matthewcannefax.java;

public class TestHarnessLaptop {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "m6800");
        Laptop laptop2 = new Laptop("HP", null);

        try {//OUT_OF_STOCK
            LaptopTransaction.sellLaptop(laptop, 50);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//added successfully
            LaptopTransaction.addLaptop(laptop, 100);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());

        }
        try {//Invalid count
            LaptopTransaction.addLaptop(laptop, 0);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//sold successfully
            LaptopTransaction.sellLaptop(laptop, 30);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//serial number missing
            LaptopTransaction.addLaptop(laptop2, 500);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//invalid count
            LaptopTransaction.addLaptop(laptop, -5);
        } catch (TransactionException e) {

            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//added successfully
            LaptopTransaction.addLaptop(laptop, 1000);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());

        }
        try {//invalid count
            LaptopTransaction.sellLaptop(laptop, -20);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//sold successfully
            LaptopTransaction.sellLaptop(laptop, 100);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
        try {//added successfully
            LaptopTransaction.addLaptop(laptop, 720);
        } catch (TransactionException e) {
            System.out.println(e.getErrorCode()+ "Error " + e.getErrorMessage());
        }
    }
}
