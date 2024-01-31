package com.macro.mall.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Swagger 사용자 정의 구성
 * Created by macro on 2020/7/16.
 */
@Data
@EqualsAndHashCode
@Builder
public class SwaggerProperties {
    /**
     * API 문서 생성 기본 경로
     */
    private String apiBasePackage;
    /**
     * 로그인 인증 활성화 여부
     */
    private boolean enableSecurity;
    /**
     * 문서 제목
     */
    private String title;
    /**
     * 문서 설명
     */
    private String description;
    /**
     * 문서 버전
     */
    private String version;
    /**
     * 문서 담당자 이름
     */
    private String contactName;
    /**
     * 문서 연락처 URL
     */
    private String contactUrl;
    /**
     * 문서 연락처 이메일
     */
    private String contactEmail;
}
