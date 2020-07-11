package com.company;

public class PlayerGoat implements NBAGOAT {
    @Override
    public void PlayerName(String name) {
        System.out.println(name + "fading away, attemps to shoot, releases the ball in the air...");
    }

    @Override
    public void PlayerTeam(String team) {
        System.out.println("He belongs to the " + team);
    }

    @Override
    public void Shooting() {
        System.out.println("The ball now in mid air...");

    }

    @Override
    public boolean swishOrNah() {
        double chance = Math.random() * 10;
        chance*=10;
        Math.round(chance);
        if (chance >= 50) {
            System.out.println("...and the ball swishes in! " + "His shooting is " + chance);
        } else {
            System.out.println("..and in and out, touch luck for the him! his shooting percentage is " + chance + " percent!");
        }


        return false;
    }
}
