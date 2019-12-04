package com.sxh.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 一池春水倾半城
 * @date 2019/12/3
 */
public class DateUtils {

    public static Date addDays(Integer day) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }
}
