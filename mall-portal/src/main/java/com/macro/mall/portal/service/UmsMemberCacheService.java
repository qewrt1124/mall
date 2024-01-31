package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;

/**
 * 회원 정보 캐싱 사업
 * Created by macro on 2020/3/14.
 */
public interface UmsMemberCacheService {
    /**
     * 구성원 사용자 캐시 삭제
     */
    void delMember(Long memberId);

    /**
     * 구성원 사용자 캐시 가져오기
     */
    UmsMember getMember(String username);

    /**
     * 구성원 사용자 캐싱 설정
     */
    void setMember(UmsMember member);

    /**
     * 인증 코드 설정
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 인증 코드 받기
     */
    String getAuthCode(String telephone);
}
