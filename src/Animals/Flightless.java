package Animals;


import java.util.Objects;

public  class Flightless extends Birds {

    private String typeMovement;

    public Flightless(String name, int age, String livingEnvironment,String typeMovement) {
            super(name, age, livingEnvironment);

        if (typeMovement == null || typeMovement.isEmpty() || typeMovement.isBlank()) {
            this.typeMovement = "Нет данных";
        } else {
            this.typeMovement = typeMovement;
        }



    }

        public String getTypeMovement() {

            return typeMovement;
        }

        protected void walk() {

        }

        public void setTypeMovement(String typeMovement) {
            this.typeMovement = typeMovement;
        }

        @Override
        public void hunt() {

        }

        @Override
        public String toString() {
            return "Flightless{" +
                    "typeMovement='" + typeMovement + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}