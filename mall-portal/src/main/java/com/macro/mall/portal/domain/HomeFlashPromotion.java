package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 홈페이지 플래시 세일의 정보가 캡슐화되어 있습니다
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class HomeFlashPromotion {
    @ApiModelProperty("本场开始时间") //게임 시작 시간
    private Date startTime;
    @ApiModelProperty("本场结束时间") //세션의 종료 시간
    private Date endTime;
    @ApiModelProperty("下场开始时间") //종료 시작 시간
    private Date nextStartTime;
    @ApiModelProperty("下场结束时间") //종료 시간
    private Date nextEndTime;
    @ApiModelProperty("属于该秒杀活动的商品") //이 라이트닝 딜에 속하는 제품
    private List<FlashPromotionProduct> productList;
}
