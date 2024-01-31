package com.macro.mall.portal.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 도구 클래스
 * Created by macro on 2019/1/29.
 */
public class DateUtil {

    /**
     * Date 형식의 time에서 날짜 부분을 추출합니다.
     */
    public static Date getDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    /**
     * Date 형식의 time에서 시간 부분을 추출합니다.
     */
    public static Date getTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, 1970);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }
}
