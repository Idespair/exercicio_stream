package br.com.Idespair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stream {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome e sexo, separado por um traço");
        String input = scan.nextLine();
        System.out.println("Insira seu nome e sexo, separado por um traço");
        String input2 = scan.nextLine();
        System.out.println("Insira seu nome e sexo, separado por um traço");
        String input3 = scan.nextLine();

        List<String> pessoas = new ArrayList<>();
        pessoas.add(input);
        pessoas.add(input2);
        pessoas.add(input3);

        List<String> mulheres = new ArrayList<>();

        for (String i : pessoas){
            if (i.contains("Feminino")){
                mulheres.add(i);
            }
        }

        System.out.println("*********");
        System.out.println("*********");

        mulheres.forEach(n -> System.out.println(n));
    }

}
