package LinkedLists;

public class GameEntry {

    private int score;
    private String name;

    public GameEntry(String n, int s){
        name = n;
        score = s;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String toString(){
        return "(" + name + ", " + score + ")";
    }
}