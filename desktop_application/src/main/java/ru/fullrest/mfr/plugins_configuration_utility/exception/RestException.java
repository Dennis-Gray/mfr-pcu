package ru.fullrest.mfr.plugins_configuration_utility.exception;

public class RestException extends Exception {
    public RestException(String message) {
        super(message);
    }

    public RestException(String message, Throwable cause) {
        super(message, cause);
    }
}
