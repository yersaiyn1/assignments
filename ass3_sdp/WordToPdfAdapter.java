public class WordToPdfAdapter implements FileConverter {
    private WordToPdfConverter wordToPdfConverter;

    public WordToPdfAdapter(WordToPdfConverter wordToPdfConverter) {
        this.wordToPdfConverter = wordToPdfConverter;
    }

    @Override
    public void convert(String sourceFileName, String targetFileName) {
        wordToPdfConverter.convertWordToPdf(sourceFileName, targetFileName);
    }
}
