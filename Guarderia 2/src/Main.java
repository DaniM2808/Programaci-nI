import javax.swing.JOptionPane;
import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {

            Guarderia guarderia = new Guarderia("Guarderia de programadores", "123456789");
            int cantidadNinos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos niños son?:"));
            for (int i = 0; i < cantidadNinos; i++) {
                JOptionPane.showMessageDialog(null, "Ingrese los datos del niño #" + (i + 1));

                String nombre = JOptionPane.showInputDialog("Nombre:");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                String genero = JOptionPane.showInputDialog("Género:");
                String identificacion = JOptionPane.showInputDialog("Identificación:");
                String alergias = JOptionPane.showInputDialog("Alergias del niño (o escriba 'N/A'):");
                String nombreAcudiente = JOptionPane.showInputDialog("Nombre del acudiente:");
                String contactoAcudiente = JOptionPane.showInputDialog("Numero del acudiente:");

                Nino nino = new Nino(nombre, edad, genero, identificacion, alergias, nombreAcudiente, contactoAcudiente);
                guarderia.agregarNino(nino);
            }

            ArrayList<Nino> ninosMayores5 = guarderia.ninosMayores5();
            StringBuilder mensaje = new StringBuilder("Niños mayores de 5 años:\n");
            for (Nino nino : ninosMayores5) {
                mensaje.append(nino.toString()).append("\n\n");
            }

            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    }

