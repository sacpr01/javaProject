package com.rvl;

/**
 * Created by Естай on 20.10.14.
 */
public class Sonnet29 implements Poem {
    private static String[] Lines = {
            "Я помню чудное вгновение,",
            "Пере домной явилась ты.",
            "Как мимолетное Явление,",
            "Как гений чистой красоты"
            };
    public Sonnet29(){}
    public void recite(){
        for(int i=0; i<Lines.length; i++){
            System.out.println(Lines[i]);

        }
    }
}
