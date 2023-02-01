package basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;



public class ToReadPDFtest{
           @Test
           public  void test() throws IOException, SAXException, TikaException {
	//public static void main(String[] args) throws IOException, SAXException, TikaException {
		
		BodyContentHandler contentHandler=new BodyContentHandler();
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/srs automobile.pdf");
		Metadata metadata=new Metadata();
		ParseContext parsecontext=new ParseContext();
		PDFParser parser=new PDFParser();
		parser.parse(fis, contentHandler, metadata, parsecontext);
		System.out.println(contentHandler.toString());
		

	}

}
