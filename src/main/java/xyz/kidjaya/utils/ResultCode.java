package xyz.kidjaya.utils;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ResultCode {
    SUCCESS(true, 20000, "成功"),
    UNKNOWN_REASON(false, 20001, "未知错误");

    private final Boolean success;
    private final Integer code;
    private final String message;

    ResultCode(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}