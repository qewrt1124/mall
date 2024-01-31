package com.macro.mall.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 글로벌 도메인 간 구성 구성
 * Created by macro on 2019/7/27.
 */
@Configuration
public class GlobalCorsConfig {

    /**
     * 도메인 간 통화를 허용하는 필터
     */
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //모든 도메인 이름은 출처 간 호출을 할 수 있습니다
        config.addAllowedOriginPattern("*");
        //cookie가 국경을 넘어 전송되도록 허용
        config.setAllowCredentials(true);
        //원래 헤더 정보를 모두 해제합니다.
        config.addAllowedHeader("*");
        //모든 요청 메서드는 도메인 간에 호출할 수 있습니다
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
