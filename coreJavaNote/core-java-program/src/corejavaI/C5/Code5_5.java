package corejavaI.C5;

public class Code5_5 {//参数可变的方法

    public static double min(Double[] values){//可以直接把数组改成可变参
        double min=Double.MAX_VALUE;
        for (Double value : values) {
            min=value<min?value:min;
        }
        return min;
    }

    public static double max(Double ... values){
        double largest=Double.NEGATIVE_INFINITY;
        for (Double value : values) {
            largest=value>largest?value:largest;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(max(1.3231,965.11,89654.33));
        System.out.println(min(new Double[]{10.99,-119.12,99.32,556.124}));
    }


}
