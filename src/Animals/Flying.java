package Animals;

public class Flying extends Birds {
    private String typeMovement;

    public Flying(String livingEnvironment, String typeMovement) {
        super(livingEnvironment);
        if(typeMovement  == null || typeMovement.isEmpty()|| typeMovement.isBlank()){
            this.typeMovement = "Нет данных";
        }else {
            this.typeMovement = typeMovement;
        }

    }

    public String getTypeMovement() {
        return typeMovement;
    }

    protected void toFly() {

    }

    @Override
    protected void hunt() {

    }
}
