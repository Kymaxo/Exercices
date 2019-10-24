package com.mycompany.exercicerandom;

import java.util.Random;

public class ExoRandom {

    public static void main(String[] args) {
        
        int indice = 0;
        
        for (int i = 1; i <= 100 ; i++){
            int rand = (int)(Math.random()*1000);
            System.out.println(rand + " le nombre de tirage fallu est: " + i);
       }       
    }
}
