package V1C5;

public class Code5_4 {//包装类
    public static void main(String[] args) {
        Integer i=1;
        System.out.println(i);
        i++;//自动拆箱，然后重新装箱
        System.out.println(i);
        Integer i2=3;
        Integer i3=3;
        System.out.println(i3==i2);//最好不要这么做
        if (i3==i2){
            System.out.println("yes");
        }
        System.out.println(i3.equals(i2));//这才是正确的
        try {
            Integer i4=null;
            System.out.println(i4*2);
        } catch (Exception e) {
            System.out.println(e);
        }
        int parseInt = Integer.parseInt("123456");//这里返回的是整型
        Integer integer = Integer.valueOf("123456");//返回的是包装类

    }
}
