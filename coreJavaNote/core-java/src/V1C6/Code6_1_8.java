package V1C6;

import java.util.Arrays;
import java.util.Comparator;

public class Code6_1_8 {//比较器
    static class LengthComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }
    public static void main(String[] args) {
        String[] arr={"affdasads","fsd","ffsdafdssaffsda","fsdfasfasd"};
        Arrays.sort(arr,new LengthComparator());
        System.out.println(Arrays.toString(arr));
    }
}
