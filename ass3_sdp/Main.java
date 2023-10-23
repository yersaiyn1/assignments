import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите направление конвертации (1 - Word в PDF, 2 - PDF в Word): ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // Очистка буфера после считывания числа

        System.out.print("Введите имя исходного файла: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Введите имя целевого файла: ");
        String targetFileName = scanner.nextLine();

        if (choice == 1) {
            WordToPdfConverter wordToPdfConverter = new WordToPdfConverter();
            FileConverter fileConverter = new WordToPdfAdapter(wordToPdfConverter);
            fileConverter.convert(sourceFileName, targetFileName);
        } else if (choice == 2) {
            PdfToWordConverter pdfToWordConverter = new PdfToWordConverterImpl();
            FileConverter fileConverter = new PdfToWordAdapter(pdfToWordConverter);
            fileConverter.convert(sourceFileName, targetFileName);
        } else {
            System.out.println("Выбор неверен. Пожалуйста, выберите 1 для Word в PDF или 2 для PDF в Word.");
        }

        System.out.println("Конвертация завершена!");
    }
}
