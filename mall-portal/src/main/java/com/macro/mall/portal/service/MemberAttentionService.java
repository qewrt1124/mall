package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;

/**
 * 멤버십 브랜드는 관리에 중점을 둡니다. Service
 * Created by macro on 2018/8/2.
 */
public interface MemberAttentionService {
    /**
     * 팔로우 추가
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 언팔로우
     */
    int delete(Long brandId);

    /**
     * 사용자 관심 목록 가져오기
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * 사용자의 팔로잉에 대한 세부 정보 가져오기
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * 관심 목록 지우기
     */
    void clear();
}
