import java.util.Map;

public class Main {


    public static void main(String[] args) {
        // Crear grafo con 58 nodos (50 clientes + 8 centros)
        GrafoLogistica grafo = new GrafoLogistica(58);

        // Cargar las rutas desde el archivo
       grafo.cargarRutas("C:\\Users\\janin\\IdeaProjects\\TPO_Martes\\src\\rutas.txt");

        int centroDistribucion = 50;

        // Calcular costos hacia los clientes
        int[] costos = grafo.dijkstraDesdeCentro(centroDistribucion);

        // Imprimir los costos
        grafo.imprimirCostos(costos);

        // Ejemplos de consultas
        //System.out.println("\nConexiones del nodo:");
        //for (GrafoLogistica.Arista arista : grafo.getVecinos(51)) {
            //System.out.println("→ Conectado con nodo " + arista.destino +
                    //" con costo " + arista.costo);
        //}
    }
}