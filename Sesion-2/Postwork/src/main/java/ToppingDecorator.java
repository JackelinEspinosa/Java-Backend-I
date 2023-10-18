// La clase ToppingDecorator implementa la interfaz Helado y actúa como un decorador para agregar funcionalidad adicional a un objeto de tipo Helado.
public class ToppingDecorator implements Helado {

    private Helado helado; // Se declara una variable miembro para mantener una referencia al helado original.

    // Constructor de la clase ToppingDecorator que recibe un objeto de tipo Helado como argumento.
    public ToppingDecorator(Helado helado) {
        this.helado = helado; // Se asigna el helado pasado como argumento al objeto helado de esta instancia de ToppingDecorator.
    }

    // Implementación del método getDescription definido en la interfaz Helado.
    @Override
    public String getDescription() {
        // Se obtiene la descripción del helado original llamando al método getDescription en el objeto helado y se agrega ", con Topping extra".
        return helado.getDescription() + ", con Topping extra";
    }

    // Implementación del método getPrice definido en la interfaz Helado.
    @Override
    public int getPrice() {
        // Se obtiene el precio del helado original llamando al método getPrice en el objeto helado y se le suma 20 unidades.
        return helado.getPrice() + 20;
    }
}
