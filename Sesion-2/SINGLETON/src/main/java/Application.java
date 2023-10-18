public class Application  {

    public static void main(String[] args) {
     // Obtener una instancia de Singleton con el valor "FOO"
      Singleton singleton = Singleton.getInstance("FOO");
      // Obtener otra instancia de Singleton con el valor "BAR"
      Singleton anotherSingleton = Singleton.getInstance("BAR");
    // Imprimir el valor de la primera instancia (debería ser "FOO")+
      System.out.println(singleton.value);
    // Imprimir el valor de la segunda instancia (también debería ser "FOO")
      System.out.println(anotherSingleton.value);
      }
     }