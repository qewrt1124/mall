package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 주문이 생성될 때 전달되는 매개 변수
 * Created by macro on 2018/8/30.
 */
@Data
@EqualsAndHashCode
public class OrderParam {
    @ApiModelProperty("收货地址ID") //배송지 주소 ID
    private Long memberReceiveAddressId;
    @ApiModelProperty("优惠券ID") //쿠폰 ID
    private Long couponId;
    @ApiModelProperty("使用的积分数") //사용된 포인트 수
    private Integer useIntegration;
    @ApiModelProperty("支付方式") //지불 방법
    private Integer payType;
    @ApiModelProperty("被选中的购物车商品ID") //선택한 카트의 품목 ID
    private List<Long> cartIds;
}
