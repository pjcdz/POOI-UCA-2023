// public class clase0915 {
//     public static void main(String args[]) {
//         Persona persona = new Persona("Juan Perez", 30, 'M');

//         System.out.println("Info");

//         System.out.println(persona.getNombre());
//         System.out.println(persona.getEdad());
//         System.out.println(persona.getGenero());
//     }
// }

// class Persona {
//     String nombre;
//     int edad;
//     char genero;

//     Persona(String nombre, int edad, char genero) {
//         this.nombre = nombre;
//         this.edad = edad;
//         this.genero = genero;
//     }
    
//     String getNombre() {
//         return nombre;
//     }

//     void setNombre(String newName) {
//         nombre = newName;
//     }

//     int getEdad() {
//         return edad;
//     }

//     void setEdad(int newAge) {
//         edad = newAge;
//     }

//     char getGenero() {
//         return genero;
//     }

//     void setGenero(char newGenero) {
//         genero = newGenero;
//     }
// }

// ########################################################################################################################

// import java.util.Scanner;

// public class clase0915 {
//     public static void main(String args[]) {
//         // CuentaBancaria cuentaBancaria = new CuentaBancaria("Pablo Cardozo", 100);

//         // System.out.println("Info: ");
//         // System.out.println(cuentaBancaria.getTitular());
//         // System.out.println(cuentaBancaria.getSaldo());

//         // System.out.println("Ingreso de 300");
//         // cuentaBancaria.depositar(300);

//         // System.out.println("Info: ");
//         // System.out.println(cuentaBancaria.getTitular());
//         // System.out.println(cuentaBancaria.getSaldo());

//         // System.out.println("Retiro de 100");
//         // cuentaBancaria.retirar(100);

//         // System.out.println("Info: ");
//         // System.out.println(cuentaBancaria.getTitular());
//         // System.out.println(cuentaBancaria.getSaldo());

//         CuentaBancaria cuenta1 = new CuentaBancaria("Pablo", 100);
//         CuentaBancaria cuenta2 = new CuentaBancaria("Sol", 1000);
//         Banco banco = new Banco();

//         System.out.println("--------  Info: --------  ");   
//         System.out.println(cuenta1.getSaldo());
//         System.out.println(cuenta2.getSaldo());

//         // cuenta2.realizarTransferencia(100, cuenta1); // forma 1
//         banco.realizarTransferencia(100, cuenta2, cuenta1); // forma 2

//         System.out.println("--------  Info: --------  ");   
//         System.out.println(cuenta1.getSaldo());
//         System.out.println(cuenta2.getSaldo());

//     }
// }

// class Banco {
//     void realizarTransferencia(double cantidad, CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino) {
//         cuentaOrigen.retirar(cantidad);
//         cuentaDestino.depositar(cantidad);
//     }
// }

// class CuentaBancaria {
//     String titular;
//     double saldo;

//     CuentaBancaria(String titular, double saldo) {
//         this.titular = titular;
//         this.saldo = saldo;
//     }

//     String getTitular() {
//         return titular;
//     }

//     double getSaldo() {
//         return saldo;
//     }

//     void depositar(double cantidad) {
//         saldo += cantidad;
//     }

//     void retirar(double cantidad) {
//         saldo -= cantidad;
//     }

//     // void depositar(double cantidad, CuentaBancaria cuenta) {
//     //     cuenta.saldo += cantidad;
//     // }

//     // void retirar(double cantidad, CuentaBancaria cuenta) {
//     //     cuenta.saldo -= cantidad;
//     // }

//     // void realizarTransferencia(double cantidad, CuentaBancaria cuentaDestino) {
//     //     retirar(cantidad, this);
//     //     depositar(cantidad, cuentaDestino);
//     // }
// }

// ########################################################################################################################

// public class clase0915 {
//     public static void main(String args[]) {
//         // System.out.println("asd");
//         // Vehiculo vehiculo = new Vehiculo("Toyota", "Prius");
//         // vehiculo.acelerar();
//         // vehiculo.frenar();
//         Auto auto = new Auto("Toyota", "Prius", "Cuero");
//         auto.acelerar();
//         auto.frenar();
//     }
// }

// class Vehiculo {
//     String marca;
//     String modelo;
//     boolean enMovimiento = false;

//     Vehiculo(String marca, String modelo) {
//         this.marca = marca;
//         this.modelo = modelo;
//     }

//     void acelerar() {
//         enMovimiento = true;
//         System.out.println("El vehiculo esta en marcha: " + enMovimiento);
//     }

//     void frenar() {
//         if (enMovimiento) {
//             enMovimiento = false;
//             System.out.println("El vehiculo esta en marcha: " + enMovimiento);
//         }
//     }
// }

// class Auto extends Vehiculo {
//     String materialAsientos;

//     Auto(String marca, String modelo, String materialAsientos) {
//         super(marca, modelo);
//         this.materialAsientos = materialAsientos;
//     }

//     void acelerar() {
//         System.out.print("Auto: Se saca el freno de mano y aprieta el acelerador con el pie. ");
//         super.acelerar();
//     }

//     void frenar() {
//         System.out.print("Auto: Se aprieta el freno con el pie y se coloca el freno de mano. ");
//         super.frenar();
//     }
// }