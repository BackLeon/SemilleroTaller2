import java.util.Scanner;

public class Calculadora {

    Scanner valores = new Scanner(System.in);

    public void Operaciones(){


        System.out.println("Que operacion desea realizar? 1.Suma, 2.Resta, 3.Multiplicacion o 4.Division");
        String oper = valores.nextLine();
        double valor1 = 0;
        double valor2 = 0;
        switch (oper) {
            case "1":
                System.out.println("Valor 1: ");
                valor1  = valores.nextDouble();
                System.out.println("Valor 2: ");
                valor2 = valores.nextDouble();

                System.out.println("El valor de la suma es " + (valor1 + valor2));
                
                break;
        
            case "2":
                System.out.println("Valor 1: ");
                valor1 = valores.nextDouble();
                System.out.println("Valor 2: ");
                valor2 = valores.nextDouble();

                System.out.println("El valor de la resta es " + (valor1 - valor2));
                
                break;
            case "3":
                System.out.println("Valor 1: ");
                valor1 = valores.nextDouble();
                System.out.println("Valor 2: ");
                valor2 = valores.nextDouble();

                System.out.println("El valor de la multiplicacion es " + (valor1 * valor2));
                
                break;            
             case "4":
                System.out.println("Valor 1: ");
                valor1 = valores.nextDouble();
                System.out.println("Valor 2: ");
                valor2 = valores.nextDouble();

                System.out.println("El valor de la divison es " + (valor1 / valor2));
                
                break;           
            
                default:
                break;
        }

    }
    

    
}
