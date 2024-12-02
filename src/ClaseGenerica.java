public class ClaseGenerica <T> {
    T atributo;

    public ClaseGenerica(T atributo2) {
        this.atributo = atributo2;
    }

    public void tipoClase(){
        System.out.println("El tipo de dato T es: " + atributo.getClass());
    }
    
}
