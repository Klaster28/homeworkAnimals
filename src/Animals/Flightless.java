package Animals;

public abstract class Flightless extends Birds {

    private String typeMovement;

    public Flightless(String livingEnvironment) {
        super(livingEnvironment);
    }


    private String Flightless(String livingEnvironment, String typeMovement) {
        super(livingEnvironment);
        if (typeMovement == null || typeMovement.isEmpty() || typeMovement.isBlank()) {
            this.typeMovement = "Нет данных";
        } else {
            this.typeMovement = typeMovement;
        }

        public String getTypeMovement() {
            return typeMovement;
        }

    }
}