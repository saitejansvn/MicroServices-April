package com.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="feignStudent")
public interface Studinter
{
@GetMapping("/msg")
public String data();
}
