package daw.gheorghe;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class PruebaDomino {

    public static void main(String[] args) {

        Domino aux = new Domino();

        System.out.println("Todas las fichas del domino");
        System.out.println(aux);

        System.out.println("");

        System.out.println("Hay un total de " + aux.numeroFichas() + " fichas");

        System.out.println("");

        // Vamos a añadir la ficha [5|5], pero como ya está en la lista no se va a añadir gracias a que la interfaz set no permite añadir un objeto que este duplicado
        aux.introducirFicha(new FichaDomino(5, 5));

        System.out.println("No se ha añadido la ficha [5|5] porque ya se encuentra en la lista");
        System.out.println(aux);

        System.out.println("");

        System.out.println("¿Está vacia la lista? " + aux.tieneFicha());

        System.out.println("");

        // Vamos a buscar si las fichas [2|5] y [6|6] están en la lista
        FichaDomino f1 = new FichaDomino(2, 5);
        FichaDomino f2 = new FichaDomino(6, 6);

        System.out.println("¿Está la ficha [2|5] en la lista? " + aux.estaLaFicha(f1));
        System.out.println("¿Está la ficha [6|6] en la lista? " + aux.estaLaFicha(f2));

        System.out.println("");

        // Vamos a borrar la ficha [6|6]
        aux.eliminarFicha(f2);
        
        System.out.println(aux);
        
        System.out.println("");
        
        System.out.println("Pasamos todas las fichas en un ArrayList");
        ArrayList<FichaDomino> fichas = aux.sacarFichas();
        
        for (FichaDomino ficha : fichas) {
            System.out.println(ficha);
        }
        
        System.out.println("");

        System.out.println("Por tanto ahora hay un total de " + aux.numeroFichas() + " fichas");
        
    }
}
