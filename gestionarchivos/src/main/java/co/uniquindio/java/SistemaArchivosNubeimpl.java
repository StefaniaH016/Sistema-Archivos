package co.uniquindio.java;

public class SistemaArchivosNubeimpl implements SistemaArchivosNube{
    
    @Override
    public void subirArchivoNube(String nombreArchivo) {
        
        System.out.println("subiendo Archivo Nube: "+ nombreArchivo);
    }
    @Override
    
    public void borrarArchivoNube(String nombreArchivo) {

        System.out.println("borrando Archivo Nube: "+ nombreArchivo);
    }

    

    
    
}
