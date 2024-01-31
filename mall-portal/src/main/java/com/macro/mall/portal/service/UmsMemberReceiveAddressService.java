package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMemberReceiveAddress;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 사용자 주소 관리 Service
 * Created by macro on 2018/8/28.
 */
public interface UmsMemberReceiveAddressService {
    /**
     * 배송지 주소 추가
     */
    int add(UmsMemberReceiveAddress address);

    /**
     * 배송지 주소 삭제
     * @param id 주소 테이블의 ID입니다
     */
    int delete(Long id);

    /**
     * 배송지 주소 수정
     * @param id 주소 테이블의 ID입니다
     * @param address 수정된 배송 주소 정보
     */
    @Transactional
    int update(Long id, UmsMemberReceiveAddress address);

    /**
     * 현재 사용자의 배송 주소를 반환합니다.
     */
    List<UmsMemberReceiveAddress> list();

    /**
     * 주소 세부정보 가져오기
     * @param id 주소 ID
     */
    UmsMemberReceiveAddress getItem(Long id);
}
