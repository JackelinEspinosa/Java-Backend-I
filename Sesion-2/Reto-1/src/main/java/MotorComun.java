public class MotorComun extends Motor {
  // Declaración de una clase llamada MotorComun que hereda de la clase Motor

  public MotorComun() {
    super();
    // Constructor de la clase MotorComun que llama al constructor de la clase base (Motor)
    System.out.println("Creando el motor común");
    // Imprime un mensaje que indica que se está creando un motor común
  }

  @Override
  public void encender() {
    // Implementación del método abstracto "encender" de la clase base (Motor)
    System.out.println("Encendiendo motor común");
    // Imprime un mensaje que indica que el motor común se está encendiendo
  }

  @Override
  public void acelerar() {
    // Implementación del método abstracto "acelerar" de la clase base (Motor)
    System.out.println("Acelerando el motor común");
    // Imprime un mensaje que indica que el motor común se está acelerando
  }

  @Override
  public void apagar() {
    // Implementación del método abstracto "apagar" de la clase base (Motor)
    System.out.println("Apagando motor común");
    // Imprime un mensaje que indica que el motor común se está apagando
  }
}