package com.argu.playform.controller;

import com.argu.playform.common.ApiResponse;
import com.argu.playform.dto.product.ProductItemResponse;
import com.argu.playform.dto.product.RecommendPlantingResponse;
import com.argu.playform.dto.product.SaveProductRequest;
import com.argu.playform.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ApiResponse<Map<String, Object>> save(@Valid @RequestBody SaveProductRequest request) {
        return ApiResponse.success(Map.of("id", productService.saveProduct(request)));
    }

    @GetMapping("/list")
    public ApiResponse<List<ProductItemResponse>> list(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) String sort,
            @RequestParam(name = "need_fresh", required = false) Integer needFresh) {
        return ApiResponse.success(productService.listProducts(keyword, sort, needFresh));
    }

    @GetMapping("/recommend_planting")
    public ApiResponse<List<RecommendPlantingResponse>> recommendPlanting(@RequestParam String region) {
        return ApiResponse.success(productService.recommendPlanting(region));
    }
}
