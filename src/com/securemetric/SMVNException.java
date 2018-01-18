package com.securemetric;

public class SMVNException extends Throwable{

    private static final long serialVersionUID = 1L;
    private String errorMessage;
    private long errorCode;
    
    public SMVNException(String errorMessage, long errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
    
    public SMVNException(Throwable ex)
    {
        if (SMVNException.class.isInstance(ex))
        {
            this.errorMessage = ((SMVNException) ex).getErrorMessage();
        }
        else
        {
            this.errorMessage = ex.getLocalizedMessage();
        }
    }

    
    public String getErrorMessage() {
        return errorMessage;
    }

    
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    public long getErrorCode() {
        return errorCode;
    }

    
    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }
    
    public String printError(){
        return this.errorMessage + " - Error code = " + this.errorCode;
    }
    
    
}
