/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loadStudents;

import org.apache.struts.upload.FormFile;
import org.apache.struts.action.ActionForm;

public class UploadedRegFileForm extends ActionForm {
   FormFile uploadedFile;

   public void setUploadedFile(FormFile file) {
      uploadedFile = file;
   }

   public FormFile getUploadedFile() {
      return uploadedFile;
   }
}