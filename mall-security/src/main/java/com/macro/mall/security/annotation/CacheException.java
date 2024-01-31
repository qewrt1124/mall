package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * 사용자 지정 캐시된 예외 주석, 예외를 throw하는 메서드에 의해 캐시됩니다.
 * Created by macro on 2020/3/17.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
