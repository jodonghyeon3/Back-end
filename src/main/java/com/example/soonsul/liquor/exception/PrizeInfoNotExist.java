package com.example.soonsul.liquor.exception;

import com.example.soonsul.response.error.ErrorCode;
import lombok.Getter;

@Getter
public class PrizeInfoNotExist extends RuntimeException {

    private final ErrorCode errorCode;

    public PrizeInfoNotExist(String message, ErrorCode errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
