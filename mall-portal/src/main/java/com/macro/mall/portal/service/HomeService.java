package com.macro.mall.portal.service;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * 홈페이지 콘텐츠 관리 Service
 * Created by macro on 2019/1/28.
 */
public interface HomeService {

    /**
     * 홈페이지 콘텐츠 가져오기
     */
    HomeContentResult content();

    /**
     * 홈페이지 제품 추천
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 제품 범주 가져오기
     * @param parentId 0: 첫 번째 수준 분류를 가져오고, 기타: 지정된 두 번째 수준 분류를 가져옵니다.
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 페이지 매김으로 주제 범주별로 주제 가져오기
     * @param cateId 주제별 범주 ID
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);

    /**
     * 인기 있는 추천 제품을 얻기 위해 페이지를 매깁니다.
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 페이지를 매겨 새 제품 추천 받기
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);
}
