package com.CarServices;

class HatchBack extends Car{

    int BS01 = 2000;
    int EF01 = 5000;
    int CF01 = 2000;
    int BF01 = 1000;
    int GF01 = 3000;
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
