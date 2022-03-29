package Practica7;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        int opc,opc2;
        Scanner sn = new Scanner(System.in);
        boolean salir = false;

        

        
        
        while(!salir){
            System.out.println("1. Terence");
            System.out.println("2. Chuck");
            System.out.println("3. Boom");
            System.out.println("4. Salir");

            System.out.println("Escoja un personaje: ");
            
            opc= sn.nextInt();


            if(opc==1){
                System.out.println("1.mostar caracteristicas");
                System.out.println("2.ver accion del personaje");
                System.out.println("Seleccione una opcion");
                opc2= sn.nextInt();
                red bird1 = new red("Terence", "rojo", "gigante", "super fuerza");
                if(opc2==1){
                    bird1.mostrarbird();
                }
                if(opc2==2){
                    bird1.accion();
                }
                
            }
            if(opc==2){
                System.out.println("1.mostar caracteristicas");
                System.out.println("2.ver accion del personaje");
                System.out.println("Seleccione una opcion");
                opc2= sn.nextInt();
                chuck bird2 = new chuck("Chuck", "amrillo", "mediano", "super velocidad");
                if(opc2==1){
                    bird2.mostrarbird();    
                }
                if(opc2==2){
                    bird2.accion();
                }
                
            }
            if(opc==3){
                System.out.println("1.mostar caracteristicas");
                System.out.println("2.ver accion del personaje");
                System.out.println("Seleccione una opcion");
                opc2= sn.nextInt();
                boom bird3 = new boom("Boom", "negro", "grande", "explosivo");
                if(opc2==1){
                    bird3.mostrarbird();
                }
                if(opc2==2){
                    bird3.accion();
                }
                
            }

            if(opc==4){
                salir=true;
            }
        }
    }
    
}
