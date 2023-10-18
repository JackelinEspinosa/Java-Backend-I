// La clase GranolaDecorator implementa la interfaz Helado y actúa como un decorador para agregar funcionalidad adicional a un objeto de tipo Helado.
public class GranolaDecorator implements Helado {

    private Helado helado; // Se declara una variable miembro para mantener una referencia al helado original.

    // Constructor de la clase GranolaDecorator que recibe un objeto de tipo Helado como argumento.
    public GranolaDecorator(Helado helado) {
        this.helado = helado; // Se asigna el helado pasado como argumento al objeto helado de esta instancia de GranolaDecorator.
    }

    // Implementación del método getDescription definido en la interfaz Helado.
    @Override
    public String getDescription() {
        // Se obtiene la descripción del helado original llamando al método getDescription en el objeto helado y se agrega ", con Granola extra".
        return helado.getDescription() + ", con Granola extra";
    }

    // Implementación del método getPrice definido en la interfaz Helado.
    @Override
    public int getPrice() {
        // Se obtiene el precio del helado original llamando al método getPrice en el objeto helado y se le suma 10 unidades.
        return helado.getPrice() + 10;
    }
}
