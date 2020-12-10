package algoritmosia;

import java.util.ArrayList;

public class BusquedaAvara {

    public BusquedaAvara() {
        llenarArbol();
        datosDeDistancia();
    }

    private final ArrayList<Colonia> colonias = new ArrayList<>();
    private final ArrayList<int[]> arbol = new ArrayList<>();

    private void llenarArbol() {
        arbol.add(new int[] {14, 15, 18});
        arbol.add(new int[] {5, 13});
        arbol.add(new int[] {6, 7, 8, 9, 12, 22});
        arbol.add(new int[] {10, 14, 19});
        arbol.add(new int[] {1, 11, 20});
        arbol.add(new int[] {6, 10});
        arbol.add(new int[] {2, 5, 10, 12});
        arbol.add(new int[] {2, 16, 22});
        arbol.add(new int[] {2, 13});
        arbol.add(new int[] {2, 18});
        arbol.add(new int[] {3, 5, 6});
        arbol.add(new int[] {4, 17});
        arbol.add(new int[] {2, 6, 18, 14});
        arbol.add(new int[] {1, 8});
        arbol.add(new int[] {0, 3, 12, 15, 19});
        arbol.add(new int[] {0, 14, 19});
        arbol.add(new int[] {7, 20});
        arbol.add(new int[] {11});
        arbol.add(new int[] {0, 9, 12});
        arbol.add(new int[] {3, 14, 15, 21});
        arbol.add(new int[] {4, 16, 22});
        arbol.add(new int[] {19});
        arbol.add(new int[] {2, 7, 20});
    }

    private void datosDeDistancia() {
        colonias.add(new Colonia(0, "Azcorra", 4.4f));
        colonias.add(new Colonia(1, "Campestre", 6.0f));
        colonias.add(new Colonia(2, "Centro", 0));
        colonias.add(new Colonia(3, "Cortes Sarmiento", 4.3f));
        colonias.add(new Colonia(4, "Chuburna Hidalgo", 5.2f));
        colonias.add(new Colonia(5, "Chuminópolis", 3.8f));
        colonias.add(new Colonia(6, "Esperanza", 3.1f));
        colonias.add(new Colonia(7, "Garcia Ginerés", 3.2f));
        colonias.add(new Colonia(8, "Itzimná", 5.7f));
        colonias.add(new Colonia(9, "Las Palmas", 4.3f));
        colonias.add(new Colonia(10, "Lazaro Cardenas", 4.4f));
        colonias.add(new Colonia(11, "Linda Vista Chuburna", 6.8f));
        colonias.add(new Colonia(12, "Lourdes", 2.8f));
        colonias.add(new Colonia(13, "Mexico", 7.5f));
        colonias.add(new Colonia(14, "Mira Flores", 5.0f));
        colonias.add(new Colonia(15, "Mira Flores II", 5.6f));
        colonias.add(new Colonia(16, "Pensiones", 5.6f));
        colonias.add(new Colonia(17, "San Luis", 7.0f));
        colonias.add(new Colonia(18, "San Jose", 7.1f));
        colonias.add(new Colonia(19, "San Jose Vergel", 5.6f));
        colonias.add(new Colonia(20, "Tanlum", 5.5f));
        colonias.add(new Colonia(21, "Vergel II", 6.8f));
        colonias.add(new Colonia(22, "Yucatan", 3.7f));
    }

    public String[] getColoniasNombres() {
        String[] colonias = new String[this.colonias.size()];
        for (Colonia colonia : this.colonias) {
            colonias[colonia.getId()] = colonia.getNombre();
        }
        return colonias;
    }

    public float distanciaCumulada = 0.0f;

    public float getDistanciaCumulada(int inicio) {
        return distanciaCumulada + colonias.get(inicio).getDistancia();
    }

    public String calcularDistancia(int inicio, int fin) {
        Colonia colonia = buscarMenor(arbol.get(inicio));
        distanciaCumulada += colonia.getDistancia();
        if (fin == colonia.getId() || inicio == fin) return colonias.get(fin).getNombre() + " ";
        else return colonia.getNombre() + " -> " + calcularDistancia(colonia.getId(), fin);
    }

    private Colonia buscarMenor(int[] nodos) {
        Colonia colonia = colonias.get(nodos[0]);
        for (int k = 1; k < nodos.length; k += 1) {
            if (colonia.getDistancia() > colonias.get(nodos[k]).getDistancia())
                colonia = colonias.get(nodos[k]);
        }
        return colonia;
    }
}
