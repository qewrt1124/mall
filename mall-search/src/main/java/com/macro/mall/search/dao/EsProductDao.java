package com.macro.mall.search.dao;

import com.macro.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 제품 관리 사용자 지정 검색Search for product management customization Dao
 * Created by macro on 2018/6/19.
 */
public interface EsProductDao {
    /**
     * 지정된 ID로 검색 제품을 가져옵니다.
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
