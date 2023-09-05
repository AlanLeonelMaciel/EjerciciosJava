import java.util.Scanner;

public class NIF {
    private long dni;
    private char letra;

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        this.dni = scanner.nextLong();

        int resto = (int) (this.dni % 23);
        char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.letra = tabla[resto];
    }

    public void mostrar() {
        System.out.printf("%08d-%c", this.dni, this.letra);
    }
}

public class NIFService {
    public static void main(String[] args) {
        NIF nif = new NIF(0, ' ');
        nif.crearNif();
        nif.mostrar();
    }
}
