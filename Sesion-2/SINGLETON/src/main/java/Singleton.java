public class Singleton {

    private static Singleton instance; // Almacena la única instancia de Singleton
    public String value; // Almacena un valor que puede ser configurado y accedido desde instancias de Singleton
  
    private Singleton(String value) {
      this.value = value; // Constructor privado para configurar el valor de Singleton
    }
  
    public static Singleton getInstance(String value) {
      if (instance == null) { // Si la instancia aún no se ha creado
        instance = new Singleton(value); // Crear una nueva instancia Singleton con el valor proporcionado
      }
  
      return instance; // Devolver la instancia única, creándola si es necesario
    }
  }
