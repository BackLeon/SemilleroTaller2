import java.util.Scanner;

public class ConversorMonedas {

    private double dolar = 1.09;
    private double euro = 0.91;
    private boolean continuar = true;
    public void conversionesModendas(){
        
        Scanner moneda = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de monedas," +
         "deseas convertir de dolar a euro o de aeuro a dolar? presion 1 para hacer conversion de dolar a euro o 2 para euro a dolar");

        String seleccionMoneda = moneda.nextLine(); 
        while(continuar){
            if(seleccionMoneda.equals("1")){

                System.out.println("Usted selecciono conversion de dolar a euros");
                System.out.println("Cuantos dolares desea convertir a euros?: ");

                double cantidadDolar = moneda.nextInt();
                System.out.println("La cantidad de tus dolares a euros es: " + Math.round((euro * cantidadDolar) * 1000.0) / 1000.0 + " Euros en total.");
                continuar = false;
            }else if(seleccionMoneda.equals("2")){

                System.out.println("Usted selecciono conversion de euros a dolar");
                System.out.println("Cuantos dolares desea convertir a euros?: ");
                continuar = false;

                double cantidadEuro = moneda.nextInt();
                System.out.println("La cantidad de tus dolares a euros es: " + Math.round((dolar * cantidadEuro) * 1000.0) / 1000.0 + " Dolares en total.");
            }else{

                System.out.println("No selecciono ninguna de las opciones...Adios");
                continuar = false;
            }


        }



    }

    
    
}
