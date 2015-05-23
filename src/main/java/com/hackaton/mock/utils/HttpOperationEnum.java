package com.hackaton.mock.utils;

public enum HttpOperationEnum {
    PUT("PUT"),POST("POST") ,DELETE("DELETE"), GET("GET"), PATCH("PATCH"), HEAD("HEAD");

    HttpOperationEnum(String value) {
        this.value = value;
    }

    private String value;
    public String getValue(){
        return value;
    }
}
