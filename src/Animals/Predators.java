package Animals;

public  class Predators {
    private final String typeFood;



    public Predators(String typeFood) {
        if (typeFood == null || typeFood.isEmpty() || typeFood.isBlank()) {
            this.typeFood = "Нет данных";
        } else {
            this.typeFood = typeFood;
        }
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void hunt(){

    }
}
