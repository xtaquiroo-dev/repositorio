package empresa.seguridad; 
 
public class Empleado { 
 
    public void probar() { 
        SistemaSeguridad s = new SistemaSeguridad(); 
 
        s.accesoPublico(); 
        s.accesoProtegido(); 
        s.accesoPaquete(); 
        //s.accesoPrivado();   // analizar xd
    } 
} 
