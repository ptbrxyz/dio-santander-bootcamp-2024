public class SmartTv {

    // Atributos de classe:
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Métodos:
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para " + volume);
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
