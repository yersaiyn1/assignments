public class PdfToWordAdapter implements FileConverter {
    private PdfToWordConverter pdfToWordConverter;

    public PdfToWordAdapter(PdfToWordConverter pdfToWordConverter) {
        this.pdfToWordConverter = pdfToWordConverter;
    }

    @Override
    public void convert(String sourceFileName, String targetFileName) {
        pdfToWordConverter.convertPdfToWord(sourceFileName, targetFileName);
    }
}
