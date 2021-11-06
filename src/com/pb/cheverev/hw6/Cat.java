package com.pb.cheverev.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String breedCat;

    public Cat() {
        this.breedCat = "Sphinx";
    }

    public Cat(String breedCat) {
        this.breedCat = breedCat;
    }

    public Cat(String food, String location, String breedCat) {
        super(food, location);
        this.breedCat = breedCat;
    }

    public String getBreedCat() {
        return breedCat;
    }

    public void setBreedCat(String breedCat) {
        this.breedCat = breedCat;
    }

    @Override
    public void makeNoise (){
        System.out.println("Cat say MYA");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleep");
    }

    @Override
    public void eat(){
        System.out.println("Cat eat moloko");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat Cat = (Cat) o;
        return Objects.equals(breedCat, Cat.breedCat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breedCat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breedCat='" + breedCat + '\'' +
                '}';
    }
}
