package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 멤버십 브랜드 관심 Repository
 * Created by macro on 2018/8/2.
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {
    /**
     * 회원 ID 및 브랜드 ID를 기반으로 레코드 조회
     */
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 회원 ID와 브랜드 ID를 기준으로 기록이 삭제됩니다.
     */
    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 멤버 ID를 기반으로 레코드 페이지 매김Paginate records based on member ID
     */
    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 구성원 ID를 기준으로 기록이 삭제됩니다
     */
    void deleteAllByMemberId(Long memberId);
}
