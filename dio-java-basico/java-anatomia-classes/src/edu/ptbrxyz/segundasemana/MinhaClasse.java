package edu.ptbrxyz.segundasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {
        //System.out.print("Olá turma, sejam bem-vindos!");

        // String meuNome = "Ptbr";
        // int anoFabricacao = 2022;
        // boolean verdadeira = true;
        // anoFabricacao = 2018;

        String primeiroNome = "Maria";
        String segundoNome = "Silveira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}