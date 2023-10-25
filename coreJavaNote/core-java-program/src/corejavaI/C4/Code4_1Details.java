package corejavaI.C4;

public class Code4_1Details {

    public static class Person{
        private int age;//封装数据
        private String name;

        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {//行为，改变状态
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Person person=new Person(18,"wcx");//创建了一个对象实例
        person.setAge(19);//通过行为改变对象的状态

        Person wcx;//此时wcx只是一个对象变量，还没有引用任何对象
//        wcx.getName();//此时调用方法会报错
        wcx=new Person(20,"wcx");//new操作符返回的就是一个引用

    }
}
