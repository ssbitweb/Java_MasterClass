package com.sachinbhagat.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot(short description) here";
    }

    public String getName() {
        return name;
    }
}

class Shawshank_Redemption extends Movie{
    public Shawshank_Redemption() {
        super("Shawshank redemption");
    }
    public String plot(){
        return "Hope is everything..Never Give up";
    }
}

class GOT extends Movie{
    public GOT() {
        super("GOT");
    }

    @Override
    public String plot() {
        return "Nudity and Sceanic";
    }
}

class FightClub extends Movie {
    public FightClub() {
        super("Fight Club");
    }

    @Override
    public String plot() {
        return "Different philosophy ";
    }
}

class MakeJokeOf extends Movie{
    public MakeJokeOf() {
        super("MakeJokeOf-MJO");
    }

    @Override
    public String plot() {
        return "Real Comedy-Tuned and Fun :)";
    }
}

class Twilight extends Movie{
    public Twilight() {
        super("Twilight");
    }
    //What is this? don't Know..
}

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # "+ i +
                            " : " + movie.getName() + "\n" +
                            "plot: " + movie.plot() + "\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 5 )+1;
        System.out.println("Random Number Generated is "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Shawshank_Redemption();
            case 2:
                return new GOT();
            case 3:
                return new FightClub();
            case 4:
                return new MakeJokeOf();
            case 5:
                return new Twilight();
        }
        return null;
    }
}
