package Animals;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private double travelSpeed = 0;

    public Mammals(String name, int age, String livingEnvironment, double travelSpeed) {
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
    public abstract void walk();

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }
}
