public class Client {
    public static void main(String[] args) {
        WordToPdfConverter wordToPdfConverter = new WordToPdfConverter();
        FileConverter fileConverter = new WordToPdfAdapter(wordToPdfConverter);

        String sourceFileName = "document.docx";
        String targetFileName = "document.pdf";

        fileConverter.convert(sourceFileName, targetFileName);
    }
}
