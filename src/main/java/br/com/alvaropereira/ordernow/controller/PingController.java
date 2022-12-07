package br.com.alvaropereira.ordernow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
public class PingController {

    @GetMapping("/v1/ping")
    public ResponseEntity pong() {

        var linkedHashMap = new LinkedHashMap<String, Object>();
        var hashMap = new HashMap<String, Object>();
        hashMap.put("pong", true);

        linkedHashMap.put("success", true);
        linkedHashMap.put("message", "Success");
        linkedHashMap.put("data", hashMap);

        return new ResponseEntity(linkedHashMap, HttpStatus.OK);
    }

}
