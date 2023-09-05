/*
 Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

Método compararLongitud(String frase), deberá comparar la longitud 
de la frase que compone la clase con otra nueva frase ingresada por el usuario.

Método unirFrases(String frase), deberá unir la frase contenida en la clase
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.

Método reemplazar(String letra), deberá reemplazar todas las letras “a”
que se encuentren en la frase, por algún otro carácter seleccionado por el usuario
y mostrar la frase resultante.

Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package servicios;

import entidades.Cadena;
//import java.util.Arrays;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena c1) {
        String vocalesString;
        vocalesString = "aeiou";
        int contador;
        contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (vocalesString.contains(c1.getFrase().substring(i, i + 1))) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales que tiene la palabra: " + c1.getFrase() + " es: " + contador);
    }

    public void invertirFrase(Cadena c1) {
        String alrevesFraseString;
        alrevesFraseString = "";

        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            alrevesFraseString += "".concat(c1.getFrase().substring(i, i + 1));
        }
        System.out.println(alrevesFraseString);
    }

    public void vecesRepetido(Cadena c1) {
        String caracter;
        int contador = 0;
        System.out.println("Ingrese un caracter: ");
        caracter = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().toLowerCase().substring(i, i + 1).contains(caracter.toLowerCase())) {
                contador++;
            }

        }//fin de for
        System.out.println("El caracter: " + caracter + " se repite: " + contador + " veces.");
    }

    public void compararLongitud(Cadena c1) {
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        if (c1.getLongitud() == frase.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }

    }

    public void unirFrases(Cadena c1) {
        String frases;
        String fraseUsuaroString;
        System.out.println("ingrese una frase a concatenar: ");
        fraseUsuaroString = " " + leer.nextLine();

        frases = c1.getFrase().concat(fraseUsuaroString);
        System.out.println("Frase concatenada: " + frases);
    }

    public void reemplazar(Cadena c1) {
        String caracter;
        String nuevaFraseString;
        System.out.println("Ingrese caracter a reemplazar: ");
        caracter = leer.next();
        nuevaFraseString = c1.getFrase().toLowerCase().replace("a", caracter);
        System.out.println("frase con los caracteres reemplazados: " + nuevaFraseString);
    }

    public boolean contiene(Cadena c1) {
        String caracter;
        boolean contiene = false;
        System.out.println("Ingrese caracter para ver si la frase lo contiene: ");
        caracter = leer.next();
        if (c1.getFrase().toLowerCase().contains(caracter)) {
            contiene = true;
        }
        return contiene;
    }

}
