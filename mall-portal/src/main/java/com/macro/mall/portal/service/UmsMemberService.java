package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * 회원관리 Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {
    /**
     * 사용자 이름을 기반으로 회원 확보
     */
    UmsMember getByUsername(String username);

    /**
     * 회원번호 기준 회원가입
     */
    UmsMember getById(Long id);

    /**
     * 사용자 등록
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * 인증 코드 생성
     */
    String generateAuthCode(String telephone);

    /**
     * 비밀번호 변경
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * 현재 로그인한 구성원 가져오기
     */
    UmsMember getCurrentMember();

    /**
     * 회원 ID를 기준으로 멤버십 포인트 수정
     */
    void updateIntegration(Long id,Integer integration);


    /**
     * 사용자 정보 얻기
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 토큰을 받으려면 로그인하십시오.
     */
    String login(String username, String password);

    /**
     * 토큰 새로 고침
     */
    String refreshToken(String token);
}
