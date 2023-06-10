/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_junniorsauceda;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Junnior Sauceda
 */
public class Lab8P1_JunniorSauceda {
static Scanner sc=new Scanner(System.in);

static Random ran=new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir=true;
        Libro[][]LibreriaGen=null;
        int ingreso=0;
        do{
            System.out.println("1.-Crear Biblioteca");
            System.out.println("2.-Modificar Librero");
            System.out.println("3.-Salir");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:{
                    LibreriaGen=LlenarLibrero();
                    System.out.println("El librero completo es: ");
                    Imprimir(LibreriaGen);
                    ingreso++;
                }
                break;
                case 2:{
                    if(ingreso>0){
                        System.out.println("Ingrese el titulo del libro: ");
                        sc.nextLine();
                        String nombre=sc.nextLine();
                        System.out.println("Ingrese el escritor: ");
                        String autor=sc.nextLine();
                        System.out.println("Ingrese el año de publicacion: ");
                        int año=sc.nextInt();
                       
                        while(año<0){
                            System.out.println("Ingrese un año valido");
                            año=sc.nextInt();
                        }
                        Imprimir(ModificarLibro(nombre,autor,año,LibreriaGen));
                        System.out.println("");
                    }
                    else{
                        System.out.println("Amigo, primero debe crear la biblioteca");
                    }
                }
                break;
                case 3:{
                    seguir=false;
                }
                break;
                default:{
                    System.out.println("Opcion Invalida");
                }
                break;
            }
            
        }while(seguir);
        // TODO code application logic here
    }
    public static Libro[][]LlenarLibrero(){
        System.out.println("Ingrese la cantidad de filas para el librero: ");
        int filas=sc.nextInt();
        while(filas<1){
            System.out.println("Ingrese una cantidad valida de filas");
            filas=sc.nextInt();
        }
        System.out.println("Ingrese la cantidad de columnas para el librero: ");
        int columnas=sc.nextInt();
        while(columnas<1){
            System.out.println("Ingrese una cantidad valida de columnas");
            columnas=sc.nextInt();
        }
        Libro[][]Librero=new Libro[filas][columnas];
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Ingrese el titulo del libro: ");
                sc.nextLine();
                String nombre=sc.nextLine();
                
                System.out.println("Ingrese el escritor: ");
                String autor=sc.nextLine();
                System.out.println("Ingrese el año de publicacion: ");
                int año=sc.nextInt();
                while(año<0){
                            System.out.println("Ingrese un año valido");
                            año=sc.nextInt();
                        }
                
                Librero[i][j]=new Libro(nombre,autor,año);
                System.out.println("El libro fue agregado exitosamente");
            }
        }
        return Librero;
    }
    public static void Imprimir(Libro[][]Libreria){
        for(int i=0;i<Libreria.length;i++){
            for(int j=0;j<Libreria[0].length;j++){
                
                Libro L=Libreria[i][j];
                System.out.print("[ "+L.getNombre()+" ] ");
                
            }
            System.out.println("");
        }
    }
    public static Libro[][]ModificarLibro(String Titulo,String Autor,int Año,Libro[][]Libreria){
        Libro[][]Librero=Libreria;
        int mensaje=0;
        for(int i=0;i<Libreria.length;i++){
            for(int j=0;j<Libreria[0].length;j++){
               if(Titulo.equals(Libreria[i][j].getNombre())&& Autor.equals(Libreria[i][j].getAutor())&&Año==Libreria[i][j].getaño()){
                   System.out.println("El libro fue encontrado en la fila "+(i+1)+" columna "+(j+1));
                   System.out.println("");
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Ingrese el titulo del libro: ");
                    sc.nextLine();
                    String nombre_nvo=sc.nextLine();
                    System.out.println("Ingrese el escritor: ");
                    String autor_nvo=sc.nextLine();
                    System.out.println("Ingrese el año de publicacion: ");
                    int año_nvo=sc.nextInt();
                    while(año_nvo<0){
                    System.out.println("Ingrese un año valido");
                    año_nvo=sc.nextInt();
                    }
                    Libreria[i][j].setNombre(nombre_nvo);
                    Libreria[i][j].setautor(autor_nvo);
                    Libreria[i][j].setaño(año_nvo);
                    System.out.println("El librero modificado es: ");
               }
               else{
                   if(mensaje<1){
                   System.out.println("El libro indicado no se ha encontrado en el librero");
                   System.out.println("El librero queda de la misma manera: ");
                   System.out.println("");
                   }
                   mensaje++;
               }
            
            }
        }
        return Librero;
    }
//    public static boolean ConfirmarLibro(String Titulo,String Autor,int Año,Libro[][]Libreria){
//        boolean Esta=false;
//        for(int i=0;i<Libreria.length;i++){
//            for(int j=0;j<Libreria[0].length;j++){
//               if(Titulo.equals(Libreria[i][j].getNombre())&& Autor.equals(Libreria[i][j].getAutor())&&Año==Libreria[i][j].getaño()){
//                   Esta=true;
//               }
//            }
//        }
//        return Esta;
//    }
//    public static String UbicacionLibro(String Titulo,String Autor,int Año,Libro[][]Libreria){
//        String Ubicacion="";
//        for(int i=0;i<Libreria.length;i++){
//            for(int j=0;j<Libreria[0].length;j++){
//               if(Titulo.equals(Libreria[i][j].getNombre())&& Autor.equals(Libreria[i][j].getAutor())&&Año==Libreria[i][j].getaño()){
//                   Ubicacion="El libro fue encontrado en la fila "+(i+1)+" columna "+(j+1);
//               }
//            }
//        }
//        return Ubicacion;
//    }
}
