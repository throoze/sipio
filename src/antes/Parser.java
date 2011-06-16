/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;
import jxl.*;
import jxl.Workbook;
import jxl.read.biff.*;
import java.io.File;
import java.io.IOException;
import jxl.write.WriteException;
import java.util.Locale;

/**
 *
 * @author giuseppe
 */
public class Parser {
    
    public static void main(String[] args) {
    leerExcel();
        System.out.println("Ejemplo Finalizado.");

    }
    
    public static void leerExcel()
    {
        try
        {
            //Se abre el fichero Excel      
            Workbook workbook = Workbook.getWorkbook(new File("/home/giuseppe/Escritorio/exceltry1.xls" )); 
            System.out.println("workbook:(  ");
 
            //Se obtiene la primera hoja, este seria nuestro caso ya que el archivo
            // que es el de copias liceos litoral que nos mando hancel usaremos la primera hoja 
            Sheet sheet = workbook.getSheet(0); 
 
            //Se leen las primeras celdas y bueh de aqui pa alla puro marikera de 
            // codigo fors etc ;)
            
            for(int i=0; i<3; i++)
            {
                //Se obtiene la celda i-esima
                Cell cell = sheet.getCell(i,0);
 
                //Se imprime en pantalla la celda según su tipo
                if (cell.getType() == CellType.NUMBER)
                {
                    System.out.println("Número: " + ((NumberCell)cell).getValue());
                }
                else if (cell.getType() == CellType.LABEL)
                {
                    System.out.println("String: " + ((LabelCell)cell).getString());
                }
                else if (cell.getType() == CellType.BOOLEAN)
                {
                    System.out.println("Boolean: " + ((BooleanCell)cell).getValue());
                }
                else if (cell.getType() == CellType.DATE)
                {
                    System.out.println("Fecha: " + ((DateCell)cell).getDate());
                }
                System.out.println("Final antes catch");
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error! :(  ");
        }
    }
}
