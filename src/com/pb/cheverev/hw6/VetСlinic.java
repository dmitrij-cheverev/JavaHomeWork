package com.pb.cheverev.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Cat cat = new Cat("corm","home","bengali");
        Dog dog = new Dog("meat","street","shepherd","watchman");
        Horse horse = new Horse("grass","stall","Haflinger");

        Animal[] animal = new Animal[]{cat,dog,horse};
        Veterinarian vet = null;
        Class clazz = Class.forName(Veterinarian.class.getName());
        vet = (Veterinarian) clazz.newInstance();

        for (Animal anim : animal){
            vet.treatAnimal(anim);
        }

    }
}
