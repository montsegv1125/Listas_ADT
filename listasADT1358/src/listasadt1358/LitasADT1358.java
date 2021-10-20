
package listasadt1358;
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;
public class LitasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    LinkedListADT lsl=new LinkedListADT();
    lsl.append(new String("jose"));
    lsl.append(new String("diana"));
    lsl.append(new String("santiago"));
    lsl.append("daniela");
    lsl.transversal();
    
     LinkedListADT lsl2=new LinkedListADT();
     //OBJETOS DEL TIPO EMPLEADO
        lsl2.append(new Empleado(1, "José", "Pérez","García" , 1850.5f, 2015, 4));
        lsl2.append(new Empleado(1, "Diego", "Pérez","Hernández" , 1950.5f, 2017, 5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla","García" , 2850.5f, 2010, 7));
        lsl2.append(new Empleado(1, "Daniela", "Casilla","López" , 3850.5f, 2019, 8));
        
        lsl2.transversal();
    }
    
}
