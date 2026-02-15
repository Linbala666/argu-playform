package com.argu.playform.service;

import com.argu.playform.dto.product.ProductItemResponse;
import com.argu.playform.dto.product.RecommendPlantingResponse;
import com.argu.playform.dto.product.SaveProductRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    public Long saveProduct(SaveProductRequest request) {
        return request.id() == null ? 101L : request.id();
    }

    public List<ProductItemResponse> listProducts(String keyword, String sort, Integer needFresh) {
        return List.of(
                new ProductItemResponse(101L, "红颜草莓", new BigDecimal("30.00"), "李大拿", 98, List.of("政府认证", "当日采摘"))
        );
    }

    public List<RecommendPlantingResponse> recommendPlanting(String region) {
        return List.of(new RecommendPlantingResponse("水果玉米", "历史数据显示 Q3 季度商超缺口大", "1500 元/亩"));
    }
}
