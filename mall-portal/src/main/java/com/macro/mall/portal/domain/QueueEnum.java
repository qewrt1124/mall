package com.macro.mall.portal.domain;

import lombok.Getter;

/**
 * 메시지 큐 열거형 클래스(Message queue enumeration class)
 * Created by macro on 2018/9/14.
 */
@Getter
public enum QueueEnum {
    /**
     * 메시지 알림 큐
     */
    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    /**
     * TTL 대기열에 알림이 전송됩니다.
     */
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    /**
     * 이름 바꾸기
     */
    private final String exchange;
    /**
     * 대기열 이름
     */
    private final String name;
    /**
     * 라우팅 키
     */
    private final String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
