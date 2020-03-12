package com.matthewcannefax.java;

public class Laptop {

    private String mSerialNumber;
    private String mSKU;
    private int mLaptopCount = 0;

    public Laptop(String serialNumber, String sku){
        mSerialNumber = serialNumber;
        mSKU = sku;
    }

    public String getSerialNumber(){
        return mSerialNumber;
    }

    public String getSKU(){
        return mSKU;
    }

    public void setLaptopCount(int value){
        mLaptopCount = value;
    }

    public int getLaptopCount(){
        return mLaptopCount;
    }
}
