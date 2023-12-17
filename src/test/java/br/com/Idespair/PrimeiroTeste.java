package br.com.Idespair;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroTeste {
    @Test
    public void test(){

        List<String> pessoas = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();
        pessoas.add("Ana-Feminino");

        for (String i : pessoas){
            if (i.contains("Feminino")){
                mulheres.add(i);
            }
        }
        Assert.assertEquals("Ana-Feminino",mulheres.get(0));
        }
}
