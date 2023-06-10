/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_junniorsauceda;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Junnior Sauceda
 */
public class Libro {
    
    
    public Libro(int f,int c){
        Libro[][]librero=new Libro[f][c];
    }
    
    String nombre="";
    String autor="";
    int publicacion=0;
    public Libro(String Titulo,String Autor,int año){
        this.nombre=Titulo;
        this.autor=Autor;
        this.publicacion=año;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getaño(){
        return this.publicacion;
    }
    public void setNombre(String Titulo){
        this.nombre=Titulo;
    }
    public void setautor(String Autor){
        this.autor=Autor;
    }
    public void setaño(int año){
        this.publicacion=año;
    }
}
