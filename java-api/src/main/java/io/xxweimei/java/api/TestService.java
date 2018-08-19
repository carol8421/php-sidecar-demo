package io.xxweimei.java.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PHP-API")
public interface TestService {

    @GetMapping(value = "/api/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String test();

}
