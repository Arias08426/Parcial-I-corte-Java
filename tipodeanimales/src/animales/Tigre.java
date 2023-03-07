package animales;

abstract public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String especieTigre, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras,velocidad,habitat,altura,largo,peso);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza solitario en " + habitad;
    }

    @Override
    public String dormir() {
        return "El Tigre " + especieTigre + " duerme en " + habitad;
    }

    @Override
    public String correr() {
        return "El Tigre " + especieTigre + " corre a una velocidad " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre ruge";
    }
}
