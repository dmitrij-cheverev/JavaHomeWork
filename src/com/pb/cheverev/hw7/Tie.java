package com.pb.cheverev.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Dress man tie with Size: " + this.getSize().getEuroSize() + ", color: " + this.getColor() + ", price: " + this.getPrice());
    }
}
