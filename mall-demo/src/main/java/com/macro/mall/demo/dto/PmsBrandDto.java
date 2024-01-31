package com.macro.mall.demo.dto;

import com.macro.mall.demo.validator.FlagValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 브랜드 전달 매개 변수
 * Created by macro on 2019/4/8.
 */
@ApiModel(value = "PmsBrandDto")
public class PmsBrandDto {
    //상품명
    @ApiModelProperty(value = "品牌名称", required = true)
    //이름은 비워 둘 수 없습니다
    @NotNull(message = "名称不能为空")
    private String name;
    //브랜드 이니셜
    @ApiModelProperty(value = "品牌首字母",required = true)
    //첫 글자는 비워 둘 수 없습니다
    @NotNull(message = "首字母不能为空")
    private String firstLetter;
    //필드 정렬
    @ApiModelProperty(value = "排序字段")
    //최소 정렬은 0입니다
    @Min(value = 0, message = "排序最小为0")
    private Integer sort;
    //메이커인지 아닌지
    @ApiModelProperty(value = "是否为厂家制造商")
    //제조업체 상태가 잘못되었습니다.
    @FlagValidator(value = {"0","1"}, message = "厂家状态不正确")
    private Integer factoryStatus;
    //표시 여부
    @ApiModelProperty(value = "是否进行显示")
    //표시 상태가 잘못되었습니다.
    @FlagValidator(value = {"0","1"}, message = "显示状态不正确")
    private Integer showStatus;
    //브랜드 로고
    @ApiModelProperty(value = "品牌logo")
    private String logo;
    //브랜드의 큰 그림
    @ApiModelProperty(value = "品牌大图")
    private String bigPic;
    //브랜드 스토리
    @ApiModelProperty(value = "品牌故事")
    private String brandStory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
