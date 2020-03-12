package com.matthewcannefax.java;

public class LaptopTransaction {

    public static void addLaptop(Laptop laptop, int count) throws TransactionException {
        if(laptop.getSKU() == null){
            throw new TransactionException("Serial number missing", "SERIAL_NUMBER_MISSING: ");
        }

        if(count <= 0){
            throw new TransactionException("Count should be greater than zero", "INVALID_COUNT: ");
        }else{
            laptop.setLaptopCount(count);
            System.out.println("Laptops successfully added.");
        }

    }

    public static void sellLaptop(Laptop laptop, int count) throws TransactionException {
        if(laptop.getSerialNumber().equals("") || laptop.getSerialNumber() == null){
            throw new TransactionException("Serial number missing", "SERIAL_NUMBER_MISSING: ");
        }

        if(count <= 0){
            throw new TransactionException("Count should be greater than zero", "INVALID_COUNT: ");
        }else if(laptop.getLaptopCount() == 0 || count > laptop.getLaptopCount()){
            throw new TransactionException("Out of Stock ", "OUT_OF_STOCK: ");
        }else {
            laptop.setLaptopCount(laptop.getLaptopCount() - count);
            System.out.println("Laptops successfully sold.");
        }

    }
}
