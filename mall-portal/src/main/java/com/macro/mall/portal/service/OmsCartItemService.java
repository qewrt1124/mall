package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 장바구니 관리 Service
 * Created by macro on 2018/8/2.
 */
public interface OmsCartItemService {
    /**
     * 제품이 장바구니에 포함되어 있는지, 수량이 증가했는지, 장바구니에 추가되지 않았는지 확인하십시오.
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * 회원 번호에 따라 장바구니 목록을 가져옵니다.
     */
    List<OmsCartItem> list(Long memberId);

    /**
     * 프로모션 정보가 포함된 장바구니 목록 가져오기
     */
    List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds);

    /**
     * 장바구니의 품목 수량 수정
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * 장바구니에 있는 품목을 대량으로 삭제
     */
    int delete(Long memberId,List<Long> ids);

    /**
     * 제품 사양을 선택하는 데 사용한 장바구니에서 제품 정보를 가져옵니다
     */
    CartProduct getCartProduct(Long productId);

    /**
     * 장바구니에 있는 품목의 사양 수정
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * 장바구니 비우기
     */
    int clear(Long memberId);
}
