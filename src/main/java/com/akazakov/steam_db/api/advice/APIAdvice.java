package com.akazakov.steam_db.api.advice;

import com.akazakov.steam_db.dto.ErrorDTO;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;
import java.util.UUID;

@RestControllerAdvice
@Slf4j
public class APIAdvice {
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO handleEntityNotFoundException(EntityNotFoundException e) {
        ErrorDTO errorDTO = ErrorDTO.builder()
                .uuid(UUID.randomUUID())
                .errorText(e.getMessage())
                .time(ZonedDateTime.now())
                .build();

        log.warn(errorDTO.toString());

        return errorDTO;
    }
}
