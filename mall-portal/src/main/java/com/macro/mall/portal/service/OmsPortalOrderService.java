package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 프론트 데스크 주문 관리 Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * 사용자의 장바구니 정보를 기반으로 바우처 생성
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);

    /**
     * 제출 정보를 기반으로 주문 생성
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * 결제 성공 후 콜백
     */
    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

    /**
     * 타임아웃 주문 자동 취소
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * 단일 시간 초과 주문 취소
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 주문을 취소하기 위해 지연 메시지 보내기
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * 영수증 확인
     */
    void confirmReceiveOrder(Long orderId);

    /**
     * 페이지 매김으로 사용자 주문 가져오기
     */
    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    /**
     * 주문 ID를 기반으로 주문 세부 정보 가져오기
     */
    OmsOrderDetail detail(Long orderId);

    /**
     * 사용자가 주문 ID를 기준으로 주문을 삭제합니다
     */
    void deleteOrder(Long orderId);
}
