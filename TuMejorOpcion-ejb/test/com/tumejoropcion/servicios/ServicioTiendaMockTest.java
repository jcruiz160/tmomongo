
package com.tumejoropcion.servicios;

import com.tumejoropcion.bos.Tienda;
import com.tumejoropcion.servicios.IServicioTiendaMockRemote;
import java.util.Properties;
import javax.naming.InitialContext;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase encargada de realizar pruebas unitarias
 */
public class ServicioTiendaMockTest
{
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Interface con referencia al servicio de vendedores en el sistema
     */
    private IServicioTiendaMockRemote servicio;

    //-----------------------------------------------------------
    // Métodos de inicialización y terminación
    //-----------------------------------------------------------

    /**
     * Método que se ejecuta antes de comenzar la prueba unitaria
     * Se encarga de inicializar todo lo necesario para la prueba
     */
    @Before
    public void setUp() throws Exception
    {
        try
        {
            Properties env = new Properties();
            env.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            env.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            env.put("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext contexto;
            contexto = new InitialContext(env);
            servicio = (IServicioTiendaMockRemote) contexto.lookup("com.tumejoropcion.servicios.IServicioTiendaMockRemote");
        } 
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    //-----------------------------------------------------------
    // Métodos de prueba
    //-----------------------------------------------------------
    
    /**
     * Método de prueba para agregar un vendedor al sistema
     */
    @Test
    public void testAgregarVendedor() throws Exception
    {
        Tienda tienda = null;
        servicio.agregarTienda(tienda);
    }

    /**
     * Método de prueba para eliminar un vendedor al sistema
     */
  

}