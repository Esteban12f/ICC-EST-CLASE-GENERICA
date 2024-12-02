public class ClaseGenerica <T> {
    /*
     * El termino "<T>" indica y especifica que la clase sera generica lo cual nos permite 
     * crear una variable con un valor generico (double, String, Integer)
     */

    T atributo; // Se crea la variable q tendra un valor generico

    public ClaseGenerica(T atributo2) { // Se crea un constructor que recibira un parametro generico
        this.atributo = atributo2; 
        /*El atributo inicialmente creado tomara el 
        valor del parametro q recibe el constructor */ 
    }

    public void tipoClase(){ //Metodo para imprimir el tipo de la clase
        System.out.println("El tipo de dato T es: " + atributo.getClass());
    }
    
}
