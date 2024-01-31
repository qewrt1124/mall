package com.macro.mall.portal.domain;

import com.macro.mall.model.UmsIntegrationConsumeSetting;
import com.macro.mall.model.UmsMemberReceiveAddress;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 승인 정보 캡슐화
 * Created by macro on 2018/8/30.
 */
@Getter
@Setter
public class ConfirmOrderResult {
    @ApiModelProperty("包含优惠信息的购物车信息") //제품이 포함된 장바구니 정보
    private List<CartPromotionItem> cartPromotionItemList;
    @ApiModelProperty("用户收货地址列表") //사용자 배송 주소 목록
    private List<UmsMemberReceiveAddress> memberReceiveAddressList;
    @ApiModelProperty("用户可用优惠券列表") //사용자가 사용할 수 있는 쿠폰 목록
    private List<SmsCouponHistoryDetail> couponHistoryDetailList;
    @ApiModelProperty("积分使用规则") //포인트 사용 규칙
    private UmsIntegrationConsumeSetting integrationConsumeSetting;
    @ApiModelProperty("会员持有的积分") //회원이 보유한 포인트
    private Integer memberIntegration;
    @ApiModelProperty("计算的金额") //계산된 금액
    private CalcAmount calcAmount;

    @Getter
    @Setter
    public static class CalcAmount{
        @ApiModelProperty("订单商品总金额") //총 주문 금액
        private BigDecimal totalAmount;
        @ApiModelProperty("运费") //화물
        private BigDecimal freightAmount;
        @ApiModelProperty("活动优惠") //이벤트 제안
        private BigDecimal promotionAmount;
        @ApiModelProperty("应付金额") //미납 금액
        private BigDecimal payAmount;
    }
}
