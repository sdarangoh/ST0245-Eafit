
package Taller__4;

/**
*La clase Taller4 dos tiene como objetivo dar solución al taller 4
*
*@autor Mauricio Toro, Camilo Paez
*@version 1
*/
public class Taller4 {
    
    
   /**
     * This method takes one ArrayList, and uses de method maxEv.
     * @imput ArrayList<Integger> a
     * @output int higher value element on a.
     */
    public static int arrayMax(int [] a, int b){
        return maxEv(a, 0, 0);
    } 

    /**
     * This method is which search the maximum number in the ArrayList
     * @imput ArrayList<Integger> a, int indice, int maximo.
     * @output int maximo ass the higher number in the array.
     */
    private static int maxEv(int [] a, int indice, int maximo){
        int newMax = Math.max(a[indice], maximo);
        if(indice == a.length - 1){
            return newMax;            
        }
        else{
            return maxEv(a, indice + 1, newMax);

        }
    }

    public static boolean groupSum(int indice, int [] a, int volumen){
        return sumAux(a, volumen, indice, volumen);
    }
    static int i = 0;
    private static boolean sumAux(int [] a, int volumen, int indice, int original){        
        boolean resultado = false;   

        if (volumen - a[indice] == 0){resultado = true; return resultado;}
        if (volumen < 0){    
            i = i + 1;
            return sumAux(a, original, i, original);          
        }
        else{
            if (indice + 1 == a.length){return false;}
            else{
                return sumAux(a, volumen - a[indice], indice + 1, original);
            }
        }
    }
	
	
	/**
	* @param n numero entero, hasta que numero se hace la serie
	*
	* el metodo se encarga de devolvernos el valor fibonacci en la enesima posicion
	* @see <a href="https://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci"> fibonnaci <a/>
	* @return el valor encontrado en long dada la posible cantidad de bits
	*/
	public static long fibonacci(int n) { 
		//... 
	}
}
