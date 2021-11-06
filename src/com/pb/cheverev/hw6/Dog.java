package com.pb.cheverev.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String breedDog;
    private String typeDog;

    public Dog() {
        this.breedDog = "Malamute";
        this.typeDog = "Rideable";
    }

    public Dog(String breedDog, String typeDog) {
        this.breedDog = breedDog;
        this.typeDog = typeDog;
    }

    public Dog(String food, String location, String breedDog, String typeDog) {
        super(food, location);
        this.breedDog = breedDog;
        this.typeDog = typeDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    public void setBreedDog(String breedDog) {
        this.breedDog = breedDog;
    }

    public String getTypeDog() {
        return typeDog;
    }

    public void setTypeDog(String typeDog) {
        this.typeDog = typeDog;
    }

    @Override
    public void makeNoise (){
        System.out.println("Dog say GAV");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleep");
    }

    @Override
    public void eat(){
        System.out.println("Dog eat myso");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breedDog, dog.breedDog) && Objects.equals(typeDog, dog.typeDog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedDog, typeDog);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedDog='" + breedDog + '\'' +
                ", typeDog='" + typeDog + '\'' +
                '}';
    }
}
