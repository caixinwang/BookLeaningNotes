package c4_factory.v1;

public class GreekPizza extends Pizza{
    public GreekPizza(){
        super();
        name="Greek Pizza";
        dough="default";
        sauce="default";
    }

    public static void main(String[] args) {
        GreekPizza greekPizza=new GreekPizza();
        greekPizza.prepare();
    }
}
