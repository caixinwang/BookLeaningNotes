package c1_strategy.v4_page25;

public class Main {
    public static void main(String[] args) {
        Queen queen=new Queen();
        King king=new King();
        queen.fight();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
