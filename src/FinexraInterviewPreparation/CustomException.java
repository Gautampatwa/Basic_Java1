package FinexraInterviewPreparation;

import java.util.Set;
public class CustomException extends RuntimeException {
    private String errorCode;

    public CustomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
