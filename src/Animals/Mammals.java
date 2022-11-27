package Animals;

public class Mammals extends Animals {
    private final String livingEnvironment;
    private int travelSpeed;



    public Mammals(String name, int age, String livingEnvironment, int travelSpeed) {
        super(name, age);
        if(livingEnvironment  == null || livingEnvironment.isEmpty()|| livingEnvironment.isBlank()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
        if(travelSpeed < 0){
            this.travelSpeed = 0;
        }else {
            this.travelSpeed = travelSpeed;
        }

    }
    protected   void walk(){

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", travelSpeed=" + travelSpeed +
                '}';
    }
}
