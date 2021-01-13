package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        Boss boss = new Boss();
        Skelety skelety = new Skelety();
        Skelety skelety1 = new Skelety();
        weapon.setWeaponName("Нож");
        weapon.setWeaponType("Холодное оружие");
        boss.setHeals(1000);
        boss.setDamage(200);
        boss.setWeapon(weapon);
//        System.out.println("Инфо о боссе\n"+
//                "--------------------\n"+
//                "Health:"+boss.getHeals()+
//                "\nDamage:"+boss.getDamage()+
//                "\nWeapon name:"+boss.getWeapon().getWeaponName()+
//                "\nWeapon type:"+boss.getWeapon().getWeaponType());
        System.out.println(boss.printInfo());


    }
}