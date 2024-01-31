package com.macro.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 동적 권한 관련 비즈니스 API
 * Created by macro on 2020/2/7.
 */
public interface DynamicSecurityService {
    /**
     * 자원의 ANT 와일드카드와 자원의 해당 맵을 로드합니다
     */
    Map<String, ConfigAttribute> loadDataSource();
}
