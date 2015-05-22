package com.cloudsole.angular.model;


public class ResponseModel {

    private Object code;
    private String body;
    private Object contentType;
    private Object verb;

    public Object getVerb(){return verb;}

    public void setVerb(Object verb){this.verb = verb;}

    public Object getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ResponseModel(Object code, Object verb, Object contentType, String body) {
        this.body = body;
        this.code = code;
        this.contentType = contentType;
        this.verb = verb;
    }
}
