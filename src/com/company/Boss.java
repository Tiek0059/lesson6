package com.company;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Инфо о боссе\n"+
                "--------------------\n"+
                "Health:"+getHeals()+
                "\nDamage:"+getDamage()+
                "\nWeapon name:"+getWeapon().getWeaponName()+
                "\nWeapon type:"+getWeapon().getWeaponType();
    }
}
