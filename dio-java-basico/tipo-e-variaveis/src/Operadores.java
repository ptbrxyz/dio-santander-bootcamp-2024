public class Operadores {
    public static void main(String[] args) {
        
        // Operadores.java
        boolean condicao1=true;
        boolean condicao2=true;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */
        if(condicao1 && condicao2)
            System.out.println("Os dois valores são verdadeiros.");

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.println("Um dos valores é verdadeiro.");

        //Com condição relacional.
        if(condicao1 && (4<7))
            System.out.println("Os dois valores são verdadeiros.");

        System.out.println("Fim.");




        // //classe Operadores.java
        // int numero1 = 1;
        // int numero2 = 2;

        // if(numero1 > numero2)
        //     System.out.println("Numero 1 maior que numero 2");


        // if(numero1 < numero2)
        //     System.out.println("Numero 1 menor que numero 2");

        // if(numero1 >= numero2)
        //     System.out.println("Numero 1 maior ou igual que numero 2");

        // if(numero1 <= numero2)
        //     System.out.println("Numero 1 menor ou igual que numero 2");

        // if(numero1 != numero2)
        //     System.out.println("Numero 1 é diferente de numero 2");

        // String nome1 = "MARIA";
        // String nome2 = new String("MARIA");
        // // System.out.println(nome1 == nome2);
        // System.out.println(nome1.equals(nome2));
        // classe Operadores.java
        // int a, b;
        // String resultado;

        // a = 6;
        // b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if(a==b)
        //    resultado = "verdadeiro";
        // else
        //    resultado = "falso";
        // System.out.println(resultado);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // resultado = (a==b) ? "verdadeiro" : "false";

        // System.out.println(resultado);
        
        
        
        //  // Booleans:
        //  boolean variavel = true;
        //  System.out.println(variavel);
        //  variavel = !variavel;
        //  System.out.println(variavel);

        
        // // repetição:
        // int numero = 5; // 5
        // numero = numero + 1;    // 6
        // System.out.println(numero); // 6
        
        // numero++;
        // System.out.println(numero); // 7
        // System.out.println(numero++); // valor é impresso antes do incremento, a variável é 8
        // System.out.println(++numero); // 9
        
        
       

        // int numero = 5;
        // System.out.println(-numero);
        // System.out.println(numero);

        // numero = -numero;
        // System.out.println(numero);

        // //numero = +numero; // não funciona
        // numero = (-1)*numero; 
        // System.out.println(numero);



        //qual o resultado das expressoes abaixo?
        // String concatenacao ="?"; 

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);
        
        // concatenacao = 1 + "1" + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);
        // System.out.println(concatenacao);




        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);
    }
}
