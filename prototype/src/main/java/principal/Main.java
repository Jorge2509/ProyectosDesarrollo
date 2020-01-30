
package principal;

import modelo.IcuentaImplem;

public class Main {
    public static void main(String[] args) {
        
        IcuentaImplem cuentaAhorro = new IcuentaImplem();
        cuentaAhorro.setMonto(2000);
       
        // cro un clon de la cuenta y utilizo su metodo clonar debo hacer un casting de objetos
        IcuentaImplem cuentaClonada = (IcuentaImplem)cuentaAhorro.clonar();
        
        if(cuentaClonada!=null)
        {
            System.out.println(cuentaClonada);
        }
        
        
        System.out.println(cuentaAhorro==cuentaClonada);// las cuentas son las mismas pero tienen difrentes referencias en memoria
        
    }
    
}
