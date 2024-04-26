package co.uniquindio.java;

public class FachadaSistemaArhivos {
    
    SistemaArchivos sistemaArchivos;

    public FachadaSistemaArhivos(SistemaArchivos sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    public void guardarArchivo(String nombreArchivo){
    
        sistemaArchivos.guardarArchivo(nombreArchivo);
    }
    
    public void eliminarArchivo(String nombreArchivo){
        sistemaArchivos.eliminarArchivo(nombreArchivo);
    }

}
