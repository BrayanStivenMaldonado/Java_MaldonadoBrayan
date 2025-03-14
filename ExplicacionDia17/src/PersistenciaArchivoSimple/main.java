package PersistenciaArchivoSimple;

public class main {
    public static void main(String[] args) {
        PersistenciaFile.guardarDatos("El FC Barcelona es el mejor club del mundo");
        PersistenciaFile.leerDatos();
    }
}
