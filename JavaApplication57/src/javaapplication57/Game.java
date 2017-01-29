/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Scanner;

/**
 *
 * @author Anders
 */
public class Game {

    
    Player hus = new Player();
    Die die6 = new Die(6);
    
     
    
    public Game() {
    }

    public GameResult game1(Player spiller) {
        
        
        
        GameResult gameResult = new GameResult();
        int sum1=0;
        int sum2=0;
        hus.setName("hus");
        for (int i = 0; i < 10; i++) {
            
            sum1 = sum1+die6.getValue();

        }
        spiller.setPoints(sum1);
        for (int i = 0; i < 10; i++) {
            Die die = new Die(6);
            sum2 = sum2 + die.getValue();
        }
        hus.setPoints(sum2);
        System.out.println(spiller.getName() + " slog " + spiller.getPoints());
        System.out.println(hus.getName() + " slog " + hus.getPoints());
        
        if(spiller.getPoints()>hus.getPoints()){
           gameResult.setWinner(spiller);
           gameResult.setLooser(hus);
            
    }else{
            gameResult.setWinner(hus);
            gameResult.setLooser(spiller);
    
    }

        return gameResult;
    }

    public GameResult game2(Player spiller) {
        
       int sum1 = 0;
       int sum2 = 0;
       hus.setName("hus");
       GameResult gameResult = new GameResult();
        for (int i = 0; i < 5; i++) {

            Die die = new Die(12);
            sum1 = sum1 + die.getValue();
        }
        for (int i = 0; i < 5; i++) {
            Die die = new Die(24);
            sum1 = sum1 + die.getValue();
        }
        spiller.setPoints(sum1);
        for (int i = 0; i < 5; i++) {
            Die die = new Die(12);
            sum2 = sum2 + die.getValue();
        }
        for (int i = 0; i < 5; i++) {
            Die die = new Die(24);
            sum2 = sum2 + die.getValue();
        }
        hus.setPoints(sum2);

        System.out.println(spiller.getName() + " slog " + spiller.getPoints());
        System.out.println(hus.getName() + " slog " + hus.getPoints());
        if (spiller.points % 2 == 0) {
            System.out.println("dit slag fordobles til");
            System.out.println(spiller.points = spiller.points + spiller.points);
        } else {
            spiller.points = spiller.points;
        }
        if (hus.points % 2 == 0) {
            System.out.println("husets slag fordobles til");
            System.out.println(hus.points = hus.points + hus.points);
        } else {
            hus.points = hus.points;
        }
            if(spiller.getPoints()>hus.getPoints()){
           gameResult.setWinner(spiller);
           gameResult.setLooser(hus);
            
    }else{
            gameResult.setWinner(hus);
            gameResult.setLooser(spiller);
    
    }
       return gameResult;
    }

    public GameResult game3(Player spiller) {
        int sum1 = 0;
        int sum2 = 0;
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        hus.setName("hus");
        GameResult gameResult = new GameResult();

        System.out.println("du slog " + die1.getValue());
        System.out.println("huset slog " + die2.getValue());
        if (die1.getValue() < 4) {
            System.out.println("der kastes nu med en 12 sidet terning");
            Die di2 = new Die(12);
            sum1 = di2.getValue();

        } else {
            System.out.println("der kastes nu med en 10 sidet terning");
            Die di2 = new Die(10);
            sum1 = di2.getValue();

        }
        System.out.println("du slog " + sum1);
        if (die2.getValue() < 4) {
            System.out.println("der kastes nu med en 12 sidet terning");
            Die di2 = new Die(12);
            sum2 = di2.getValue();

        } else {
            System.out.println("der kastes nu med en 10 sidet terning");
            Die di2 = new Die(10);
            sum2 = di2.getValue();

        }
        System.out.println("huset slog " + sum2);
        spiller.setPoints(die1.getValue() + sum1);
        hus.setPoints(die2.getValue() + sum2);
        System.out.println("du slog samlet " + spiller.points);
        System.out.println("huset slog samlet " + hus.points);
            if(spiller.getPoints()<hus.getPoints()){
           gameResult.setWinner(spiller);
           gameResult.setLooser(hus);
            
    }else{
            gameResult.setWinner(hus);
            gameResult.setLooser(spiller);
    
    }
        return gameResult;
    }

   

    public Player getHus() {
        return hus;
    }

    public void setHus(Player hus) {
        this.hus = hus;
    }
}
