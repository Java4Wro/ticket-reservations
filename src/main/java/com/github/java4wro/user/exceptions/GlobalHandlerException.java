package com.github.java4wro.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalHandlerException {

    @ExceptionHandler(EmailExistException.class)
    @ResponseBody
    public ResponseEntity<String> handleEmailExistException (EmailExistException e){
        return new ResponseEntity<>
                (String.format("User with this email: %s already exist", e.getEmail()),
                        HttpStatus.BAD_REQUEST);
    }
}
