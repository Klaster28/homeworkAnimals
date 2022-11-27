package Animals;

public abstract class Herbivores {
    private String typeFood;

    public Herbivores(String typeFood) {
        if(typeFood  == null || typeFood.isEmpty()|| typeFood.isBlank()){
            this.typeFood = "Нет данных";
        }else {
            this.typeFood = typeFood;
        }

    }

    public String getTypeFood() {
        return typeFood;
    }



    public abstract void graze();
}
