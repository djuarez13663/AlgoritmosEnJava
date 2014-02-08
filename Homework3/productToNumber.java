/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
	
	System.out.print("1");
	
	int resultado = 0;
	int total = 1;

	resultado = Integer.parseInt(args[0].toString());

	for(int x=1; x<=resultado ; x++)
	{						
		
		total = total * x;
		if(x>1){

		System.out.print("x"+x);		
		}
		
	}
		System.out.print("="+total);
   }

}