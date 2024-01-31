package com.macro.mall.portal.domain;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductFullReduction;
import com.macro.mall.model.PmsProductLadder;
import com.macro.mall.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 프로모션 제품 정보(SKU, 할인 및 할인 포함)
 * Created by macro on 2018/8/27.
 */
@Getter
@Setter
public class PromotionProduct extends PmsProduct {
    //제품 재고 정보
    private List<PmsSkuStock> skuStockList;
    //할인된 정보
    private List<PmsProductLadder> productLadderList;
    //상품의 전체 감소에 대한 정보
    private List<PmsProductFullReduction> productFullReductionList;
}
