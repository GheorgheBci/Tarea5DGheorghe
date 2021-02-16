package daw.gheorghe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jorge
 */
public class Domino {

    // Estructura Set que contendra un conjunto de fichas de domino
    private Set<FichaDomino> conjuntoFichas;

    // Constructor por defecta que inicializa la estructura Set y además crea todas las fichas del domino
    public Domino() {
        this.conjuntoFichas = new HashSet<>();

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                conjuntoFichas.add(new FichaDomino(i, j));
            }
        }
    }

    // Método para obtener el número total de fichas que hay en la lista
    public int numeroFichas() {
        return conjuntoFichas.size();
    }

    // Método para añadir una ficha en la lista
    public void introducirFicha(FichaDomino aux) {
        conjuntoFichas.add(aux);
    }

    // Método para ver si la lista está vacia o no
    public boolean tieneFicha() {
        return conjuntoFichas.isEmpty();
    }

    // Método para ver si la ficha que pasamos por parametos se encuentra en la lista
    public boolean estaLaFicha(FichaDomino aux) {
        return conjuntoFichas.contains(aux);
    }

    // Método que pasa todas las fichas a un ArrayList y luego los elimina de la estructura Set
    public ArrayList<FichaDomino> sacarFichas() {
        ArrayList<FichaDomino> fichas = new ArrayList<>(conjuntoFichas);

        return fichas;
    }

    // Método para eliminar la ficha que pasemos por parametros
    public void eliminarFicha(FichaDomino aux) {
        if (conjuntoFichas.contains(aux)) {
            conjuntoFichas.remove(aux);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Domino{" + "conjuntoFichas=" + conjuntoFichas + '}';
    }
}
