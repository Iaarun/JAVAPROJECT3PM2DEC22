package filehandling;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteExcel {
    public static void main(String[] args) throws IOException {
        ReadWriteExcel excel = new ReadWriteExcel();
        excel.writedatafromlisttoexcel();
    }

    public void readexcel() throws IOException {
        File file = new File("./src/filehandling/TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
       XSSFSheet sh= wb.getSheet("datasheet");
     String val=  sh.getRow(1).getCell(1).getStringCellValue();
        System.out.println(val);

        wb.close();
    }

    public void writeExcel() throws IOException {
        File file = new File("./src/filehandling/TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh= wb.createSheet("datasheet");
        XSSFRow row= sh.createRow(1);
       XSSFCell cell= row.createCell(1);

       cell.setCellValue("test1");

        FileOutputStream fout = new FileOutputStream(file);
        wb.write(fout);
        fout.close();
        wb.close();
        System.out.println("Data written Successfully");

    }

    public void writedatafromlisttoexcel() throws IOException {
        ArrayList<String> li1 = new ArrayList();
        li1.add("Test31");
        li1.add("Test11");
        li1.add("Test41");
        li1.add("Test21");
        li1.add("Test51");
        li1.add("Test21");

        File file = new File("./src/filehandling/TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh= wb.createSheet("listdatasheet");

        for(int i=0; i<= li1.size()-1; i++){
            sh.createRow(i).createCell(1).setCellValue(li1.get(i));
        }
        FileOutputStream fout = new FileOutputStream(file);
        wb.write(fout);
        fout.close();
        wb.close();
        System.out.println("Data written Successfully");

    }
}
