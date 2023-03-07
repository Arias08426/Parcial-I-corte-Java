package animales;

abstract public class Felino extends mamifero{
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitad, Float altura, Float peso, Float largo, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitad, altura, peso, largo, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(float tamanoGarras, int velocidad) {
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
