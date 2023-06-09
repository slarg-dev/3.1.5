package ru.web.spring.boot_security.demo.exception;

import ru.web.spring.boot_security.demo.model.User;

public class UserDataIntegrityViolationException extends RuntimeException {
    private final User user;
    private final String message;

    public UserDataIntegrityViolationException(User user, String message) {

        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String getMessage() {
        return message;
    }
}