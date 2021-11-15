package com.pb.cheverev.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen(){
        System.out.println("Dress women skirt with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
}
