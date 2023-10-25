package c4_factory.v2;


public class CheesePizza extends Pizza {
    public CheesePizza(){
        super();
        name="Cheese Pizza";
        dough="default";
        sauce="default";
    }

    public static void main(String[] args) {
        CheesePizza cheesePizza=new CheesePizza();
        cheesePizza.prepare();
    }
}
