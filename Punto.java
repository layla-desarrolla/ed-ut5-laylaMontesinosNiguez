package practica5;

public class Punto {
    private double x;//atributos
    private double y;

    public Punto(double x, double y) {//constructor parametrizado
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx){
        this.x += dx;
    }//hacemos que se desplace el punto en el eje x

    public void desplazaY(double dy){
        this.y += dy;
    }//hacemos que se desplace el punto en el eje y

    public void desplaza(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }//hacemos que el punto se desplace en ambos ejes

    public double distanciaEuclidea(Punto otro){
        return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
    }//calculamos la distancia euclidea de dos puntos

    public void muestra(){
        System.out.println("La X es: " + this.x + ", y la Y es: " + this.y);
    }//sacamos por pantalla el resultado
}
