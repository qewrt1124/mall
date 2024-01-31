package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 회원의 상품 컬렉션 Repository
 * Created by macro on 2018/8/2.
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {
    /**
     * 구성원 ID와 상품 ID를 기준으로 기록 검색
     */
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 구성원 ID와 제품 ID를 기준으로 레코드가 삭제됩니다
     */
    int deleteByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 회원 ID를 기준으로 페이지별로 기록을 조회할 수 있습니다
     */
    Page<MemberProductCollection> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 구성원 ID를 기준으로 기록이 삭제됩니다
     */
    void deleteAllByMemberId(Long memberId);
}
