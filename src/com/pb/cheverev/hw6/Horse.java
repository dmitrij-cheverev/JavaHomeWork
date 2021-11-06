package com.pb.cheverev.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String breedHorse;

    public Horse() {
        this.breedHorse = "Mustang";
    }

    public Horse(String breedHorse) {
        this.breedHorse = breedHorse;
    }

    public Horse(String food, String location, String breedHorse) {
        super(food, location);
        this.breedHorse = breedHorse;
    }

    public String getBreedHorse() {
        return breedHorse;
    }

    public void setBreedHorse(String breedHorse) {
        this.breedHorse = breedHorse;
    }

    @Override
    public void makeNoise (){
        System.out.println("Horse say IGOGO");
    }

    @Override
    public void sleep(){
        System.out.println("Horse is sleep");
    }

    @Override
    public void eat(){
        System.out.println("Horse eat trava");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse Horse = (Horse) o;
        return Objects.equals(breedHorse, Horse.breedHorse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedHorse);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breedHorse='" + breedHorse + '\'' +
                '}';
    }
}
