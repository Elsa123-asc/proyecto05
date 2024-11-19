packages es.santander.ascender.proyecto05;

public class Perro {

        public double peso;
     
        public Perro(double peso) {
            // Que pasa en peso 0 o negativo
            this.peso = peso;
        }
    
        public void comer(double pesoComida) {
            this.peso += pesoComida;
        }
    
        public double getPeso() {
            return peso;
        }
    
        public void setPeso(double peso) {
            this.peso = peso;
        }    
    }
