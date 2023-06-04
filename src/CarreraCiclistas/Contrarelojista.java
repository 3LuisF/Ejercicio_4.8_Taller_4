package CarreraCiclistas;

public class Contrarelojista extends Ciclista {
    private double velocidadMaxima;
    public Contrarelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    protected double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " + velocidadMaxima);
    }
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
