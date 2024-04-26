package co.uniquindio.java;

public class SistemaArchivosLocalimpl implements SistemaArchivosLocal{
    
    @Override
   
    public void eliminarArchivoLocal(String nombreArchivo) {
         
        System.out.println("Eliminando Archivo Local: "+ nombreArchivo);
    }

    @Override
    
    public void guardarArchivoLocal(String nombreArchivo) {
        
        System.out.println("Guardando Archivo Local: "+ nombreArchivo);
    }
    
    

}
    
