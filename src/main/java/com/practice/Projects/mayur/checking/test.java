package com.practice.Projects.mayur.checking;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class test {

  public static void main(String[] args) {

//    Calendar calendar = Calendar.getInstance();
//    System.out.println(calendar);
//    Date date = new Date();
//    System.out.println(date);
//    //ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-07-16T12:48:19.816Z");
//    //ZonedDateTime zonedDateTime = ZonedDateTime.from(date.toInstant());
//    ZonedDateTime zonedDateTime = ZonedDateTime.now();
//    Calendar now = Calendar.getInstance();
//    ZonedDateTime zdt = ZonedDateTime.ofInstant(now.toInstant(), ZoneId.systemDefault());
//    ZonedDateTime zzz = ZonedDateTime.ofInstant(date.toInstant(),ZoneId.of("Asia/Jakarta"));
//    System.out.println(zzz);

    BigDecimal bigDecimal = new BigDecimal(12.56789);

    BigDecimal truncated= bigDecimal.setScale(2,BigDecimal.ROUND_DOWN);

    BigDecimal b1 = new BigDecimal(12.56789);

    MathContext m = new MathContext(4); // 4 precision

    // b1 is rounded using m
    BigDecimal b2 = b1.round(m);

    System.out.println(b2);

    System.out.println(truncated);
  }
}
