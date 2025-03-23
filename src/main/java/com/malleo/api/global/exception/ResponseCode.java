package com.malleo.api.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {
    SUCCESS(200, "요청이 성공했습니다.", HttpStatus.OK),
    BAD_REQUEST(400, "잘못된 요청입니다.", HttpStatus.BAD_REQUEST),
    UNAUTHORIZED(401, "인증이 필요합니다.", HttpStatus.UNAUTHORIZED),
    FORBIDDEN(403, "접근이 거부되었습니다.", HttpStatus.FORBIDDEN),
    NOT_FOUND(404, "요청한 리소스를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    INTERNAL_SERVER_ERROR(500, "서버 내부 오류입니다.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final int code;
    private final String message;
    private final HttpStatus httpStatus;
}
