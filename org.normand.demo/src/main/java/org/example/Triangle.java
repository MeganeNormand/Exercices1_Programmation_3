package org.example;

import java.util.Collections;

public class Triangle {
    public static void main(String[] args) {
        String name = "";
        Integer test = Integer.parseInt(args[0]);
        for (int i=0; i<test; ++i){
            name += "*";
            System.out.println(name);
        }
    }
}
