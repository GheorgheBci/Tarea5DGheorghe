package daw.gheorghe;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class FichaDomino {

    // Atributos privados de la clase FichaDomino
    private int parteArriba;
    private int parteAbajo;

    // Constructor parametrizado que controla si pasamos una ficha que no es correcta
    public FichaDomino(int parteArriba, int parteAbajo) {
        this.parteArriba = parteArriba;
        if (this.parteArriba < 0 || this.parteArriba > 7) {
            if (this.parteArriba % 2 == 0) {
                this.parteArriba = 6;
            } else {
                this.parteArriba = 5;
            }
        }

        this.parteAbajo = parteAbajo;
        if (this.parteAbajo < 0 || this.parteAbajo > 7) {
            if (this.parteAbajo % 2 == 0) {
                this.parteAbajo = 6;
            } else {
                this.parteAbajo = 5;
            }
        }
    }

    // Constructor por defecto que inicializa a 0 la ficha
    public FichaDomino() {
        this.parteArriba = 0;
        this.parteAbajo = 0;
    }

    // Método para obtener la suma entre la parte de arriba y la parte de abajo de la ficha
    public byte getValorTotal() {
        return (byte) (this.parteArriba += this.parteAbajo);
    }

    // Método para generar una ficha aleatoria
    public static FichaDomino generaFichaAleatoria() {
        Random ran = new Random();

        FichaDomino ficha = new FichaDomino();

        ficha.parteArriba = ran.nextInt(7);
        ficha.parteAbajo = ran.nextInt(7);

        return ficha;
    }

    // Getters y setters
    public int getParteArriba() {
        return parteArriba;
    }

    public int getParteAbajo() {
        return parteAbajo;
    }

    public void setParteArriba(int parteArriba) {
        this.parteArriba = parteArriba;
        if (this.parteArriba < 0 || this.parteArriba > 7) {
            if (this.parteArriba % 2 == 0) {
                this.parteArriba = 6;
            } else {
                this.parteArriba = 5;
            }
        }
    }

    public void setParteAbajo(int parteAbajo) {
        this.parteAbajo = parteAbajo;
        if (this.parteAbajo < 0 || this.parteAbajo > 7) {
            if (this.parteAbajo % 2 == 0) {
                this.parteAbajo = 6;
            } else {
                this.parteAbajo = 5;
            }
        }
    }

    // toString 
    @Override
    public String toString() {
        if (this.parteArriba == 0 && this.parteAbajo == 0) {
            return "[ | ]";
        } else if (this.parteArriba == 0) {
            return "[ |" + this.parteAbajo + "]";
        } else if (this.parteAbajo == 0) {
            return "[" + this.parteArriba + "|" + " ]";
        }

        return "[" + this.parteArriba + "|" + this.parteAbajo + "]";
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.parteArriba;
        hash = 23 * hash + this.parteAbajo;
        return hash;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaDomino other = (FichaDomino) obj;
        if (this.parteArriba != other.parteArriba) {
            return false;
        }
        if (this.parteAbajo != other.parteAbajo) {
            return false;
        }
        return true;
    }
}
