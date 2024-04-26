package co.uniquindio.java;

public class AdapterSistemaArchivos implements SistemaArchivos {

    private SistemaArchivosLocal sistemaArchivosLocal;
    private SistemaArchivosNube sistemaArchivosNube;
    
    public AdapterSistemaArchivos(SistemaArchivosLocal sistemaArchivosLocal, SistemaArchivosNube sistemaArchivosNube) {
        this.sistemaArchivosLocal = sistemaArchivosLocal;
        this.sistemaArchivosNube = sistemaArchivosNube;
    }

    
    
    
    @Override
    public void guardarArchivo(String nombreArchivo) {

        sistemaArchivosNube.subirArchivoNube(nombreArchivo);
    }




    @Override
    public void eliminarArchivo(String nombreArchivo) {
        
        sistemaArchivosLocal.eliminarArchivoLocal(nombreArchivo);
        sistemaArchivosNube.borrarArchivoNube(nombreArchivo);
        
        
    }



    
}
