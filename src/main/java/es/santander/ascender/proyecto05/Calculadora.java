package es.santander.ascender.proyecto05;

public class Calculadora {

    // Campo para almacenar el resultado actual
    private double resultado;

    // Campo para almacenar el último resultado
    private double ultimoResultado;

    // Constructor que inicializa los resultados a 0
    public Calculadora() {
        this.resultado = 0;
        this.ultimoResultado = 0;
    }

    // Método para sumar
    public double sumar(double sumando1, double sumando2) {
        resultado = sumando1 + sumando2;
        ultimoResultado = resultado;  // Guardar el último resultado
        return resultado + 1;  // Resultado de la suma + 1
    }

    // Método para restar
    public double restar(double minuendo, double sustraendo) {
        resultado = minuendo - sustraendo;
        ultimoResultado = resultado;  // Guardar el último resultado
        return resultado + 1;  // Resultado de la resta + 1
    }

    // Método para dividir
    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: División por cero no permitida.");
            return 0;  // En caso de división por cero, se devuelve 0
        }
        resultado = dividendo / divisor;
        ultimoResultado = resultado;  // Guardar el último resultado
        return resultado + 1;  // Resultado de la división + 1
    }

    // Método para multiplicar
    public double multiplicar(double multiplicando1, double multiplicando2) {
        resultado = multiplicando1 * multiplicando2;
        ultimoResultado = resultado;  // Guardar el último resultado
        return resultado + 1;  // Resultado de la multiplicación + 1
    }

    // Método para resetear el resultado
    public void reset() {
        resultado = 0;
        ultimoResultado = 0;  // Resetear el último resultado también
        System.out.println("El resultado ha sido reseteado a: " + resultado);
    }

    // Método para obtener el resultado actual
    public double obtenerResultado() {
        return resultado;
    }

    // Método para obtener el último resultado guardado
    public double obtenerUltimoResultado() {
        return ultimoResultado;
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear una instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Realizar algunas operaciones
        System.out.println("Suma: " + calculadora.sumar(5, 3));  // 9
        System.out.println("Resta: " + calculadora.restar(5, 3));  // 3
        System.out.println("Multiplicación: " + calculadora.multiplicar(4, 2));  // 9
        System.out.println("División: " + calculadora.dividir(10, 2));  // 6

        // Obtener el resultado actual
        System.out.println("Resultado actual: " + calculadora.obtenerResultado());

        // Obtener el último resultado guardado
        System.out.println("Último resultado guardado: " + calculadora.obtenerUltimoResultado());

        // Resetear el resultado
        calculadora.reset();

        // Verificar que el resultado fue reseteado
        System.out.println("Resultado después de resetear: " + calculadora.obtenerResultado());  // 0
        System.out.println("Último resultado después de resetear: " + calculadora.obtenerUltimoResultado());  // 0
    }
}
