package game.racers;
import game.arenas.*;


enum Color {RED,GREEN,BLUE,BLACK,YELLOW};

public abstract class Racer {
//    Fields:
    int serialNumber; //todo:figure out how to make it unique, maybe static?
    String name;
    Point currentLocation;
    Point finish;
    Arena arena;
    double maxSpeed;
    double acceleration;
    double currentSpeed;
    double failureProbability;
    Color color;
    Mishap mishap;//todo: figure out waht the hell is this shit

//    Ctors:
    Racer (String name, double maxSpeed, double acceleration, Color color){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.color = color;
        //todo:figure out how to give each Racer a unique id number
    }

//    Methods:
    void initRace(Arena arena, Point start, Point finish){};//todo:figure out if this method needs to be implemented here (if yes->implement here) or in derived classes (if yes-> add abstract declaration and remove {}).

    abstract Point move(double friction);//todo:figure out if this method needs to be implemented here (if yes->implement here) or in derived classes (if yes-> add abstract declaration and remove {}).

    String describeSpecific(){return "";};//todo:implement

    String describeRacer(){return "";};//todo:implement

    void introduce(){};//todo:implement

    String className(){return "";};//todo:implement

    boolean hasMishap(){return false;};//todo:implement

//    Getters & Setters
//    todo:figure out:
//    1. do i need all of the getters and setters?
//    2. do i need them to be public/protected/private
//    3. do i need all setters to have the same condition for boolean return?

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public Point getFinish() {
        return finish;
    }

    public Arena getArena() {
        return arena;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getFailureProbability() {
        return failureProbability;
    }

    public Color getColor() {
        return color;
    }

    public Mishap getMishap() {
        return mishap;
    }

    public boolean setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean setName(String name) {
        this.name = name;
    }

    public boolean setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean setFinish(Point finish) {
        this.finish = finish;
    }

    public boolean setArena(Arena arena) {
        this.arena = arena;
    }

    public boolean setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public boolean setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean setFailureProbability(double failureProbability) {
        this.failureProbability = failureProbability;
    }

    public boolean setColor(Color color) {
        this.color = color;
    }

    public boolean setMishap(Mishap mishap) {
        this.mishap = mishap;
    }
}
