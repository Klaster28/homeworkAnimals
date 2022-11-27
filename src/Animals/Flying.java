package Animals;

import java.util.Objects;

public class Flying extends Birds {
    private String typeMovement;

    public Flying(String name, int age,String livingEnvironment,String typeMovement) {
        super(name, age,livingEnvironment );

        if(typeMovement  == null || typeMovement.isEmpty()|| typeMovement.isBlank()){
            this.typeMovement = "Нет данных";
        }else {
            this.typeMovement = typeMovement;
        }

}

    public String getTypeMovement() {

        return typeMovement;
    }



    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }
    protected void toFly() {

    }
    @Override
    public void hunt() {

    }

    @Override
    public String toString() {
        return "Flying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return typeMovement.equals(flying.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}
