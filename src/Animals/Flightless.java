package Animals;


    public  class Flightless extends Birds {

    private String typeMovement;

    private  Flightless(String livingEnvironment, String typeMovement) {
        super(livingEnvironment);
        if (typeMovement == null || typeMovement.isEmpty() || typeMovement.isBlank()) {
            this.typeMovement = "Нет данных";
        } else {
            this.typeMovement = typeMovement;
        }
    }

        public String getTypeMovement() {

            return typeMovement;
        }

        private void walk() {

        }

        public void setTypeMovement(String typeMovement) {
            this.typeMovement = typeMovement;
        }

        @Override
        public void hunt() {

        }
    }