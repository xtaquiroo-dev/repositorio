package empresa.externo; 
 
import empresa.seguridad.SistemaSeguridad; 
 
public class AuditorExterno { 
 
    public void probar() { 
        SistemaSeguridad s = new SistemaSeguridad(); 
 
        s.accesoPublico(); 
        // s.accesoProtegido(); // analizar 
        // s.accesoPaquete();   // analizar 
        // s.accesoPrivado();   // analizar 
    } 
} 