package empresa.externo; 
 
import empresa.seguridad.SistemaSeguridad; 
 
public class HackerEtico extends SistemaSeguridad { 
 
    public void probar() { 
        accesoPublico(); 
        accesoProtegido(); 
        // accesoPaquete();     // analizar 
        // accesoPrivado();     // analizar 
    } 
} 