package corejavaI.C4;

import java.time.LocalDate;

public class Code4_2_3 {//应用localDate的程序

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today=date.getDayOfMonth();//一个月中的第几天
        int month=date.getMonthValue();//第几个月
        //我们再知道这个月的第一天是礼拜几就可以制作日历了
        date=date.minusDays(today-1);//现在的date代表的这个月的第一天
        int week=date.getDayOfWeek().getValue();//得到这个月的第一天是星期几.1~7

        System.out.printf("Mon Tue Wed Thu Fri Sat Sun\n");
        for (int i = 0; i < week - 1; i++) {
            System.out.printf("    ");//四个空格，从m的前面跳到t的前面要4个空格
        }
        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());//开始填数字，后面的空格看情况填，要检查是不是星号
            if (date.getDayOfMonth()==today){//如果是当天就填星号
                System.out.printf("*");
            }else {
                System.out.printf(" ");
            }
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1) System.out.println();//如果前面打印的是Sun那么就换行，Sun+1变成1了
        }
    }
}
