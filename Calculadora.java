
package calculadora;
import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        
       try{
        int opcion = 0;
        
        do{
          String menu = "Seleccione una opción: \n"+
                  "1. Suma \n"+
                  "2. Resta \n"+
                  "3. Multiplicar \n"+
                  "4. Dividir \n"+
                  "5. Salir";
          opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
          
            switch (opcion) {
                case 1:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero para la suma: "));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero para la suma: "));
                    int suma = num1+ num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
                    break;
                case 2:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la resta: "));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la resta: "));
                    int resta = num1 - num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
                    
                    break; 
                case 3:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la multiplicacion: "));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la multiplicacion: "));
                    int mult = num1 * num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + mult);
                     break;
               case 4:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para la division: "));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para la division: "));
                    int div = num1 / num2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es: " + div);
                     break;  
               case 5:
                   JOptionPane.showMessageDialog(null, "Saliendo del programa. ");
                   break;
                default:
                     JOptionPane.showMessageDialog(null, "Opcion no valida. Intente nuevamente. ");
                     break;
            }
        }
        while(opcion !=5);
       }
       catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Debe ingresar obligatoriamente un número entero. ");
       }
      return;
    }   
}