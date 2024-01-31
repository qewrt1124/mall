package com.macro.mall.portal.domain;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.model.SmsCouponHistory;
import com.macro.mall.model.SmsCouponProductCategoryRelation;
import com.macro.mall.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 쿠폰 수령 내역 (쿠폰 정보 및 소속 포함)
 * Created by macro on 2018/8/29.
 */
@Getter
@Setter
public class SmsCouponHistoryDetail extends SmsCouponHistory {
    @ApiModelProperty("相关优惠券信息") //관련 쿠폰 정보
    private SmsCoupon coupon;
    @ApiModelProperty("优惠券关联商品") //쿠폰 관련 상품
    private List<SmsCouponProductRelation> productRelationList;
    @ApiModelProperty("优惠券关联商品分类") //쿠폰은 제품 범주와 연결되어 있습니다.
    private List<SmsCouponProductCategoryRelation> categoryRelationList;
}
