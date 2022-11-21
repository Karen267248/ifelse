public class Principal {
    public static void main(String[] args) {
        int calificacion = 7;
        boolean avisarFamilia = false;
        if (calificacion >= 0 && calificacion < 5) {
            System.out.println("insuficiente");
            avisarFamilia = true;
        } else if (calificacion < 7) {
            System.out.println("suficiente");
        } else if (calificacion < 9) {
            System.out.println("notable");
        } else if (calificacion < 10) {
            System.out.println("sobresaliente");
        } else if (calificacion == 10) {
            System.out.println("matricula");
        } else {
            System.out.println("calificacion no valida");
        }
        if (avisarFamilia) {
            System.out.println("avisar a la familia");
        }
    }
}
