package com.macro.mall.portal.service;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.model.SmsCouponHistory;
import com.macro.mall.portal.domain.CartPromotionItem;
import com.macro.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 사용자 쿠폰 관리 Service
 * Created by macro on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * 회원이 쿠폰을 추가합니다
     */
    @Transactional
    void add(Long couponId);

    /**
     * 쿠폰 내역 목록 가져오기
     */
    List<SmsCouponHistory> listHistory(Integer useStatus);

    /**
     * 장바구니 정보를 기반으로 사용 가능한 쿠폰 받기
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);

    /**
     * 현재 제품에 대한 쿠폰 받기
     */
    List<SmsCoupon> listByProduct(Long productId);

    /**
     * 사용자 쿠폰 목록 가져오기
     */
    List<SmsCoupon> list(Integer useStatus);
}
