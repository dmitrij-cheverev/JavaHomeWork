package com.pb.cheverev.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Animal eat " + animal.getFood() + " and leave in " + animal.getLocation());
    }
}
