package net.javaguides.springboot_restful_webservices.exception;

public class EmailAlreadyExistsException extends RuntimeException {

    private String message;

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
