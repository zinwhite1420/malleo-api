package com.malleo.api.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.malleo.api.global.exception.ResponseCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL) // NULL 값 필드는 JSON에서 제외
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseResponse<T> {
    private final boolean success;
    private final int code;
    private final String message;
    private final T data;

    public static BaseResponse<Void> success() {
        return new BaseResponse<>(true, ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), null);
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(true, ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage(), data);
    }

    public static BaseResponse<?> failure(ResponseCode responseCode) {
        return new BaseResponse<>(false, responseCode.getCode(), responseCode.getMessage(), null);
    }
}
