package Pilas;
import java.util.Stack;

public class Pila {
	
public static void main(String[] args) {
	
	Stack pila = new Stack();
	pila.push("Avi�n 1 Matricula 0001"); //primero_en_la_fila
	pila.push("Avi�n  Matricula 0002");
	pila.push("Avi�n  Matricula 003");
	pila.push("Avi�n  Matricula 0004");
	pila.push("Avi�n  Matricula 005");
	pila.push("Avi�n  Matricula 006");

	
	System.out.println("--------------------Mensajeros del aire--------------------");
	System.out.println(" ");
	System.out.println("Avi�n disponible para salir "+pila.peek());
	
	while(pila.empty()==false)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("Los aviones despegados son: ");
		System.out.println(pila.pop());
	}
	
	pila.push("Avi�n  Matricula 007"); //primero_en_la_fila
	pila.push("Avi�n  Matricula 008");
	pila.push("Avi�n  Matricula 009");
	pila.push("Avi�n  Matricula 010");
	System.out.println("  ");
	System.out.println("  ");
	System.out.println("***************************************************************************");
	System.out.println("Los aviones disponibles en el hangar son 010--009--008--007 ");
	System.out.println("  ");
	System.out.println("�L avi�n disponible para salir es el avi�n n�mero: 010");
	System.out.println(" ");
	System.out.println("---------------------ANUNCIO-------------------------");
	System.out.println(" ");
	System.out.println("Anuncio: los aviones pendientes a despegar son:  ");
	System.out.println(pila.pop());
	System.out.println(pila.pop());
	System.out.println(pila.pop());
	System.out.println(pila.pop());
	
	}
}
