package game.arenas.land;
import game.arenas.*;

enum Coverage {SAND,GRASS,MUD};
enum LandSurface {FLAT,MOUNTAIN};


public class LandArena extends Arena{
//  Fields & DEFAULTS:
    private final static double DEFAULT_FRICTION = 0.5;
    private final static int DEFAULT_MAX_RACERS = 8;
    private final static int DEFAULT_LENGTH = 800;
    private Coverage coverage;
    private LandSurface surface;

//  Ctors:
    LandArena(){
        super(DEFAULT_LENGTH, DEFAULT_MAX_RACERS, DEFAULT_FRICTION);
        this.coverage = Coverage.GRASS;
        this.surface = LandSurface.FLAT;
    }

    LandArena(double length, int maxRacers){
        super(length, maxRacers, DEFAULT_FRICTION);
        this.coverage = Coverage.GRASS;
        this.surface = LandSurface.FLAT;
    }

//  Methods, Getters & Setters:


    public Coverage getCoverage() {
        return coverage;
    }

    public LandSurface getSurface() {
        return surface;
    }

    public boolean setCoverage(Coverage coverage) {
        if (coverage!=null){
            this.coverage = coverage;
            return true;
        }
        return false;
    }

    public boolean setSurface(LandSurface surface) {
        if (surface!=null){
            this.surface = surface;
            return true;
        }
        return false;
    }
}
