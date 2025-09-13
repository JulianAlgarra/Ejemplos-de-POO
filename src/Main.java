//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Persona {
            private String nombre; // privado
            public String getNombre() {
                return nombre;
            }
            public void setNombre(String nuevoNombre) {
                nombre = nuevoNombre;
            }


                //Ejemplo Herencia
            // Clase padre (superclase)
            class Animal {
                void hacerSonido() {
                    System.out.println("El animal hace un sonido");
                }

                    public void dormir() {
                    }
                }

            // Clase hija (subclase) que hereda de Animal
            class Perr extends Animal {
                void moverCola() {
                    System.out.println("El perro mueve la cola");
                }

                @Override
                void hacerSonido() {

                }
            }
            public class HerenciaBasica {
                public void main(String[] args) {
                    Perr miPerro = new Perr();

                    // Puede usar métodos de la clase padre
                    miPerro.hacerSonido();

                    // Y también los propios
                    miPerro.moverCola();
                }
            }

                 //Ejemplo Polimorfismo
            // Clase padre (superclase)
            class Animal_1 {
                void hacerSonido() {
                    System.out.println("El animal hace un sonido");
                }
            }
            // Clase hija 1
            class Perro extends Animal {
                @Override
                void hacerSonido() {
                    System.out.println("El perro ladra: ¡Guau guau!");
                }
            }
            // Clase hija 2
            class Gato extends Animal {
                //@Override es una anotación que se coloca encima de un método
                //para indicar que ese método está sobrescribiendo un método que ya existe
                @Override
                void hacerSonido() {
                    System.out.println("El gato maúlla: ¡Miau!");
                }
            }
            // Clase principal
            public class PolimorfismoBasico {
                public void main(String[] args) {
                    // Polimorfismo: un objeto tipo Animal puede referirse a distintas subclases
                    Animal miAnimal;
                    miAnimal = new Perro_2();
                    miAnimal.hacerSonido();  // Llama al método de Perro

                    miAnimal = new Gato();
                    miAnimal.hacerSonido();  // Llama al método de Gato
                }
            }
                //Ejemplo abstraccion
            // Clase abstracta (no se puede instanciar directamente)
            abstract class Animal_2 {
                // Método abstracto (solo se declara, no se implementa aquí)
                abstract void hacerSonido();

                // Método normal (opcional)
                void dormir() {
                    System.out.println("El animal está durmiendo");
                }
            }
            // Clase hija que implementa el método abstracto
            class Perro_2 extends Animal {
                @Override
                void hacerSonido() {
                    System.out.println("El perro ladra: ¡Guau guau!");
                }
            }
            // Clase principal
            public class AbstraccionBasica {
                public void main(String[] args) {
                    // Animal miAnimal = new Animal();  No se puede crear un objeto abstracto
                    Animal miPerro = new Perro_2();       //  Se puede crear con una subclase
                    miPerro.hacerSonido();              // Usa el método sobrescrito
                    miPerro.dormir();                   // Usa el método de la clase padre
                }
            }

                    //Ejemplo Record
            // Definición de un record
            record Persona_1(String nombre, int edad) { }

            // Clase principal
            public class RecordBasico {
                public static void main(String[] args) {
                    Persona_1 p = new Persona_1("Juan", 25);

                    System.out.println(p.nombre()); // Acceder al campo nombre
                    System.out.println(p.edad());   // Acceder al campo edad
                    System.out.println(p);          // Imprime automáticamente con formato bonito
                }
            }

        }
    }
}