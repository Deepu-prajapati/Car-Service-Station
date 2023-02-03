package com.CarServices;

class Sedan extends Car{

    int BS01 = 4000;
    int EF01 = 8000;
    int CF01 = 4000;
    int BF01 = 1500;
    int GF01 = 6000;
    int charges = 0;
    @Override
    void BS01() {
        System.out.println("Charges of Basic Servicing = "+ BS01);
        charges += BS01;
    }

    @Override
    void EF01() {
        System.out.println("Charges of Engine Fixing = "+ EF01);
        charges += EF01;
    }

    @Override
    void CF01() {
        System.out.println("Charges of Clutch Fixing = "+ CF01);
        charges += CF01;
    }

    @Override
    void BF01() {
        System.out.println("Charges of Break Fixing = "+ BF01);
        charges += BF01;
    }

    @Override
    void GF01() {
        System.out.println("Charges of Gear Fixing = "+ GF01);
        charges += GF01;
    }
}
