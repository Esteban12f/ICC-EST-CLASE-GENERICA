public class App {
    public static void main(String[] args) throws Exception {
        ClaseGenerica <String> objString = new ClaseGenerica<String>("Hola"); 
        // Se crea un objeto especificando el tipo de dato que va a tener
        objString.tipoClase();
        // Se llama al metodo para imprimir el tipo de dato al que corresponde

        ClaseGenerica <Integer> objInteger = new ClaseGenerica<Integer>(40);
        objInteger.tipoClase();
    }
}
