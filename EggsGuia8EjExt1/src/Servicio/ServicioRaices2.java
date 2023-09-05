//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
//Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
//
//Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante
//tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto
//ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que
//esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
//soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
//por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices(
//o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
package Servicio;
import Entidades.Raices2;


public class ServicioRaices2 {
    
    public double getDiscriminante(Raices2 r2){
        
        return (Math.pow(r2.getB(), 2)-4*r2.getA()*r2.getC());
        
    }
    
    public boolean tieneRaices(Raices2 r2){
      
        return (getDiscriminante(r2)>=0);
    }
    public boolean tieneRaiz(Raices2 r2){
        return (getDiscriminante(r2)==0);
        
    }
    public void obtenerRaices(Raices2 r2){
       if (tieneRaices(r2)){
           System.out.println("La 1ra solucion es:" + (((-r2.getB() +(Math.sqrt(getDiscriminante(r2))))/(2*r2.getA()))));
           System.out.println("La 2da solucion es:" + (((-r2.getB() -(Math.sqrt(getDiscriminante(r2))))/(2*r2.getA()))));
       }
           
       }
    
    public void obtenerRaiz(Raices2 r2){
        if (tieneRaiz(r2)){
            System.out.println("La unica solucion es: " + -r2.getB()/2*r2.getA());
        }
        
    }
    
    //Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
//por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices(
//o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se
//mostrará un mensaje.
    
    public void calcular(Raices2 r2){
        
        if (tieneRaices(r2)){
            obtenerRaices(r2);
        }else if(tieneRaiz(r2)) {
            obtenerRaiz(r2);
        }else{
            System.out.println("No existen soluciones reales");
        } 
        
    }   
}

