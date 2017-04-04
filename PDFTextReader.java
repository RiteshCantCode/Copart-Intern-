package extract.text.from.pdf;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFTextReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;

		File file = new File("kruskal.pdf");

		try {
			PDFParser parser = new PDFParser(new RandomAccessFile(file, "rw"));
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);

			String parsedText = pdfStripper.getText(pdDoc);
			System.out.println(parsedText);

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
