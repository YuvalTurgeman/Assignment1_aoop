package game.arenas.naval;
import game.arenas.*;
enum Water {SALTED,SWEET};
enum WaterSurface {FLAT,WAVY}
enum Body {SEA,LAKE,RIVER,OCEAN};



public class NavalArena extends Arena{
//  Fields:
    private final static double DEFAULT_FRICTION = 0.7;
    private final static int DEFAULT_MAX_RACERS = 5;
    private final static int DEFAULT_LENGTH = 1000;
    private Water water;
    private WaterSurface surface;
    private Body Body;//todo:maybe change to 'body', after run tests to see if theres a problem with it with capital B

//  Ctors:
    NavalArena(){
        super(DEFAULT_LENGTH,DEFAULT_MAX_RACERS, DEFAULT_FRICTION);
        this.water = Water.SWEET;
        this.surface = WaterSurface.FLAT;
        this.Body = Body.LAKE;
    };

    NavalArena(double length, int maxRacers){
        super(length, maxRacers,DEFAULT_FRICTION);
        this.water = Water.SWEET;
        this.surface = WaterSurface.FLAT;
        this.Body = game.arenas.naval.Body.LAKE;
    }

//    Methods, Getters & Setters:


    public Water getWater() {
        return water;
    }

    public WaterSurface getSurface() {
        return surface;
    }

    public Body getBody() {
        return Body;
    }

    public boolean setWater(Water water) {
        if (water!=null){
            this.water = water;
            return true;
        }
        return false;
    }

    public boolean setSurface(WaterSurface surface) {
        if (surface!=null){
            this.surface = surface;
            return true;
        }
        return false;
    }

    public boolean setBody(Body body) {
        if (body!=null){
            this.Body = body;
            return true;
        }
        return false;
    }


}
