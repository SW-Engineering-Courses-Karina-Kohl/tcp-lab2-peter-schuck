import java.util.Scanner;

public class Calculadora {

    public int somar(int num1, int num2){
        return num1+num2;
    }
	
	public int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

    public int dividir(int num1, int num2) {
            try{
                return num1/num2; 
            } catch (ArithmeticException e){
                throw new ArithmeticException("Divisao por zero nao eh permitida.");
            }

    }
    
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
		int num1=0;
		int num2=0;
        try {
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
		} catch(NumberFormatException e) {
                        System.out.println(e);
		}

		try {
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
		
        int resultado = calc.somar(num1, num2);
        System.out.println("Resultado soma: " + resultado);
		
		int resultado3 = calc.subtrair(num1, num2);
		System.out.println("Resultado subtracao: " + resultado3);
		
		int resultado4 = calc.multiplicar(num1, num2);
		System.out.println("Resultado multiplicacao: " + resultado4);
        
        int resultado2 = calc.dividir(num1, num2);
        System.out.println("Resultado divisao: " + resultado2);
    }
}