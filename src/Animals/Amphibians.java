package Animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private  String livingEnvironment;

    public Amphibians(String name, int age,String livingEnvironment) {
        super(name, age);
        if(livingEnvironment  == null || livingEnvironment.isEmpty()|| livingEnvironment.isBlank()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    protected void hunt(){

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
    public String getLivingEnvironment() {
        return livingEnvironment;
    }
    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
