package co.edu.cesde.presentation.advice;

import co.edu.cesde.application.exception.ResourceAreadyExistsExeception;
import co.edu.cesde.application.exception.ResourceConflicException;
import co.edu.cesde.application.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceAreadyExistsExeception.class)
    public ResponseEntity<String> handleResourceAlreadyExists(ResourceAreadyExistsExeception e){
        String message = e.getCause()!=null? e.getCause().getMessage() : e.getMessage();
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(message);

    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotfoundException(ResourceNotFoundException e){
        String message = e.getCause()!=null? e.getCause().getMessage() : e.getMessage();
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(message);

    }

    @ExceptionHandler(ResourceConflicException.class)
    public ResponseEntity<String> handleResourceConflicException(ResourceConflicException e){
        String message = e.getCause()!=null? e.getCause().getMessage() : e.getMessage();
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(message);

    }
}
