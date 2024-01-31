package com.macro.mall.portal.config;

import com.macro.mall.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 쇼핑몰 보안 모듈
 * Created by macro on 2019/11/5.
 */
@Configuration
public class MallSecurityConfig {

    @Autowired
    private UmsMemberService memberService;

    @Bean
    public UserDetailsService userDetailsService() {
        //로그인한 사용자 정보 가져오기
        return username -> memberService.loadUserByUsername(username);
    }
}
