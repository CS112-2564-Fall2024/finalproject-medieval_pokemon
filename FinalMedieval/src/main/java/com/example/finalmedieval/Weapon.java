package com.example.finalmedieval;
public class Weapon extends Character {
    // CONSTANT (DEFAULT) VARIABLES
    public static final String DEFAULT_TYPE = "None";
    public static final Double DEFAULT_DAMAGE = 0.0;

    // INSTANCE VARIABLES
    String type;
    Double damage;

    // CONSTRUCTORS
    public Weapon(String type, Double damage) {

    }

    // DEFAULT CONSTRUCTOR
    public Weapon(){
        this(Weapon.DEFAULT_TYPE, Weapon.DEFAULT_DAMAGE);
    }

    // MUTATORS
        // SETTERS
    public void setType(String type) {
        this.type = type;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

        // setAll Method
    public void setAll(String type, Double damage) {
        this.setType(type);
        this.setDamage(damage);
    }

    // ACCESSORS
        // GETTERS
    public String getType() {
        return this.type;
    }
    public Double getDamage() {
        return this.damage;
    }

    // toString
    @Override
    public String toString(){
        return "Your weapon selection is: " + this.type + ". \nDamage: ";
    }

    // equals method
    @Override
    public boolean equals(Object other){
        if (other == null || (!(other instanceof Weapon))) {
            return false;
        }
        Weapon otherWeapon = (Weapon) other;
        return this.type.equals(otherWeapon.type) && this.damage.equals(otherWeapon.damage);
    }

}
