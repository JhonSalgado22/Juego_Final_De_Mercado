package tech.cybersys.videojuego_javafx.modelo;

public class Personaje {
    private String nombre;
    private String historia;
    private int salud;
    private int fuerza;
    private int inteligencia;
    private String clase;

    private Personaje() {}

    // Getters para cada atributo del personaje
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public String getClase() {
        return clase;
    }

    public String getHistoria() {
        return historia;
    }

    // Clase interna estática Builder
    public static class Builder {
        private String nombre;
        private String historia;
        private int salud;
        private int fuerza;
        private int inteligencia;
        private String clase;

        // Métodos de construcción que devuelven el Builder para encadenamiento
        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setSalud(int salud) {
            this.salud = salud;
            return this;
        }

        public Builder setFuerza(int fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        public Builder setInteligencia(int inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public Builder setClase(String clase) {
            this.clase = clase;
            return this;
        }
        public Builder setHistoria(String historia) {
            this.historia = historia;
            return this;
        }

        // Método build que crea una instancia de Personaje con los atributos configurados
        public Personaje build() {
            Personaje personaje = new Personaje();
            personaje.nombre = this.nombre;
            personaje.historia = this.historia;
            personaje.salud = this.salud;
            personaje.fuerza = this.fuerza;
            personaje.inteligencia = this.inteligencia;
            personaje.clase = this.clase;
            return personaje;
        }


    }
}
