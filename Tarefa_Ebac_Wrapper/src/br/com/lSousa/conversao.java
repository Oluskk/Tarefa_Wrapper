package br.com.lSousa;

public class conversao {
    public static void main (String args[]){
        int valorNumerico = 100; //valor numerico
        Integer numeroWrapper = valorNumerico; //autoboxing

        //impressão dos valores
        System.out.println("Valor primitivo (int): " + valorNumerico);
        System.out.println("Valor convertido para Wrapper (Integer):" + numeroWrapper);

        //impressão de casting (exemplo de conversão para double)
        double numeroconvertido = (double)valorNumerico; //casting explicito
        System.out.println("Valor convertido para Double (Casting):" + valorNumerico);
    }
}
