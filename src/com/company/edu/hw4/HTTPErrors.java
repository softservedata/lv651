package com.company.edu.hw4;

public enum HTTPErrors {
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),
    NOT_ACCEPTABLE(406),
    CONFLICT(409),
    NO_ERROR(0);
    private int code;

    HTTPErrors(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HTTPErrors errorName(int code){
        if(code==401){
            return UNAUTHORIZED;
        }
        if(code==403){
            return FORBIDDEN;
        }
        if(code==404){
            return NOT_FOUND;
        }
        if(code==406){
            return NOT_ACCEPTABLE;
        }
        if(code==407){
            return CONFLICT;
        }
return NO_ERROR;
    }



}
