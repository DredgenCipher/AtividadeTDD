package Palindromo;

import java.util.Locale;

public class Palindromo {
    String caracteres;
    String inverted;


    public String makeLower() {
        return caracteres.toLowerCase();
    }

    public String makepalin() {


        inverted = makeLower();
        StringBuilder stbuild = new StringBuilder(inverted);
        inverted = stbuild.reverse().toString();


        return inverted;
    }
}
