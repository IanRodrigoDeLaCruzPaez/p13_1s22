import java.util.Scanner;

public class p13_1s22{
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String operacion;
	String temp;
	int num1, num2;
	int resultado;

	System.out.println("Programa que realiza operaciones basicas");
	System.out.println("Que operacion desea: Suma, resta, Division, Multiplicacion?");
	operacion = teclado.nextLine();
	if(operacion.equals("Suma")){
		System.out.println("Aqui debemos realizar la suma");
			System.out.println("Igresa el primer numero ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 + num2;
			System.out.println("La suma es " + resultado);
	}	else if (operacion.equals("Resta")){
		System.out.println("Aqui debemos realizar la resta");
			System.out.println("Igresa el primer numero ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 - num2;
			System.out.println("La resta es " + resultado);
	}	else if (operacion.equals("Division")){
		System.out.println("Aqui debemos realizar la division");
			System.out.println("Igresa el primer numero ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 / num2;
			System.out.println("La divison es " + resultado);
	}	else if (operacion.equals("Multiplicacion")){
		System.out.println("Aqui debemos realizar la multiplicacion");
			System.out.println("Igresa el primer numero ");
			temp = teclado.nextLine();
			num1 = Integer.parseInt(temp);
			System.out.println("Ingresa el segundo numero ");
			temp = teclado.nextLine();
			num2 = Integer.parseInt(temp);
			resultado = num1 * num2;
			System.out.println("La multiplicacion es " + resultado);
	}	else{
		System.out.println("No existe opcion a realizar");
	}
	}
}