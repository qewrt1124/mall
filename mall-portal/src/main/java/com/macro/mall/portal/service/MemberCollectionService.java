package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

/**
 * 회원 상품 수집 관리 Service
 * Created by macro on 2018/8/2.
 */
public interface MemberCollectionService {
    /**
     * 즐겨찾기 추가
     */
    int add(MemberProductCollection productCollection);

    /**
     * 소식 모음 삭제
     */
    int delete(Long productId);

    /**
     * 컬렉션 페이지 매김
     */
    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    /**
     * 컬렉션 세부 정보 보기
     */
    MemberProductCollection detail(Long productId);

    /**
     * 컬렉션 지우기
     */
    void clear();
}
