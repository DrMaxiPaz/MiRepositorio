/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import javax.swing.UIManager;
import grupos.vistas.VentanaAMGrupo;
import idiomas.vistas.VentanaAIdioma;
import lugares.vistas.VentanaALugar;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.vistas.VentanaATipo;

public class ControladorPrincipalGUI {
    public static void main(String[] args) {
        asignarLookAndFeel("Nimbus");
//        VentanaAMGrupo ventana = new VentanaAMGrupo(null); //se instancia la ventana
//        ventana.setLocationRelativeTo(null); //se centra la ventana
//        ventana.setVisible(true); //se hace visible la ventana
//        
//        VentanaAMAlumno ventanaA = new VentanaAMAlumno(null);//se instancia la ventana
//        ventanaA.setLocationRelativeTo(null); //se centra la ventana
//        ventanaA.setVisible(true); //se hace visible la ventana
//        
//        VentanaAMProfesor ventanaP = new VentanaAMProfesor(null); //se instancia la ventana
//        ventanaP.setLocationRelativeTo(null); //se centra la ventana
//        ventanaP.setVisible(true); //se hace visible la ventana
//        
//        VentanaAIdioma ventanaI = new VentanaAIdioma(null); //se instancia la ventana
//        ventanaI.setLocationRelativeTo(null); //se centra la ventana
//        ventanaI.setVisible(true); //se hace visible la ventana
//        
//        VentanaALugar ventanaL = new VentanaALugar(null); //se instancia la ventana
//        ventanaL.setLocationRelativeTo(null); //se centra la ventana
//        ventanaL.setVisible(true); //se hace visible la ventana
//        
        VentanaAPalabraClave ventanaPC = new VentanaAPalabraClave(null); //se instancia la ventana
        ventanaPC.setLocationRelativeTo(null); //se centra la ventana
        ventanaPC.setVisible(true); //se hace visible la ventana
        
        VentanaATipo ventanaT = new VentanaATipo(null); //se instancia la ventana
        ventanaT.setLocationRelativeTo(null); //se centra la ventana
        ventanaT.setVisible(true); //se hace visible la ventana
    }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void asignarLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
                System.exit(0);
            }
        }
    }
    
}
