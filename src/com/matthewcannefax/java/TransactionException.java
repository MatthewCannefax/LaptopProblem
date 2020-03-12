package com.matthewcannefax.java;

public class TransactionException extends Exception {

    private String mErrorCode;
    private String mErrorMessage;

    public TransactionException(String errorMessage, String errorCode){
        super(errorMessage);
        mErrorCode = errorCode;
        mErrorMessage = errorMessage;
    }

    public String getErrorCode(){
        return mErrorCode;
    }


    public String getErrorMessage(){
        return mErrorMessage;
    }


}
