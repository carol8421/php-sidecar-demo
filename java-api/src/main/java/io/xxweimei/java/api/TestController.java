package io.xxweimei.java.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> test() {
        List<String> res = new ArrayList<>(2);
        res.add("this");
        res.add(" is ");
        return res;
    }
}
