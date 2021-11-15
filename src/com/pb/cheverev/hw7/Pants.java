package com.pb.cheverev.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Dress man pants with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
    @Override
    public void dressWomen(){
        System.out.println("Dress women pants with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
}
