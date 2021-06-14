import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu<K extends Comparable<K>,V> {
    public void cargarDatos(){
        Path pathToFile = Paths.get("IMBd movies.csv");
        try(BufferedReader reader = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)){
            String linea = reader.readLine();
            while(linea != null){
                String[] atributos = linea.split(",");

            }
        }
        catch (IOException e){}
    }
    public static void main(String[] args) {
        boolean control = true;
        Scanner scanner = new Scanner(System.in);
        while(control){  // Menu 1
            System.out.println("1. Carga de Datos" + "\r\n" + "2. Ejecutar consultas" + "\r\n" + "3. Salir");
            int entrada = scanner.nextInt();
            if(entrada == 1){ //Opcion carga
                //FUNCION DE CARGA
            }
            else if(entrada == 2){  // Menu 2
                boolean control2 = true;
                while(control2){
                    System.out.println("1. Indicar el Top 5 de actores/actrices que más apariciones han tenido a lo largo de los años."
                            + "\r\n" + "2. Indicar el Top 5 de las causas de muerte más frecuentes en directores y productores nacidos en Italia, Estados Unidos, Francia y UK."
                            + "\r\n" + "3. Mostrar de las 14 películas con más weightedAverage, el promedio de altura de sus actores/actrices si su valor es distinto de nulo."
                            + "\r\n" + "4. Indicar el año más habitual en el que nacen los actores y las actrices."
                            + "\r\n" + "5. Indicar el Top 10 de géneros de películas más populares, en las cuales al menos un actor/actriz tiene 2 o más hijos."
                            + "\r\n" + "6. Salir");
                    int entrada2 = scanner.nextInt();
                    if(entrada2 == 1){
                        // QUERY 1
                    }
                    else if(entrada2 == 2){
                        //QUERY 2
                    }
                    else if(entrada2 == 3){
                        //QUERY 3
                    }
                    else if(entrada2 == 4){
                        //QUERY 4
                    }
                    else if(entrada2 == 5){
                        //QUERY 5
                    }
                    else if(entrada2 == 6){ //VOLVER MENU PRINCIPAL
                        control2 = false;
                    }
                    else{
                        System.out.println("\r\n" + "Opción incorrecta, porfavor vuelva a intentarlo." + "\r\n");
                    }
                }
            }
            else if(entrada == 3){
                System.out.println("Aplicación finalizada.");
                control = false;
            }
            else {
                System.out.println("\r\n" + "Opción incorrecta, porfavor vuelva a intentarlo." + "\r\n");
            }
        }
    }
}