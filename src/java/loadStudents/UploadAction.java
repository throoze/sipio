/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loadStudents;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jxl.Cell;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import pio.hibernate.EstudianteBachillerato;
import pio.hibernate.PerfilUsuario;
import pio.hibernate.Usuario;



/**
 *
 * @author victor
 */
public class UploadAction {
    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        UploadedRegFileForm fileForm = (UploadedRegFileForm) form;
        FormFile uploadedFile = fileForm.getUploadedFile();
        InputStream uploadInStream = uploadedFile.getInputStream();
        String filename = uploadedFile.getFileName();
        String fileRoute = "web/tmpFiles/" + filename;
        FileOutputStream fOut = new FileOutputStream(fileRoute);
        int c = 0;
        while ((c = uploadInStream.read()) != -1) {
            fOut.write(c);
        }
        fOut.flush();
        fOut.close();
        
        // inicialización del parser
        Parser parser = new Parser();
        parser.setReading(fileRoute, 0);
        // me vuelo en encabezado
        parser.setIndexRow(1);
        
        //Leo linea a linea y agrego los objetos
        while (parser.theresNextRow()){
            Cell[] currentCell = parser.nextRow();            
            Usuario usr = new Usuario();
            PerfilUsuario usrProfile = new PerfilUsuario();
            EstudianteBachillerato bachStudent = new EstudianteBachillerato();
            
            //lleno las instancias
            String cedulaStr = currentCell[0].getContents();
            int cedulaInt = Integer.parseInt(cedulaStr);
            String apellido = currentCell[1].getContents();
            String nombre = currentCell[2].getContents();
                    
            usr.setNombreUsuario(cedulaStr);
            usr.setContrasenia("12345");
            
            
            usrProfile.setCedula(c);
            
        }
        return null;
    }
}