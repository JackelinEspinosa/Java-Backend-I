// La clase HeladoSuave implementa la interfaz Helado y representa un tipo de helado suave sin ninguna adición.
public class HeladoSuave implements Helado {

    // Implementación del método getDescription definido en la interfaz Helado.
    @Override
    public String getDescription() {
        // Devuelve la descripción del helado suave, que es "Helado Suave".
        return "Helado Suave";
    }

    // Implementación del método getPrice definido en la interfaz Helado.
    @Override
    public int getPrice() {
        // Devuelve el precio del helado suave, que es 30 unidades.
        return 30;
    }
}
