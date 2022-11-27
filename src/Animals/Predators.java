package Animals;

import java.util.Objects;

public  class Predators extends Mammals{

    private String typeFood;
    public Predators(String name, int age, String livingEnvironment, int travelSpeed,String typeFood) {
        super(name, age, livingEnvironment, travelSpeed);
        if (typeFood == null || typeFood.isEmpty() || typeFood.isBlank()) {
            this.typeFood = "Нет данных";
        } else {
            this.typeFood = typeFood;
        }
    }
    public void hunt(){

    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood == null || typeFood.isEmpty() || typeFood.isBlank()) {
            this.typeFood = "Нет данных";
        } else {
            this.typeFood = typeFood;
        }
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeFood.equals(predators.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
