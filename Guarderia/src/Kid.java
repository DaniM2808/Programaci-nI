public class Kid {
    private String nombre;
    private String edad;
    private String genero;
    private String documentoIdentidad;
    private String alergias;
    private String acudiente;
    private String nroContacto;

    public Kid(String nombre, String edad, String genero, String documentoIdentidad, String alergias, String acudiente, String nroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documentoIdentidad = documentoIdentidad;
        this.alergias = alergias;
        this.acudiente = acudiente;
        this.nroContacto = nroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }
    public String getAcudiente() {
        return acudiente;
    }
    public void setAcudiente(String acudiente) {
        this.acudiente= acudiente;
    }
    public String getNroContacto(){
        return nroContacto;
    }
    public void setNroContacto(String nroContacto){
        this.nroContacto = nroContacto;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", genero='" + genero + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                ", alergias='" + alergias + '\'' +
                ", acudiente='" + acudiente + '\'' +
                ", nroContacto='" + nroContacto + '\'' +
                '}';
    }
}

