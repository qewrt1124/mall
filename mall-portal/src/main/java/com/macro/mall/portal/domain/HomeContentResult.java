package com.macro.mall.portal.domain;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsBrand;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsHomeAdvertise;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 홈페이지 컨텐츠는 정보 캡슐화를 반환합니다
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeContentResult {
    @ApiModelProperty("轮播广告") //슬라이드 광고
    private List<SmsHomeAdvertise> advertiseList;
    @ApiModelProperty("推荐品牌") //브랜드 추천
    private List<PmsBrand> brandList;
    @ApiModelProperty("当前秒杀场次") //현재 스파이크 수
    private HomeFlashPromotion homeFlashPromotion;
    @ApiModelProperty("新品推荐") //신제품 추천
    private List<PmsProduct> newProductList;
    @ApiModelProperty("人气推荐") //인기 있는
    private List<PmsProduct> hotProductList;
    @ApiModelProperty("推荐专题") //추천 주제
    private List<CmsSubject> subjectList;
}
