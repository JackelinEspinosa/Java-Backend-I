public class Application {
  // Definición de la clase Application

  public static void main(String[] args) {
    // Método principal que se ejecuta al iniciar la aplicación Java

    Motor motor = new MotorElectricoAdapter();
    // Creación de una instancia de Motor y asignación de un objeto de tipo MotorElectricoAdapter a la variable "motor".
    // Se utiliza un adaptador para adaptar un motor eléctrico a la interfaz de un motor convencional.

    motor.encender();
    // Llama al método "encender" del motor, que ha sido adaptado para el motor eléctrico.
    // En realidad, esto se traduce en encender el motor eléctrico.

    motor.acelerar();
    // Llama al método "acelerar" del motor, que ha sido adaptado para el motor eléctrico.
    // Esto se traduce en acelerar el motor eléctrico.

    motor.apagar();
    // Llama al método "apagar" del motor, que ha sido adaptado para el motor eléctrico.
    // Esto se traduce en apagar el motor eléctrico.
  }
}