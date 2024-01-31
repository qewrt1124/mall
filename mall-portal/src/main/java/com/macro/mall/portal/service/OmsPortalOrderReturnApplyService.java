package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 프론트 데스크 주문 반품 관리 Service
 * Created by macro on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 신청서 제출
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
