package Algorithm6;

public class Printer {
	
	
	public static void printDocument(PDFDocument printPDFDocument, WordDocument printWordDocument ) {
		
		printPDFDocument.getBody();
		printWordDocument.getBody();
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PDFDocument pdf =new PDFDocument("idil");
		WordDocument word =new WordDocument("kubat");
		Printer.printDocument(pdf, word);

	}

}
