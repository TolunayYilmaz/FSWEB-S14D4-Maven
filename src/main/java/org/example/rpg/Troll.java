package org.example.rpg;

public class Troll extends Monster implements Poisonable,Bleedable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }

    @Override
    public double poison() {
        return getDamage()*0.30;
    }

    public double attack()
    {
        return getDamage()+bleed()+poison();
    }
}
