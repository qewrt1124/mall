package com.macro.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Controller 계층 로그 캡슐화 클래스
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode
public class WebLog {
    /**
     * 작업 설명
     */
    private String description;

    /**
     * 운영 사용자
     */
    private String username;

    /**
     * 운영 시간
     */
    private Long startTime;

    /**
     * 시간이 많이 걸린다
     */
    private Integer spendTime;

    /**
     * 루트 경로
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 요청 유형
     */
    private String method;

    /**
     * IP 주소
     */
    private String ip;

    /**
     * 요청 매개변수
     */
    private Object parameter;

    /**
     * 결과 반환
     */
    private Object result;

}
