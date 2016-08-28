
package SobreCarga;


public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(int centrox, int centroy, int raio) {
        this.centrox = centrox;
        this.centroy = centroy;
        this.setRaio(raio);
    }

    public Circulo(int centrox, int centroy) {
        this(centrox, centroy, 1);
    }

    public Circulo(int raio) {
        this(1,1,raio);
    }
        
    public int getCentrox() {
        return centrox;
    }

    public void setCentrox(int centrox) {
        this.centrox = centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public void setCentroy(int centroy) {
        this.centroy = centroy;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        if (raio <= 0)
            raio = 1;
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "(" + centrox + ", " + centroy + "), raio=" + raio + '}';
    }
    
    
}
 