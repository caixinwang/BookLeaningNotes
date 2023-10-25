package c1_strategy.v4_page25;

public abstract class Character {
    private WeaponBehavior weapon;
    public void fight(){
        weapon.useWeapon();
    }


    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
