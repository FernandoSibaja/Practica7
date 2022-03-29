package Practica7;

public class bird {
    public String nombre;
    public String color;
    public String tamaño;

    public bird(String nombre,String color, String tamaño){
        this.nombre=nombre;
        this.color=color;
        this.tamaño=tamaño;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String getcolor(){
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }

    public String gettamaño(){
        return tamaño;
    }
    public void settamaño(String tamaño){
        this.tamaño = tamaño;
    }


}
