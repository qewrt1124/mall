package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;

import java.util.List;

/**
 * 프론트 데스크 브랜드 관리 Service
 * Created by macro on 2020/5/15.
 */
public interface PmsPortalBrandService {
    /**
     * 추천 브랜드를 얻기 위해 페이지 매김
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 브랜드 세부 정보 보기
     */
    PmsBrand detail(Long brandId);

    /**
     * 브랜드 관련 제품에 대한 페이지 매김
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
