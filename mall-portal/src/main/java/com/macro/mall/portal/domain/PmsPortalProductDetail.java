package com.macro.mall.portal.domain;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 프론트엔드 제품 세부 정보
 * Created by macro on 2020/4/6.
 */
@Getter
@Setter
public class PmsPortalProductDetail{
    @ApiModelProperty("商品信息") //제품 정보
    private PmsProduct product;
    @ApiModelProperty("商品品牌") //제품 브랜딩
    private PmsBrand brand;
    @ApiModelProperty("商品属性与参数") //제품 속성 및 매개 변수
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("手动录入的商品属性与参数值") //수동으로 입력된 제품 속성 및 파라미터 값
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("商品的sku库存信息") //상품에 대한 SKU 재고 정보
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品阶梯价格设置") //상품 계층화 가격 설정
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品满减价格设置") //제품 가격을 완전 할인으로 설정
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品可用优惠券") //제품에 대한 쿠폰을 사용할 수 있습니다.
    private List<SmsCoupon> couponList;
}
