/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

/**
 *
 * @author Anders
 */
public class GameResult {
     private Player winner;
     private Player looser;
 
    public GameResult(){
        
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLooser() {
        return looser;
    }

    public void setLooser(Player looser) {
        this.looser = looser;
    }


       
    @Override
    public String toString() {
        return "vinderen er "+ winner.getName()+ " med "+winner.getPoints()+ " points mod " +looser.getPoints()+" fra "+looser.getName();
    }   
}
// gamresult indholder kun resultatet som en toStringmetode()


