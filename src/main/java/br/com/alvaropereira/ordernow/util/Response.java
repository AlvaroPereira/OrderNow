package br.com.alvaropereira.ordernow.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;

public class Response {
    public static ResponseEntity build(Boolean success, String message, Object data, HttpStatus httpStatus) {
        var linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("success", success);
        linkedHashMap.put("message", message);
        if(data != null) linkedHashMap.put("data", data);
        return new ResponseEntity(linkedHashMap, httpStatus);
    }
}
