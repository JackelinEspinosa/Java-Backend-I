public class Heladeria {

    public static void main(String [] args) {
        // Se crea un objeto HeladoSuave.
        Helado suave = new HeladoSuave();
        
        // Se decoran el objeto suave con múltiples decoradores para agregar características adicionales.
        suave = new CoberturaDecorator(suave);
        suave = new GranolaDecorator(suave);
        suave = new ToppingDecorator(suave);
        suave = new MermeladaDecorator(suave);
        suave = new GalletaDecorator(suave);
  
        System.out.println("[Ticket de compra]");
        // Se imprime la descripción del helado decorado, que incluye todas las características agregadas.
        System.out.println(suave.getDescription());
        // Se imprime el precio total del helado decorado.
        System.out.println("$" + suave.getPrice());
    }
}
