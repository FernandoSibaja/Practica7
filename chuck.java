package Practica7;

public class chuck extends bird {
    private String poder;
    
    public chuck(String nombre, String color, String tamaño, String poder){
        super(nombre,color,tamaño);
        this.poder=poder;
    }
    public void mostrarbird(){
        System.out.println("Nombre: "+getnombre()
                            +"\nColor: "+getcolor()
                            +"\nTamaño: "+gettamaño()
                            +"\nPoder: "+poder);
    }
    public void accion(){
        System.out.println(getnombre()+" ataco y uso "+poder);
    }
}
