package com.company;

public class Main {

    public static void main(String[] args) {




        int a = 0;
        int b = 107;
        int generateRandomAge = a + (int) (Math.random() * b);
        String name = "Kubat";
        int age = generateRandomAge;
        int temperature = 30;
        System.out.println("Ваш возраст : " + generateRandomAge);
        System.out.println("Температура : " + temperature);




        if (age > 20 && age < 45){
            if (temperature <30 & temperature > -20){
                System.out.println("Можете идти гулять");
            }
            else {
                System.out.println("Вы не можете идти гулять");
            }
        }
        else if (age < 20){
            if (temperature > 0 && temperature <28){
                System.out.println("Можно идти гулять");
            }
            else {
                System.out.println("Вы не можете идти гулять");
            }
        } else if (age >45){
            if (temperature >-10 && temperature < 25){
                System.out.println("Можете идти гулять");
            }
            else {
                System.out.println("Вы не можете идти гулять");
            }
        } else {
            System.out.println("Вы не можете идти гулять");
        }







    }
}
