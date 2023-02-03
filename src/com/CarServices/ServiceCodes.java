package com.CarServices;

import java.util.Scanner;
public class ServiceCodes {

    static void service(Car car) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER SERVICE CODE");
        String code = sc.nextLine();
        switch (code) {
            case "BS01" -> car.BS01();
            case "EF01" -> car.EF01();
            case "CF01" -> car.CF01();
            case "BF01" -> car.BF01();
            case "GF01" -> car.GF01();
            default -> System.out.println("PLEASE ENTER VALID SERVICE CODE");
        }
    }
}
