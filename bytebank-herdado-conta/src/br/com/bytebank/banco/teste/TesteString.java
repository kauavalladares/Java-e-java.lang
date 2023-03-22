package br.com.bytebank.banco.teste;

public class TesteString {


    public static void main(String[] args) {

        int a = 3;
        String nome = "kauã"; //object literal4
        String vazio = " ";
        String outrovazio = vazio.trim();

        System.out.println(outrovazio);
        System.out.println(vazio.isEmpty());
        System.out.println(nome.contains("kau"));


        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

       String sub = nome.substring(1);
        System.out.println(sub);

      int  pos =  nome.lastIndexOf("ka");
      System.out.println(pos);

        char c = nome.charAt(2);
        System.out.println(c);
       // char c = 'k';

        String outra = nome.replace("k","K");

        nome.toUpperCase();

        System.out.println(nome);
        System.out.println(outra);



    }
}
