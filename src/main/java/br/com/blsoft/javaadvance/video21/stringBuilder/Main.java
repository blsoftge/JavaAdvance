/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.blsoft.javaadvance.video21.stringBuilder;

/**
 *
 * @author BLSoft
 */
public class Main {
    public static void main(String[] args){
        
        long t1 = System.currentTimeMillis();
        String stringNormal = new String("Contando 0");
        for (int i = 0; i < 10000; i++) {
            stringNormal += i;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("STRING NORMAL TEMPO: " + (t2 - t1));
        System.out.println("STRING NORMAL RESULTADO: " + stringNormal);
        
        long t1SB = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Contando 0");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        long t2SB = System.currentTimeMillis();
        System.out.println("STRING BUILDER TEMPO: " + (t2SB - t1SB));
        System.out.println("STRING BUILDER RESULTADO: " + stringBuilder.toString());
    }
}
