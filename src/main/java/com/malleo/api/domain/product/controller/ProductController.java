package com.malleo.api.domain.product.controller;

import com.malleo.api.common.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/test")
    public BaseResponse<String> test() {
        return BaseResponse.success("Test");
    }
}
