package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsProductRelatedInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 제품 관리 검색 Service
 * Created by macro on 2018/6/19.
 */
public interface EsProductService {
    /**
     * 데이터베이스의 모든 항목을 ES로 가져오기
     */
    int importAll();

    /**
     * ID를 기준으로 항목 삭제
     */
    void delete(Long id);

    /**
     * ID를 기반으로 제품 만들기
     */
    EsProduct create(Long id);

    /**
     * 대량으로 항목 삭제
     */
    void delete(List<Long> ids);

    /**
     * 키워드를 기반으로 이름 또는 부제목 검색
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 키워드를 기반으로 이름 또는 부제목으로 복합 검색어 검색Search for a compound query by name or subtitle based on keyword
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize,Integer sort);

    /**
     * 제품 ID를 기반으로 관련 제품 추천
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * 검색어 관련 브랜드, 카테고리, 속성 가져오기
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
