package com.macro.mall.common.exception;

import com.macro.mall.common.api.IErrorCode;

/**
 * 다양한 API 예외를 발생시키는 데 사용되는 어설션 처리 클래스
 * Created by macro on 2020/2/27.
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
