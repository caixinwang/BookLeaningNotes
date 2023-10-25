package corejavaI.C4;

import java.time.LocalDate;

public class Code4_2_2 {//LocalDate类

    /**
     * Java设计者将时间和时间点分开。时间点是Date类，日历法是LocalDate类。
     *
     */

    public static void main(String[] args) {
        //不要自己去调用LocalDate类的构造器，去使用静态工厂方法，它帮你调用构造器！
        //LocalDate类有一个of(int year,int month,int day)和一个now()方法
        LocalDate localDate = LocalDate.of(2022, 6, 14);
        System.out.println(localDate.getYear());//得到年
        System.out.println(localDate.getMonthValue());//月
        System.out.println(localDate.getDayOfMonth());//日

        //注意LocalDate的实例方法plusDays()会产生一个新的LocalDate对象，原来的对象不做改动。
        LocalDate otherDay = localDate.plusDays(5);
        System.out.printf(otherDay.getYear()+"-"+ otherDay.getMonthValue()+"-"+ otherDay.getDayOfMonth()+"\n");

        //得到一个DayOfWeek对象
        System.out.println(otherDay.getDayOfWeek().getValue());

    }

}
