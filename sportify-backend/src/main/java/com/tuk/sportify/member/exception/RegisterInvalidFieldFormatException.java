package com.tuk.sportify.member.exception;

import com.tuk.sportify.global.status_code.ErrorCode;
import com.tuk.sportify.global.exception.InvalidFieldFormatException;

public class RegisterInvalidFieldFormatException extends InvalidFieldFormatException {

    public RegisterInvalidFieldFormatException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause, errorCode);
    }
}
