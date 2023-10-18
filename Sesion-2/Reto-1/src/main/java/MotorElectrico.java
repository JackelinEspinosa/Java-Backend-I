public class MotorElectrico {
  // Definición de la clase MotorElectrico

  private boolean conectado = false;
  // Declaración de una variable de instancia privada llamada "conectado" de tipo booleano.

  public MotorElectrico() {
    System.out.println("Creando motor eléctrico");
    // Constructor de la clase MotorElectrico que se ejecuta al crear una instancia de la clase.
    this.conectado = false; // Inicializa la variable "conectado" como falso.
  }

  public void conectar() {
    System.out.println("Conectando motor eléctrico");
    // Método público que imprime un mensaje indicando que el motor eléctrico se está conectando.
    this.conectado = true; // Establece la variable "conectado" como verdadero.
  }

  public void activar() {
    if (!this.conectado) {
      System.out.println(
        "No se puede activar porque no está conectado el motor eléctrico"
      );
    } else {
      System.out.println("Está conectado, activando motor eléctrico....");
    }
    // Método que verifica si el motor está conectado y muestra un mensaje apropiado.
  }

  public void moverMasRapido() {
    if (!this.conectado) {
      System.out.println(
        "No se puede mover rápido el motor eléctrico porque no está conectado..."
      );
    } else {
      System.out.println("Moviendo más rápido...aumentando voltaje");
    }
    // Método que verifica si el motor está conectado y muestra un mensaje apropiado.
  }

  public void detener() {
    if (!this.conectado) {
      System.out.println(
        "No se puede detener motor eléctrico porque no está conectado"
      );
    } else {
      System.out.println("Deteniendo motor eléctrico");
    }
    // Método que verifica si el motor está conectado y muestra un mensaje apropiado.
  }

  public void desconectar() {
    System.out.println("Desconectando motor eléctrico...");
    this.conectado = false; // Establece la variable "conectado" como falso.
  }
  // Método que imprime un mensaje indicando que el motor eléctrico se está desconectando.
}