package com.macro.mall.portal.dao;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.portal.domain.SmsCouponHistoryDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 회원권 수집 기록 관리 사용자 정의Dao
 * Created by macro on 2018/8/29.
 */
public interface SmsCouponHistoryDao {
    /**
     * 쿠폰 내역 세부 정보 보기
     */
    List<SmsCouponHistoryDetail> getDetailList(@Param("memberId") Long memberId);

    /**
     * 지정 회원의 쿠폰 목록 가져오기
     */
    List<SmsCoupon> getCouponList(@Param("memberId") Long memberId, @Param("useStatus")Integer useStatus);
}
