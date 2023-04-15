package game.arenas.air;
import game.arenas.*;

//    enums:

enum Vision {CLOUDS,SUNNY,FOG};
enum Weather {DRY,RAIN,SNOW};
enum Height {LOW,MEDIUM,HIGH};
enum Wind {LOW,MEDIUM,HIGH};

public class AerialArena extends Arena{
//  Fields & DEFAULTS:
    private final static double DEFAULT_FRICTION = 0.4;
    private final static int DEFAULT_MAX_RACERS = 6;
    private final static int DEFAULT_LENGTH = 1500;
    private Vision vision;
    private Weather weather;
    private Height height;
    private Wind wind;
//  Ctors:
    AerialArena(){
        super(DEFAULT_LENGTH,DEFAULT_MAX_RACERS,DEFAULT_FRICTION);
        this.vision = Vision.SUNNY;
        this.weather = Weather.DRY;
        this.height = Height.HIGH;
        this.wind = Wind.HIGH;

    };

    AerialArena(double length, int maxRacers){
        super(length,maxRacers,DEFAULT_FRICTION);
        this.vision = Vision.SUNNY;
        this.weather = Weather.DRY;
        this.height = Height.HIGH;
        this.wind = Wind.HIGH;
    }

//  Methods:


    public Vision getVision() {
        return vision;
    }

    public Weather getWeather() {
        return weather;
    }

    public Height getHeight() {
        return height;
    }

    public Wind getWind() {
        return wind;
    }

    public boolean setVision(Vision vision) {
        if(vision!=null) {
            this.vision = vision;
            return true;
        }
        return false;
    }

    public boolean setWeather(Weather weather) {
        if(weather!=null) {
            this.weather = weather;
            return true;
        }
        return false;
    }

    public boolean setHeight(Height height) {
        if(height!=null) {
            this.height = height;
            return true;
        }
        return false;
    }

    public boolean setWind(Wind wind) {
        if(wind!=null) {
            this.wind = wind;
            return true;
        }
        return false;
    }
}
