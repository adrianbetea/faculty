class Avion{
    protected String planeID;
    protected int totalEnginePower;


    public Avion(String ID, int engine){
        planeID = ID;
        totalEnginePower = engine;
    }

    public String getPlaneID(){
        return planeID;
    }

    public int getTotalEnginePower(){
        return totalEnginePower;
    }

    public void takeOff(){
        System.out.println(planeID + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }

    public void fly(){
        System.out.println(planeID + " - Flying");
    }

    public void land(){
        System.out.println(planeID + " Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}

class AvionTransport extends Avion{
    protected int maxPassengers;

    public AvionTransport(String ID, int engine, int maxPassengers){
        super(ID, engine);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }
}

class Concorde extends AvionTransport{
    public Concorde(String ID, int engine, int maxPassengers){
        super(ID, engine, maxPassengers);
    }
    public void goSuperSonic(){
        System.out.println(planeID + " - Supersonic mode activated");
    }

    public void goSubSonic(){
        System.out.println(planeID + " - Supersonic mode deactivated");
    }
}

class Boeing extends AvionTransport{
    public Boeing(String ID, int engine, int maxPassengers){
        super(ID, engine, maxPassengers);
    }
}

class AvionLupta extends Avion{

    public AvionLupta(String ID, int engine){
        super(ID, engine);
    }

    public void launchMissile(){
        System.out.println(planeID + " - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }

}

class Mig extends AvionLupta{

    public Mig(String ID, int engine){
        super(ID, engine);
    }

    public void highSpeedGeometry(){
        System.out.println(planeID + " - High speed geometry selected");
    }
    public void normalGeometry(){
        System.out.println(planeID + " - Normal geometry selected");
    }
}

class TomCat extends AvionLupta{

    public TomCat(String ID, int engine){
        super(ID, engine);
    }

    public void refuel(){
        System.out.println(planeID + "e - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete");
    }
}
class Main{
    public static void main(String[] args){

        Avion c = new Concorde("C1", 50, 85);
        ((Concorde)c).goSuperSonic();
        System.out.println(((Concorde)c).getMaxPassengers());

        Avion b = new Boeing("B1", 25, 120);
        System.out.println(((Boeing)b).getMaxPassengers());
        ((Boeing)b).takeOff();
        ((Boeing)b).fly();
        ((Boeing)b).land();

        Avion m = new Mig("M1", 150);
        ((Mig)m).fly();
        ((Mig)m).highSpeedGeometry();
        ((Mig)m).normalGeometry();
        ((Mig)m).land();

        Avion tc = new TomCat("TC1", 125);
        ((TomCat)tc).takeOff();
        ((TomCat)tc).fly();
        ((TomCat)tc).land();

    }
}
