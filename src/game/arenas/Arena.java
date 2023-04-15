package game.arenas;
import java.util.ArrayList;
import game.racers.Racer; //todo:decide if Racer should be abstract class or interface - generally decide the hierarchy for racers, ask roi


public abstract class Arena {
//  Fields & DEFAULTS:
    private ArrayList <Racer> activeRacers;
    private ArrayList <Racer> completedRacers;
    private final double FRICTION;
    private final int MAX_RACERS;
    private double length; // x value of finish line
    private final static int MIN_Y_GAP = 10;

//  Ctors:
    protected Arena(double length, int maxRacers, double friction){
        this.length = length;
        this.MAX_RACERS = maxRacers;
        this.FRICTION = friction;
    }

//  Methods:
    void addRacer(Racer newRacer){};//todo:implement

    void initRace(){};//todo:implement

    boolean hasActiveRacers(){return false;};//todo:implement

    void playTurn(){};//todo:implement

    void crossFinishLine(Racer racer){};//todo:implement

    void showResults(){};//todo:implement

}
