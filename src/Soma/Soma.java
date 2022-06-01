package Soma;

public class Soma {

    int[] array;
    int soma_array;

    public int getTamanho() {
        return array.length;
    }

    public int soma() {
        for (int i = 0; i < array.length; i++) {
            soma_array += array[i];
        }
        return soma_array;
    }
}