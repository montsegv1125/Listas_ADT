
package ico.fes.modelo;


public class Empleado {
    int id;
    String nombre;
    String paterno;
    String materno;
     float sueldoBase;
     int anioIngreso;
     int horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, float sueldoBase, int anioIngreso, int horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras(){
        return horasExtras;
    }
    
    public void selHorasExtras(int horaExtras){
        this.horasExtras=horasExtras;
    }
     public int getId(){
      return id;
     }
     public void setId(int id){
         this.id=id;
         
     }
     public String getNombre(){
         return nombre;
        
     }
     public void setNombre(String nombre){
         this.nombre=nombre;
         
     }
      public String getPaterno(){
          return paterno;
      }
      
     public void setPaterno(String paterno){
         this.paterno=paterno;
         
     }
     
      public String getMaterno(){
          return materno;
      }
     public void setMaterno(String materno){
         this.materno=materno;
         
     }
     
     public float getSueldoBase(){
          return sueldoBase;
      }
     public void set(float sueldoBase ){
         this.sueldoBase=sueldoBase;
         
     }
     
     public int getAnioIngreso(){
          return anioIngreso;
      }
     public void set(int anioIngreso){
         this.anioIngreso=anioIngreso;
         
     }
     
     
   

    

    
     

     
  
    
    
     
 

    
    
     
      
    
    
}
