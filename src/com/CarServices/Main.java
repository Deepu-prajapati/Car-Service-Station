package com.CarServices;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER YOUR CAR NAME = ");

        String car = sc.nextLine();

        int totalAmount = 0;

        if(car.equals("HatchBack")){
            HatchBack hatchback = new HatchBack();
            for(int i=0; ; i++){
                ServiceCodes.service(hatchback);
                totalAmount = hatchback.charges;
                if(totalAmount >= 10000){
                    System.out.println("CONGRATS YOU ARE ELIGIBLE FOR FREE OF COST CAR CLEANING");
                }
                System.out.println("TOTAL PAYABLE AMOUNT OF SERVICING = "+totalAmount);
            }
        }else if(car.equals("Sedan")){
            Sedan sedan = new Sedan();
            for(int i=0; ;i++){
                ServiceCodes.service(sedan);
                totalAmount = sedan.charges;
                if(totalAmount >= 10000){
                    System.out.println("CONGRATS YOU ARE ELIGIBLE FOR FREE OF COST CAR CLEANING");
                }
                System.out.println("TOTAL PAYABLE AMOUNT OF SERVICING = "+totalAmount);
            }
        }else if(car.equals("SUV")){
            SUV suv = new SUV();
            for(int i=0; ;i++){
                ServiceCodes.service(suv);
                totalAmount = suv.charges;
                if(totalAmount >= 10000){
                    System.out.println(" CONGRATS YOU ARE ELIGIBLE FOR FREE OF COST CAR CLEANING");
                }
                System.out.println("TOTAL PAYABLE AMOUNT OF SERVICING = "+totalAmount);
            }
        }
        else{
            System.out.println("PLEASE ENTER PROPER CAR NAME");
        }
    }
}