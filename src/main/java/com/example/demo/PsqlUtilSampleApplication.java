package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PsqlUtilSampleApplication extends SpringBootServletInitializer {

    @Value("${message}")
    private String message;
    
    public static void main(String[] args) {
        SpringApplication.run(PsqlUtilSampleApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PsqlUtilSampleApplication.class);
    }

    @RequestMapping(value = "nagap", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getSomething() {
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("ccccc");

        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "nagap2", method = RequestMethod.GET)
    public ResponseEntity<List<Map<String, String>>> getSomething2() {
        List<Map<String, String>> list = new ArrayList<>();
        list.add(Map.of("key1", message, "key4", "val4"));
        list.add(Map.of("key2", "val2"));
        list.add(Map.of("key3", "val3"));

        // TODO Map.ofで作ったMapインスタンスはImmutable
        //        Map<String, String> map = list.get(1);
        //        map.clear();

        return ResponseEntity.ok(list);
    }

}
