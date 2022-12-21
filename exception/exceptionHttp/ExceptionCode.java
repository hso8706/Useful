package com.soloProject.exception.exceptionHttp;

import lombok.Getter;

public enum ExceptionCode {
    TODOS_NOT_FOUND(404, "Todos not found"),
    TODOS_EXISTS(409, "Todos already exists"),
    MEMBER_NOT_FOUND(404, "Member not found"),
    MEMBER_EMAIL_EXIST(409, "Member already exists"),
    MEMBER_PASSWORD_EXIST(409, "Password already exists");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
