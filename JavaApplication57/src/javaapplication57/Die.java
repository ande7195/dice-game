/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Random;

/**
 *
 * @author Anders
 */
public class Die {

    private int value;
    public int antal;

    public Die(int a) {
        antal = a;
        roll();
    }

    public void roll() {
        Random ran = new Random();
        value = ran.nextInt(antal) + 1;
    }

    public int getValue() {
        return value;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

}
