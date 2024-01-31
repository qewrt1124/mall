package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 회원 검색 기록 관리 Service
 * Created by macro on 2018/8/3.
 */
public interface MemberReadHistoryService {
    /**
     * 검색 기록 생성
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 인터넷 사용 기록을 대량으로 삭제
     */
    int delete(List<String> ids);

    /**
     * 페이지 매김에서 사용자의 검색 기록 가져오기
     */
    Page<MemberReadHistory> list(Integer pageNum, Integer pageSize);

    /**
     * 인터넷 사용 기록 지우기
     */
    void clear();
}
