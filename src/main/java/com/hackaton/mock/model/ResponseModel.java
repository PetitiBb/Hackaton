package com.hackaton.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseModel {

    private Object code;
    private Object body;
    private Object contentType;
    private Object verb;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

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

    public ResponseModel(Object code, Object verb, Object contentType, Object body) {
        this.body = body;
        this.code = code;
        this.contentType = contentType;
        this.verb = verb;
    }

    public ResponseModel(Object code, Object verb, Object contentType, Object body, String name) {
        this.body = body;
        this.code = code;
        this.contentType = contentType;
        this.verb = verb;
        this.name = name;
    }
}
