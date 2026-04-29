package empresa.seguridad; 
 
public class Administrador extends SistemaSeguridad { 
 
    public void probar() { 
        accesoPublico(); 
        accesoProtegido(); 
        accesoPaquete(); 
        // accesoPrivado();     // analizar 
    } 
}