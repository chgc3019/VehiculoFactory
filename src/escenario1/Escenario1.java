
package escenario1;

import Vista.Vista;
import controlador.Controlador;
import patrones.modelo.VehiculoFactory;

/**
 *
 * @author veronicasegarra
 */
public class Escenario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var vehiculoFactory = new VehiculoFactory();
        
        VehiculoFactory modelo=new VehiculoFactory();
       // Modelo modelo=new Modelo();
        Vista view=new Vista();
        Controlador controlador=new Controlador(view,modelo);
        controlador.iniciar();
        view.setVisible(true);
    }
    
}
