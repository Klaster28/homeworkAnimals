package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeFood;

    public Herbivores(String name, int age, String livingEnvironment, int travelSpeed,String typeFood) {
        super(name, age, livingEnvironment, travelSpeed);

        if(typeFood  == null || typeFood.isEmpty()|| typeFood.isBlank()){
            this.typeFood = "Нет данных";
        }else {
            this.typeFood = typeFood;
        }

    }

    public   void graze(){
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typeFood.equals(that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
