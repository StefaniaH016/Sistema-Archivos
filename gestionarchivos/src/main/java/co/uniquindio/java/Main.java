package co.uniquindio.java;


public class Main {
    public static void main( String[] args ){

        SistemaArchivosLocal sistemaArchivosLocal = new SistemaArchivosLocalimpl();
        SistemaArchivosNube sistemaArchivosNube= new SistemaArchivosNubeimpl();

        AdapterSistemaArchivos adapterSistemaArchivos= new AdapterSistemaArchivos(sistemaArchivosLocal, sistemaArchivosNube);
        FachadaSistemaArhivos fachadaSistemaArhivos= new FachadaSistemaArhivos(adapterSistemaArchivos);
        
        fachadaSistemaArhivos.guardarArchivo("presentacion.doc");
        fachadaSistemaArhivos.eliminarArchivo("presentacion.doc");
        
    }
}
