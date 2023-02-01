package GenericLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadTheFile {
	
	public static Workbook workbook;
	public static FileInputStream fin;
	public static String  frompptyfile(String key) {
		File abspath = new File("./testData/configuration.properties");
		 FileInputStream fis;
		 Properties properties = new Properties();
		try {
			fis = new  FileInputStream(abspath);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(key).toString();
	}
public static String fromexcel(String sheet,int rowno,int cellno ) throws Throwable {
	File filename = new File("C:\\Users\\Gayathri\\eclipse-workspace\\JAVA_SRC_Package\\Elf43\\testData\\excel.xlsx");	
		try {
			fin = new FileInputStream(filename);
			 workbook = WorkbookFactory.create(fin);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return workbook.getSheet(sheet).getRow(rowno).getCell(cellno).getStringCellValue();

}

}






