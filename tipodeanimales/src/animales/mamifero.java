package animales;

abstract public class mamifero {
        protected String habitad;
        protected Float altura;
        protected Float peso;
        protected Float largo;
        protected String nombreCientifico;

        public mamifero(String habitad, Float altura, Float peso, Float largo,  String nombreCientifico){
            this.habitad = habitad;
            this.altura = altura;
            this.peso = peso;
            this.largo = largo;
            this.nombreCientifico = nombreCientifico;
        }

        public String getHabitad() {
            return habitad;
        }
            public mamifero() {
            }

            public float getAltura() {
                return altura;
            }

            public float getLargo() {
                return largo;
            }

            public String getNombreCientifico() {
                return nombreCientifico;
            }

            public float getPeso() {
                return peso;
            }
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
        }


