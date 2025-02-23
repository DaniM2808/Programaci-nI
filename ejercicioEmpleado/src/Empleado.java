public class Empleado {
    private String identificacion;
    private String nombreCompleto;
    private String correo;
    private String fechaContratacion;
    private String telefono;
    private String puesto;

    public Empleado(String identificacion, String nombreCompleto, String correo, String fechaContratacion, String telefono, String puesto) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.fechaContratacion = fechaContratacion;
        this.telefono = telefono;
        this.puesto = puesto;
    }


    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificacion='" + identificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", correo='" + correo + '\'' +
                ", fechaContratacion='" + fechaContratacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
