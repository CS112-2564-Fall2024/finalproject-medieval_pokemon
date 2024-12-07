package com.example.finalmedieval;

public class Armor extends Character {
    // Final (DEFAULT) Variables
    public static final String DEFAULT_TYPE = "None";
    public static final Double DEFAULT_DEFENSE = 0.0;

    // Instance Variables
    String type;
    Double defense;

    // Constructors
    public Armor(String type, Double defense) {

    }
        // Default Constructor
    public Armor() {
        this(Armor.DEFAULT_TYPE, Armor.DEFAULT_DEFENSE);
    }

    // Mutators
        // Setters
    public void setType(String type) {
        this.type = type;
    }
    public void setDefense(Double defense) {
        this.defense = defense;
    }
        // setAll Method
    public void setAll(String type, Double defense){
        this.setType(type);
        this.setDefense(defense);
    }

    // Accessors
        // Getters
    public String getType() {
        return this.type;
    }
    public Double getDefense(){
        return this.defense;
    }

    // toString Method
    @Override
    public String toString(){
        return "Your armor selection is: " + this.type + ". \nDefense: " + this.defense;
    }

    // equals Method
    @Override
    public boolean equals(Object other){
        if (other == null || (!(other instanceof Armor))) {
            return false;
        }
        Armor otherArmor = (Armor) other;
        return this.type.equals(otherArmor.type) && this.defense.equals(otherArmor.defense);
    }

}
