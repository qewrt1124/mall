package com.macro.mall.portal.service;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.portal.domain.PmsPortalProductDetail;
import com.macro.mall.portal.domain.PmsProductCategoryNode;

import java.util.List;

/**
 * Frontian 제품 관리 Service
 * Created by macro on 2020/4/6.
 */
public interface PmsPortalProductService {
    /**
     * 포괄적인 제품 검색
     */
    List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * 모든 제품 범주를 트리 구조로 가져옵니다.
     */
    List<PmsProductCategoryNode> categoryTreeList();

    /**
     * 포그라운드 스토어 세부 정보 가져오기
     */
    PmsPortalProductDetail detail(Long id);
}
