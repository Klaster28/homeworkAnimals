package Animals;

public abstract class Birds {
    private String livingEnvironment;

    public Birds(String livingEnvironment) {
        if(livingEnvironment  == null || livingEnvironment.isEmpty()|| livingEnvironment.isBlank()){
            this.livingEnvironment = "Нет данных";
        }else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    protected abstract void hunt();
}
