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

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }

    @Override
    public void hunt() {

    }
}
