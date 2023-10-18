public class MotorElectricoAdapter extends Motor {
  // Definición de la clase MotorElectricoAdapter que extiende la clase Motor

  private MotorElectrico motorElectrico;
  // Declaración de una variable de instancia llamada "motorElectrico" de tipo MotorElectrico.

  public MotorElectricoAdapter() {
    super();
    // Constructor de la clase MotorElectricoAdapter que llama al constructor de la clase base (Motor).
    this.motorElectrico = new MotorElectrico();
    // Inicializa la variable "motorElectrico" creando una instancia de MotorElectrico.
    System.out.println("Creando motor eléctrico adapter");
    // Imprime un mensaje indicando que se está creando un motor eléctrico adapter.
  }

  @Override
  public void encender() {
    System.out.println("Encendiendo motorElectricoAdapter");
    // Implementación del método "encender" de la clase Motor.
    // Muestra un mensaje indicando que el motor eléctrico adapter se está encendiendo.
    this.motorElectrico.conectar();
    this.motorElectrico.activar();
    // Llama a métodos del motor eléctrico para conectarlo y activarlo.
  }

  @Override
  public void acelerar() {
    System.out.println("Acelerando motor eléctrico...");
    // Implementación del método "acelerar" de la clase Motor.
    // Muestra un mensaje indicando que el motor eléctrico adapter se está acelerando.
    this.motorElectrico.moverMasRapido();
    // Llama al método del motor eléctrico para moverlo más rápido.
  }

  @Override
  public void apagar() {
    System.out.println("Apagando motor eléctrico");
    // Implementación del método "apagar" de la clase Motor.
    // Muestra un mensaje indicando que el motor eléctrico adapter se está apagando.
    this.motorElectrico.detener();
    this.motorElectrico.desconectar();
    // Llama a métodos del motor eléctrico para detenerlo y desconectarlo.
  }
}