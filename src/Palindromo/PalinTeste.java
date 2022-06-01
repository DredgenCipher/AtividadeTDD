package Palindromo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalinTeste {

    //Teste para verificar se a frase ou palavra é válida
        //Testar para verificar se a conversão para minusculo foi como esperado
    @Test
    public void pw_val_1(){
        Palindromo pal = new Palindromo();
        pal.caracteres = "OMISSISSIMO";
        assertEquals("omississimo", pal.makeLower() );
    }
    @Test
    public void pw_val_2(){
        Palindromo pal = new Palindromo();
        pal.caracteres = "aNa";
        assertEquals("ana", pal.makeLower() );
    }
        //Testar para verificar se a palavra é um palindromo
    @Test
    public void pw_pal_1(){
        Palindromo pal = new Palindromo();
        pal.caracteres = "OMISSISSIMO";
        pal.makeLower();
        assertEquals("omississimo", pal.makepalin());
    }
    @Test
    public void pw_pal_2(){
        Palindromo pal = new Palindromo();
        pal.caracteres = "aNa";
        pal.makeLower();
        assertEquals("ana", pal.makepalin());
    }
}
