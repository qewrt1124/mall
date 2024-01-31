package com.macro.mall.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 제품에 대한 속성 정보 검색
 * Created by macro on 2018/6/27.
 */
@Data
@EqualsAndHashCode
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //속성 값
    @Field(type = FieldType.Keyword)
    private String value;
    //속성 매개변수: 0-> 스펙 및 1-> 매개변수
    private Integer type;
    //속성의 이름
    @Field(type=FieldType.Keyword)
    private String name;
}
