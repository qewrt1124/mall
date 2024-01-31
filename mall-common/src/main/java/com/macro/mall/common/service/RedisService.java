package com.macro.mall.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Redis 운영 서비스
 * Created by macro on 2020/3/3.
 */
public interface RedisService {

    /**
     * 속성 저장
     */
    void set(String key, Object value, long time);

    /**
     * 속성 저장
     */
    void set(String key, Object value);

    /**
     * 속성 가져오기
     */
    Object get(String key);

    /**
     * 속성 삭제
     */
    Boolean del(String key);

    /**
     * 일괄적으로 속성 삭제
     */
    Long del(List<String> keys);

    /**
     * 만료 시간 설정
     */
    Boolean expire(String key, long time);

    /**
     * 만료 시간 가져오기
     */
    Long getExpire(String key);

    /**
     * 속성이 존재하는지 확인
     */
    Boolean hasKey(String key);

    /**
     * 델타만큼 증가
     */
    Long incr(String key, long delta);

    /**
     * 델타만큼 감소
     */
    Long decr(String key, long delta);

    /**
     * 해시 구조에서 속성 가져오기
     */
    Object hGet(String key, String hashKey);

    /**
     * 해시 구조에 속성 추가
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * 해시 구조에 속성 추가
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * 전체 해시 구조를 직접 가져옵니다.
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * 전체 Hash 구조를 직접 설정
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * 전체 Hash 구조를 직접 설정
     */
    void hSetAll(String key, Map<String, ?> map);

    /**
     * 해시 구조에서 속성 삭제
     */
    void hDel(String key, Object... hashKey);

    /**
     * 해시 구조에 속성이 존재하는지 확인
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * 해시 구조의 속성 증가
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * 해시 구조의 속성 감소
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * Set 구조 가져오기
     */
    Set<Object> sMembers(String key);

    /**
     * Set 구조에 속성 추가
     */
    Long sAdd(String key, Object... values);

    /**
     * Set 구조에 속성 추가
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * Set의 속성인지 여부
     */
    Boolean sIsMember(String key, Object value);

    /**
     * Set 구조의 길이를 가져옵니다.
     */
    Long sSize(String key);

    /**
     * Set 구조에서 속성 삭제
     */
    Long sRemove(String key, Object... values);

    /**
     * List 구조의 속성을 가져옵니다.
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * List 구조의 길이를 가져옵니다.
     */
    Long lSize(String key);

    /**
     * 인덱스를 기반으로 List의 속성 가져오기
     */
    Object lIndex(String key, long index);

    /**
     * List 구조에 속성 추가
     */
    Long lPush(String key, Object value);

    /**
     * List 구조에 속성 추가
     */
    Long lPush(String key, Object value, long time);

    /**
     * 일괄적으로 List 구조에 속성 추가
     */
    Long lPushAll(String key, Object... values);

    /**
     * 일괄적으로 List 구조에 속성 추가
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * List 구조에서 속성 제거
     */
    Long lRemove(String key, long count, Object value);
}