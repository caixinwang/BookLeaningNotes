package c1_strategy.v4_page25;

public class King extends Character{
    public King() {
        setWeapon(new SwordBehavior());
    }
}
