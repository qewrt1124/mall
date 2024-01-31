package com.macro.mall.portal.dao;

import com.macro.mall.model.OmsOrderItem;
import com.macro.mall.portal.domain.OmsOrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 프런트 엔드 주문 관리 사용자 지정 Dao
 * Created by macro on 2018/9/4.
 */
public interface PortalOrderDao {
    /**
     * 주문한 제품의 주문 및 세부 정보를 가져옵니다.
     */
    OmsOrderDetail getDetail(@Param("orderId") Long orderId);

    /**
     * 잠긴 인벤토리 및 pms_sku_stock 테이블의 실제 인벤토리를 수정합니다
     */
    int updateSkuStock(@Param("itemList") List<OmsOrderItem> orderItemList);

    /**
     * 시간 초과 주문 가져오기
     * @param minute 超时时间（分）
     */
    List<OmsOrderDetail> getTimeOutOrders(@Param("minute") Integer minute);

    /**
     * 주문 상태 일괄 수정
     */
    int updateOrderStatus(@Param("ids") List<Long> ids,@Param("status") Integer status);

    /**
     * 취소된 주문에서 재고 잠금 해제
     */
    int releaseSkuStockLock(@Param("itemList") List<OmsOrderItem> orderItemList);

}
