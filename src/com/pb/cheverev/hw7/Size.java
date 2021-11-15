package com.pb.cheverev.hw7;

public enum Size {
    XXS(32,"Children size"),
    XS(34, "Adult size"),
    S(36,"Adult size"),
    M(38,"Adult size"),
    L(40,"Adult size");

    private String Description;
    private int EuroSize;


    Size(int EuroSize, String Description) {
        this.Description = Description;
        this.EuroSize = EuroSize;
    }

    public String getDescription(){
        return Description;
    }

    public int getEuroSize() {
        return EuroSize;
    }
}
