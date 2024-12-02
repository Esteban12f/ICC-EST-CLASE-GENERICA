public class App {
    public static void main(String[] args) throws Exception {
        ClaseGenerica <String> objString = new ClaseGenerica<String>("Hola");
        objString.tipoClase();

        ClaseGenerica <Integer> objInt = new ClaseGenerica<Integer>(40);
        objInt.tipoClase();
    }
}
