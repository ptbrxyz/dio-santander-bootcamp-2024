import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        //Number valor = Double.valueOf("a1.75");
        // Number valor = NumberFormat.getInstance().parse("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}
