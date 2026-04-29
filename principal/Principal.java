package principal; 
 
import empresa.seguridad.Empleado; 
import empresa.seguridad.Administrador; 
import empresa.externo.AuditorExterno; 
import empresa.externo.HackerEtico; 
 
public class Principal { 
    public static void main(String[] args) { 
        Empleado e = new Empleado(); 
        e.probar(); 
 
        Administrador a = new Administrador(); 
        a.probar(); 
 
        AuditorExterno au = new AuditorExterno(); 
        au.probar(); 
 
        HackerEtico h = new HackerEtico(); 
        h.probar(); 
    } 
}