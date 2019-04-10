package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,0);
            
            int contador=0;
            do{
                estudiante.move();
                while(estudiante.canPickThing()== true){
                if(estudiante.canPickThing()== true){
                estudiante.pickThing();
                
                }
                }
            
            }
            while(estudiante.canPickThing()== true);
         
        }
        
        public static void mediaVuelta(){
            for (int i = 0; i < 2; i++){ 
                estudiante.turnLeft();
            }
        }
        public static void giroDerecha(){
            for (int i = 0; i < 3; i++){
                estudiante.turnLeft();
            }
        }
        public static void avanzar(int a){
            for (int i = 0; i < a; i++){
                estudiante.move();
            }
        }
        public static void cuadroThings(){
            for (int i = 1; i < 7; i++){
                for(int j=1;j<6;j++){
                    Thing t = new Thing(objetos,i,j);
                }
            }
        }

}