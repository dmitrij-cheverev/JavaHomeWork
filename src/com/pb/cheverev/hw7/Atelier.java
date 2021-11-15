package com.pb.cheverev.hw7;

public class Atelier {
    public static void dressMan(Clothes[] clothes){
        for (Clothes example: clothes){
            if(example instanceof ManClothes){
                ((ManClothes) example).dressMan();
            }
        }
    }
    public static void dressWomen(Clothes[] clothes){
        for (Clothes example: clothes){
            if(example instanceof WomenClothes){
                ((WomenClothes) example).dressWomen();
            }
        }
    }
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Size.M,80,"blue");
        Pants pants = new Pants(Size.XXS,24,"green");
        Skirt skirt = new Skirt(Size.L,87,"black");
        Tie tie = new Tie(Size.S,63,"red");
        Clothes[] clothes = new Clothes[]{tshirt,pants,skirt,tie};

        dressMan(clothes);
        dressWomen(clothes);
    }




}
