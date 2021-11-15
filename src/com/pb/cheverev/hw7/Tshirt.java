package com.pb.cheverev.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{

    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Dress man tshirt with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
    @Override
    public void dressWomen(){
        System.out.println("Dress women tshirt with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
}
