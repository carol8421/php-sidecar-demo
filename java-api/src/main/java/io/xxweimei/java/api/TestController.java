package io.xxweimei.java.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping(value = "/api/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String javaApiTest() {
        return "This is java response";
    }

    @GetMapping(value = "/api/call_php", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String phpApiTest() {
        return testService.test();
    }

}
