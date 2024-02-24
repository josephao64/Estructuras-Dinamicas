import javax.print.DocFlavor;

public class usuarioDTO {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String telefono;
    private final String fechaDeNacimiento;
    private final String genero;
    private final String estadoCivil;

    public usuarioDTO(String nombre, String apellido, String email, String telefono, String fechaDeNacimiento, String genero, String genero1, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }
    public usuarioDTO(Builder builder){
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.fechaDeNacimiento = builder.fechaDeNacimiento;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;

    }
    public static class Builder{
        private  String nombre;
        private  String apellido;
        private  String email;
        private  String telefono;
        private  String fechaDeNacimiento;
        private  String genero;
        private  String estadoCivil;

        public  usuarioDTO.Builder Nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public usuarioDTO.Builder Apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public  usuarioDTO.Builder Email(String email) {
            this.email = email;
            return this;
        }

        public  usuarioDTO.Builder Telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public  usuarioDTO.Builder FechaDeNacimiento(String fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }

        public usuarioDTO.Builder Genero(String genero) {
            this.genero = genero;
            return this;
        }

        public  usuarioDTO.Builder EstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }
    }
        public usuarioDTO build() {
            return new usuarioDTO(this);


        }
    }

}
