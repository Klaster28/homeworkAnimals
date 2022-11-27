package Animals;

public abstract class Amphibians {
    private final String livingEnvironment;

    public Amphibians(String livingEnvironment) {
        if(livingEnvironment  == null || livingEnvironment.isEmpty()|| livingEnvironment.isBlank()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void hunt(){

    }

}
