/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorialalternativo4a.practica1p.s;

import java.util.Scanner;

/**
 *
 * @author kion
 */
public class Practica1pS {
    public static Scanner scanner = new Scanner(System.in);
 // Arreglo para almacenar los promeaios individuales de los alumnos.
    public static double[] leerCalificaciones(int n) {
        double[] calificaciones = new double[n];
        System.out.println("Escribe los promedios individuales de los alumnos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Promedio del alumno " + (i + 1) + ": ");
            double promedio = scanner.nextDouble();
            // Almacena cada promedio individual
            calificaciones[i] = promedio;
        }
        return calificaciones;
    }
public static double calcularPromedio(double[] calificaciones) {    
    double suma = 0 ;
        for(double calificaiones  : calificaciones){
            suma += calificaiones;
        }
        return suma / calificaciones.length;
    }
    public static void main(String[] args){
        System.out.println("Ingrese el numero de grupos a calcular");
        int numGrupos = scanner.nextInt();
        
         // Arreglo bidimensional
         //para almacenar los promedios de cada grupo.
        double [][] grupos = new double [numGrupos][];
        
        for(int i = 0; i < numGrupos; i++){
            System.out.println("Grupos"+(i +1));
            System.out.println("Ingresa la los aliumnos del grupo:");
            int numAlumnos = scanner.nextInt();
            
            // Arreglo  para almacenar los promedios de un grupo.
            double[] calificacionesGrupo = new double[numAlumnos];
            
            for (int t = 0; t < numAlumnos; t ++){
                System.out.println("Promedio del Alumno" +(t +1)+":");
                double promedio = scanner.nextDouble();
                //Alamacena el promedio  del grupa
                calificacionesGrupo[t]= promedio;
            }
            double promedioGrupo = calcularPromedio(calificacionesGrupo);
            //Arreglo del grupo 
            grupos[i] = calificacionesGrupo;
            System.out.println("El promeduo del grupo"+(i+1)+"es:" + promedioGrupo);
            System.out.println();
        }
        // Calcula el promedio del grupo
        for(int i = 0;i < numGrupos; i++){
            double promedioGrupo = calcularPromedio(grupos[i]);
            System.out.println("El promedio del grupo " + (i + 1) + " es: " + promedioGrupo);

    
        }
     }
   }

 