package com.macro.mall.portal.dao;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 프런트 엔드 쇼핑 카트 항목 관리 사용자 지정 Dao
 * Created by macro on 2018/8/2.
 */
public interface PortalProductDao {
    /**
     * 장바구니 정보 가져오기
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 판촉 제품 목록 목록 가져오기
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * 사용 가능한 쿠폰 목록 가져오기
     */
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);
}
