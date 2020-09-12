package com.dason.jdk8.date;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 * java8日期demo
 *
 * @author chendecheng
 * @since 2020-09-12 16:35
 */
public class Java8LocalDateTest {

    public static void main(String[] args) {

        // 日期的相关操作------------------------------------------------------start
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2020, 9, 19);
        System.out.println("当前日期" + localDate.toString());

        // 日期运算
        // 当前日期对象+1
        LocalDate localDate1 = localDate.plusDays(1L);
        System.out.println("当前日期+1" + localDate1.toString());

        // 获取当前月份
        Month month = localDate.getMonth();
        System.out.println("当前月份" + month.getValue());

        // 获取这个日期为这周第几天
        DayOfWeek sunday = LocalDate.parse("2019-06-12").getDayOfWeek();
        System.out.println("这个日期为这周第几天" + sunday.getValue());
        // 获取这个日期为这个月第几天
        int twelve = LocalDate.parse("2016-09-12").getDayOfMonth();
        System.out.println("这个日期为这个月第几天" + twelve);

        // 判断日期的先后
        boolean notBefore = LocalDate.parse("2019-06-12").isBefore(LocalDate.parse("2019-06-11"));
        boolean isAfter = LocalDate.parse("2019-06-12").isAfter(LocalDate.parse("2019-06-11"));

        // 日期的相关操作-------------------------------------------------------end

        // 时间的相关操作------------------------------------------------------start
        // 创建方式
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.parse("09:56");
        LocalTime localTime2 = LocalTime.of(8, 45);

        // 时间基础操作
        localTime.plusHours(9);
        localTime.getHour();
        boolean before = localTime.isBefore(localTime1);
        boolean after = localTime.isAfter(localTime2);

        // 时间的相关操作-------------------------------------------------------end

        // 日期时间的相关操作------------------------------------------------------start
        // 时间创建
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.parse("2019-02-20T06:30:00");
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 9, 13, 13, 13, 12);

        // 基本操作
        Month month1 = localDateTime.getMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        LocalDateTime localDateTime3 = localDateTime.plusDays(12L);
        // 天数减少10
        LocalDateTime localDateTime4 = localDateTime.minusDays(10L);
        // 其他的基础方法都是类似
        boolean before1 = localDateTime.isBefore(localDateTime2);

        // 日期时间的相关操作------------------------------------------------------end

        // 时区日期时间的相关操作------------------------------------------------------start
        // 获取亚洲/上海时区
        ZoneId zoneId = ZoneId.of("Aisa/Shanghai");
        // 获取所有的时区：
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        // 将某个时间转换成特定时区的时间
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        // 时区日期时间的相关操作------------------------------------------------------end

        // Period时间区间（年月日）相关操作------------------------------------------------------start
        // 创建使用
        Period period = Period.between(localDate1, localDate2);
        System.out.println("两个时间之间的差值为：" + period.getDays());

        // Period时间区间（年月日）相关操作------------------------------------------------------end

        // Duration时间区间（秒/纳秒）相关操作------------------------------------------------------start
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println("查找localDateTime1和localDateTime2之间的时间差" + duration.toString());

        // Duration时间区间（秒/纳秒）相关操作------------------------------------------------------end

        // Date跟LocalDateTime的转换 ------------------------start
        // 将Date转换成 LocalDateTime
        Date date = new Date();
        LocalDateTime localDateTime5 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        // 将Calendar转换成LocalDateTime
        Calendar calendar = Calendar.getInstance();
        LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());

        // 将LocalDateTime转换成Date 需要指定时区的，因为Date是没有时区概念
        ZoneId zoneId2 = ZoneId.systemDefault();
        LocalDateTime localDateTime8 = LocalDateTime.now();
        ZonedDateTime zdt = localDateTime8.atZone(zoneId2);
        Date date5 = Date.from(zdt.toInstant());

        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Date = " + date5);

        // Date跟LocalDateTime的转换 ------------------------end

    }

}
