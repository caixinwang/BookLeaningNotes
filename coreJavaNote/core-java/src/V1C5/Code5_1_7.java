package V1C5;

public class Code5_1_7 {//final类和方法
    /**
     * 不允许被拓展的类被称为final类
     */
    //不允许派生A类的子类,final类的所有方法自动就是final
    static final class A{
        public final int f(){//这里final是灰色的，代表final类的所有方法自动是final的。不包括字段,final字段是不允许改变值。
            return 0;
        }
    }

    static class B{
        private int a;

        public final int f(){//子类不能覆盖这个方法
            return -1;
        }
    }


}
