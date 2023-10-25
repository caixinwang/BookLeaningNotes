package corejavaI.C5;

public class Code5_2_4 {//散列

    static class A{
        private int a;
        private String name;
        private double b;

        public A(int a, String name, double b) {
            this.a = a;
            this.name = name;
            this.b = b;
        }

        /**
         * 下面三种表达方式都可以
         * @return
         */
        @Override
        public int hashCode() {
//            return Objects.hash(a,name,b);

//            return 7*Integer.hashCode(a)
//                    +11*name.hashCode()
//                    +13+Double.hashCode(b);
            return 7*new Integer(a).hashCode()
                    +11*name.hashCode()
                    +13+new Double(b).hashCode();


        }
    }


}
