package Marsvin01;

public class Marsvins {
    private String name;
    private String race;
    private int food;

    public Marsvins (String name, String race, int food){
        this.name = name;
        this.race = race;
        this.food = food;
    }

    public String getName(){
        return name;
    }

    public String getRace(){
        return race;
    }

    public int getFood(){
        return food;
    }
}
