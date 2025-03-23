package com.malleo.api.global.exception;

import com.malleo.api.common.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<BaseResponse<?>> handleCustomException(CustomException e) {
        return ResponseEntity
                .status(e.getResponseCode().getHttpStatus())
                .body(BaseResponse.failure(e.getResponseCode()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse<?>> handleGenericException(Exception e) {
        return ResponseEntity
                .status(ResponseCode.INTERNAL_SERVER_ERROR.getHttpStatus())
                .body(BaseResponse.failure(ResponseCode.INTERNAL_SERVER_ERROR));
    }
}