package com.rvl;

/**
 * Created by Естай on 20.10.14.
 */
public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler(){

    }
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform()throws Exception{
        System.out.println("Juggling " + beanBags + " Beanbags");
    }

}
