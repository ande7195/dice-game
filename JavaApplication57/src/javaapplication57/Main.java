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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game = new Game();
        GameResult gameresult = new GameResult();
        Scanner scan;
        scan = new Scanner(System.in);
        int x;
        Player spiller = new Player();
        Player hus = new Player();

        System.out.println("skriv et tal mellem 1 og 3 for hvilket spil du vil spille");
        x = Integer.parseInt(scan.nextLine());
        if (x == 1) {
            scan = new Scanner(System.in);
            System.out.println("skriv dit navn");
            spiller.setName(scan.nextLine());
            hus.setName("Huset");
            
            
            
            System.out.println(game.game1(spiller));
            
            
        } else if (x == 2) {

            scan = new Scanner(System.in);
            System.out.println("skriv dit navn");
            spiller.setName(scan.nextLine());
            hus.setName("Huset");

            
            System.out.println(game.game2(spiller));
        } else {

            scan = new Scanner(System.in);
            System.out.println("skriv dit navn");
            spiller.setName(scan.nextLine());
            hus.setName("Huset");
            
            System.out.println(game.game3(spiller));
        }

    }

}
