/*
 Implemente un algoritmo de polimorfismo que me permita desplegar los valores 
de área  de soldadura en superficie de piezas , cuya clase principal 
se denomina CalculoArea  el mismo que usen los siguientes atributos:  material de tipo 
cadena, longitud de tipo decimal,ancho de tipo decimal y tipoSoldadura de 
tipo cadena. Crear métodos que gestionen los atributos mencionados
 */
package daniel.polimorfismotarea2;

/**
 *
 * @author User Almache Cristian
 */
public class CalculoArea {

   int CalcularArea(int longitud, int ancho ){
       
       return (longitud*ancho);
   }
     double CalcularArea(double longitud, double ancho ){
       
       return (longitud*ancho);
   }
     
      String IdentificarMaterial( String material){
          return   material;
      }
      String IdentificarTipoSoldadura( String tipoSoldadura){
          return   tipoSoldadura;
}

}

class polimorfismotarea2{
    
    
    public static void main(String[] args) {
        
         System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        System.out.println("----------- ESPE-------------------");
        System.out.println("Nombre: Almache Cristian");
        System.out.println("Carrera: Ing. Automotriz");
        System.out.println("Docente: Ing. Luis Gerra");
        System.out.println("POLIMORFISMO TAREA 2 ");
         System.out.println("_________________________________________________________________");
         System.out.println("_________________________________________________________________");
         CalculoArea pieza1=new CalculoArea();
         CalculoArea pieza2=new CalculoArea();
         
         
         int resultado1;
         String material;
         String tipoSoldadura;
         
         pieza1.CalcularArea(0.55,1.3);
         resultado1=pieza1.CalcularArea(2,5);
         
         material=pieza1.IdentificarMaterial("Cobre");
         pieza1.IdentificarMaterial("Acero");
         
         pieza1.IdentificarTipoSoldadura("SoldaduraFrw");
         tipoSoldadura=pieza1.IdentificarTipoSoldadura("SoldaduraFsw");
         
         System.out.println("CalculoArea:"+resultado1+ "  Material: "+material+"  Tipo Soldadura: "+ tipoSoldadura);
         
         
         double resultado2;
         pieza1.CalcularArea(0.55,1.3);
         resultado2=pieza1.CalcularArea(2,5);
         System.out.println("CalculoArea:"+resultado2);
         
    }
    
}
