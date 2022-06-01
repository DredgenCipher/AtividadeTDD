package DifDiagonal;

public class DifDiagonal {
    public int[][] arrayquadrada;
    int size;
    int row;
    int column;
    int diagmain;
    int diagsec;
    int difdiagonais;
    int absoulto_diag;

    public int getTamanho() {
        for (int i = 0; i < arrayquadrada.length; i++) {
            row = arrayquadrada.length;
            column = arrayquadrada[i].length;
        }
        size = row + column;
        return size;
    }

    public int sizemin() {
        return arrayquadrada.length;
    }

    public int somadprincipal() {
        for (int i = 0; i < arrayquadrada.length; i++) {
            for (int j = 0; j < arrayquadrada.length; j++) {
                if (i == j) {
                    diagmain += arrayquadrada[i][j];
                }
            }
        }
        return diagmain;
    }

    public int somadsecundaria() {
        int n;
        n = arrayquadrada.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)){
                    diagsec += arrayquadrada[i][j];
                }
            }
        }

        return diagsec;
    }

    public int sub_diags() {
        difdiagonais = somadprincipal() - somadsecundaria();
        return difdiagonais;
    }

    public int adiagonais() {
        absoulto_diag = Math.abs(sub_diags());
        return absoulto_diag;
    }
}
