package animales;

abstract public class Guepardo extends Felino{
    public Guepardo(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso);
    }

    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Guepardo en lo alto de una duna en el inmenso desierto del Kalahari";
    }

    @Override
    public String correr() {
        return "El Guepardo es el felino mas rapido del mundo, corre a una velocidad de " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo ruge muy fuerte";
    }
}
