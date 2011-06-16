/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loadStudents;

import jxl.*;
import jxl.Workbook;
import java.io.File;
/**
 *
 * @author giuseppe
 */
public class Parser {

    private String fileName;
    private Workbook workbook;
    private Sheet sheet;
    private int indexSheet;
    private int indexRow;
    private int numRows;
    private int numColumns;

    public Parser() {
        this.fileName = null;
        this.workbook = null;
    }

    public Parser(String name) {
        this.fileName = name;
        this.workbook = null;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String name) {
        this.fileName = name;
        if (this.workbook != null) {
            this.workbook.close();
            this.workbook = null;
        }
    }

    public Workbook getWorkbook() {
        if (this.workbook == null) {
            try {
                this.workbook = Workbook.getWorkbook(new File(this.fileName));
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error en la lectura del archivo: '" + this.fileName + "':\n" + e);
            }
        }
        return this.workbook;
    }

    public void setWorkbook() {
        try {
            this.workbook = Workbook.getWorkbook(new File(this.fileName));
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la lectura del archivo: '" + this.fileName + "':\n" + e);
        }
    }

    public int getIndexRow(){
        return this.indexRow;
    }
    
    public void setIndexRow(int i){
        this.indexRow = i;
    }
    
    public Sheet getSheet() {
        return this.sheet;
    }
    
    public void setSheet(int i) {
        this.sheet = this.workbook.getSheet(i);
        this.numColumns = this.sheet.getColumns();
        this.numRows = this.sheet.getRows();
    }

    public int getNumSheet(){
        return this.indexSheet;
    }
    
    public int getNumRows(){
        return this.numRows;
    }
    
    public int getNumColumns(){
        return this.numColumns;
    }
    
    public void setReading(String name, int s) {
        try {
            //Se abre el fichero Excel
            this.setFileName(name);
            this.setWorkbook();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error en la lectura del archivo: '" + this.fileName + "':\n" + e);
        }

        //Se obtiene la primera hoja, este seria nuestro caso ya que el archivo
        // que es el de copias liceos litoral que nos mando hancel usaremos la primera hoja 
        this.setSheet(s);
        this.indexRow = 0;
        this.indexSheet = s;
    }
    
    public boolean theresNextRow(){
        return (this.indexRow < this.numRows-1);
    }
    
    public Cell[] nextRow(){
        this.indexRow++;
        return this.sheet.getRow(this.indexRow-1);
    }
    
    public void close(){
        this.workbook.close();
    }
    
    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.setReading("web/tmpFiles/CopiaDePreinscritos25_feb_2011.xls",0);
        System.out.println("Ejemplo Finalizado.");
    }
    /*for (int i = 989; i < 999; i++) {
            //Se obtiene la celda i-esima
            Cell[] row = sheet.getRow(i);

            //Se imprime en pantalla la celda según su tipo
                /*if (cell.getType() == CellType.NUMBER)
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
            //System.out.println("Final antes catch");
            System.out.println("Linea " + i + ":");
            for (int j = 0; j < row.length; j++) {
                System.out.println(row[j].getContents() + ",");
            }
            System.out.println("");
        }
        this.workbook.close();*/
}
