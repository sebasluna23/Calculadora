/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
 import java.util.Scanner;
/**
 *
 * @author Sebas
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double num2 = input.nextDouble();
        
        System.out.print("Ingrese el tercer numero: ");
        double num3 = input.nextDouble();


        System.out.print("Seleccione la operación (+, -, *, /,*/): ");
        String operacion = input.next();

        double resultado = 0;

        // Realizar la operación seleccionada
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*/":
                  resultado = num1*num2/num3;
                break;
            default:
                System.out.println("Operación inválida.");
                return;
        }
      

        System.out.println("El resultado es: " + resultado);

        input.close();
    }
}

    

