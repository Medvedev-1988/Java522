import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    // 1) Создание объектов файловой системы
    public static void createFileSystemObjects(Scanner scanner) throws IOException {
        System.out.println("1) Создать новую папку");
        System.out.println("2) Создать новый текстовый файл");
        System.out.print("Ваш выбор: ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("1")) {
            System.out.print("Введите имя новой папки: ");
            String folderName = scanner.nextLine();
            File folder = new File(folderName);
            if (folder.mkdir()) {
                System.out.println("Папка '" + folder.getName() + "' успешно создана.");
            } else {
                System.out.println("Не удалось создать папку. Возможно, она уже существует.");
            }
        } else if (choice.equalsIgnoreCase("2")) {
            System.out.print("Введите имя нового текстового файла: ");
            String fileName = scanner.nextLine();
            File file = new File( fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("Файл '" + file.getName() + "' успешно создан.");
            } else {
                System.out.println("Не удалось создать файл. Возможно, он уже существует.");
            }
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    // 2) Запись в файл
    public static void writeFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для записи: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName + ".txt");

        if (!file.exists()) {
            System.out.println("Файл не существует.");
            return;
        }

        System.out.println("1) Перезаписать файл");
        System.out.println("2) Добавить в конец файла");
        System.out.print("Ваш выбор: ");
        String choice = scanner.nextLine();

        System.out.print("Введите текст для записи: ");
        String text = scanner.nextLine();

        FileWriter fileWriter;
        if (choice.equalsIgnoreCase("1")) {
            fileWriter = new FileWriter(file);
        } else if (choice.equalsIgnoreCase("2")) {
            fileWriter = new FileWriter(file, true);
        } else {
            System.out.println("Неверный выбор.");
            return;
        }

        fileWriter.write(text);
        fileWriter.close();
        System.out.println("Текст успешно записан в файл.");
    }

    // 3) Чтение из файла
    public static void readFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла для чтения: ");
        String fileName = scanner.nextLine();
        File file = new File( fileName + ".txt");

        if (!file.exists()) {
            System.out.println("Файл не существует.");
            return;
        }

        FileReader fileReader = new FileReader(file);
        char[] fileContents = new char[(int) file.length()];
        int countSymbols = fileReader.read(fileContents);
        fileReader.close();

        System.out.println("Содержимое файла:");
        for (int i = 0; i < countSymbols; i++) {
            System.out.print(fileContents[i]);
        }
        System.out.println();
    }

    // 4) Получение информации о файле/папке
    public static void getFileInfo(Scanner scanner) {
        System.out.print("Введите имя файла или папки для получения информации: ");
        String name = scanner.nextLine();
        File file = new File(name);

        if (!file.exists()) {
            System.out.println("Файл или папка не существует.");
            return;
        }

        System.out.println("Имя: " + file.getName());
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Права на чтение: " + file.canRead());
        System.out.println("Права на запись: " + file.canWrite());
        System.out.println("Права на выполнение: " + file.canExecute());
        System.out.println("Это папка: " + file.isDirectory());
        System.out.println("Это файл: " + file.isFile());
    }

    // 5) Переименование файла/папки
    public static void renameFile(Scanner scanner) {
        System.out.print("Введите имя файла или папки для переименования: ");
        String oldName = scanner.nextLine();
        File oldFile = new File( oldName);

        if (!oldFile.exists()) {
            System.out.println("Файл или папка не существует.");
            return;
        }

        System.out.print("Введите новое имя: ");
        String newName = scanner.nextLine();
        File newFile = new File( newName);

        if (oldFile.renameTo(newFile)) {
            System.out.println("Файл/папка успешно переименованы.");
        } else {
            System.out.println("Не удалось переименовать файл/папку.");
        }
    }

    // 6) Удаление файла/папки
    public static void deleteFile(Scanner scanner) {
        System.out.print("Введите имя файла или папки для удаления: ");
        String name = scanner.nextLine();
        File file = new File( name);

        if (!file.exists()) {
            System.out.println("Файл или папка не существует.");
            return;
        }

        if (file.delete()) {
            System.out.println("Файл/папка успешно удалены.");
        } else {
            System.out.println("Не удалось удалить файл/папку.");
        }
    }

    // 7) Перемещение файла/папки
    public static void moveFile(Scanner scanner) throws IOException {
        System.out.print("Введите имя файла или папки для перемещения: ");
        String sourceName = scanner.nextLine();
        Path sourcePath = Paths.get(sourceName);

        if (!Files.exists(sourcePath)) {
            System.out.println("Файл или папка не существует.");
            return;
        }

        System.out.print("Введите новое местоположение (полный путь): ");
        String targetPathString = scanner.nextLine();
        Path targetPath = Paths.get(targetPathString);

        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл/папка успешно перемещены из " + sourcePath + " в " + targetPath);
        } catch (IOException e) {
            System.err.println("Ошибка при перемещении файла/папки: " + e.getMessage());
        }
    }

    // 8) Отображение структуры папок
    public static void displayDirectoryStructure(Scanner scanner) {
        System.out.println("Введите путь к папке:");
        String basePath=scanner.nextLine();

        System.out.println("Структура папок:");
        System.out.println("(*) -> Файл");
        System.out.println("(#) -> Папка");
        File mainFolder = new File(basePath);
        printDirectoryTree(mainFolder, "");
    }

    public static void printDirectoryTree(File folder, String indent) {
        if (folder == null || !folder.exists()) return;

        File[] files = folder.listFiles();
        if (files == null) return;

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(indent + "|--" + f.getName() + " (#)");
                printDirectoryTree(f, indent + "   ");
            } else {
                System.out.println(indent + "|--" + f.getName() + " (*)");
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nФайловое меню:");
            System.out.println("1) Создание объектов файловой системы");
            System.out.println("2) Запись в файл");
            System.out.println("3) Чтение из файла");
            System.out.println("4) Получение информации о файле/папке");
            System.out.println("5) Переименование файла/папки");
            System.out.println("6) Удаление файла/папки");
            System.out.println("7) Перемещение файла/папки");
            System.out.println("8) Отображение структуры папок");
            System.out.println("0) Выход");

            System.out.print("Ваш выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        createFileSystemObjects(scanner);
                        break;
                    case 2:
                        writeFile(scanner);
                        break;
                    case 3:
                        readFile(scanner);
                        break;
                    case 4:
                        getFileInfo(scanner);
                        break;
                    case 5:
                        renameFile(scanner);
                        break;
                    case 6:
                        deleteFile(scanner);
                        break;
                    case 7:
                        moveFile(scanner);
                        break;
                    case 8:
                        displayDirectoryStructure(scanner);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (IOException e) {
                System.err.println("Произошла ошибка ввода/вывода: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}


// ======================================================================================

//

// 1) Создание объектов файловой системы
// -- Создание новой папки по указанному пути
// -- Создание нового текстового файла по указанному пути

//public class Main {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("Файл: " + file.getName() + " успешно создан");
//            } else {
//                System.out.println("Файл: " + file.getName() + " уже существует");
//            }
//        } catch (IOException e) {
//
//        }
//        File folder = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test");
//        try {
//            if (folder.mkdir()) {
//                System.out.println("Папка: " + folder.getName() + " успешно создана");
//            } else {
//                System.out.println("Папка: " + folder.getName() + "уже существует");
//            }
//        } catch (Exception e) {
//
//        }

// 2)Запись в файл
// --Запись строки в файл (с перезаписью содержимого)
// --Добавление строки в конец файла (без удаления существующего текста)

//public class Main {
//    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt");
//        fileWriter.write("Привет Дима");
//        fileWriter.close();
//        FileWriter fileWriter = new FileWriter("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt", true);
//        fileWriter.append("Привет Дима ");
//        fileWriter.close();

// 3)Чтение из файла
// --Отображение содержимого файла в консоли

//public class Main {
//    public static void main(String[] args) throws IOException {
//        FileWriter fileWriter = new FileWriter("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt");
//        fileWriter.append("Привет Дима");
//        fileWriter.close();
//        FileReader fileReader = new FileReader("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt");
//        char[] fileContens = new char[100];
//        int countSymbl = fileReader.read(fileContens);
//        for (int i = 0; i < countSymbl; i++) {
//            System.out.print(fileContens[i]);
//        }
//        fileReader.close();
//
//    }
//}

// 4)Получение информации
// --Получение сведений о файле или папке: имя, путь, абсолютный путь, размер, права доступа (чтение, запись, выполнение)

//public class Main {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test2.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("Файл успешно создан");
//            } else {
//                System.out.println("Такой файл уже существует");
//            }
//
//        } catch (IOException e) {
//
//        }
//
//        System.out.println("Имя файла: " + file.getName());
//        System.out.println("Путь файла: " + file.getPath());
//        System.out.println("Абсолютный путь файла: " + file.getAbsolutePath());
//        System.out.println("Размер файла: " + file.length());
//        System.out.println("Права доступа(чтение) файла: " + file.canRead());
//        System.out.println("Права доступа(запись) файла: " + file.canWrite());
//        System.out.println("Права доступа(выполнение) файла: " + file.canExecute());

// 5)Переименование
// --Переименование файла или папки на новое имя или с изменением полного пути

//public class Main {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test2.txt");
//        try {
//            file.renameTo(new File("test4.txt"));
//        } catch (Exception e) {
//
//        }

// 6)Удаление
// --Удаление файла
// --Удаление пустой папки

//public class Main {
//    public static void main(String[] args) throws IOException {
//        File folder = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test");
//        File file = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test\\test4.txt");
//        try {
//            folder.mkdir();
//            file.createNewFile();
//
//        } catch (IOException e) {
//
//        }
//        file.delete();
//        folder.delete();
// Или создаем папку,внутри файл и удаляем последовательно по очереди через file.delete();
//        File file1 = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test\\test4.txt");
//        file1.delete();

// 7)Перемещение
// --Перемещение файла или папки по новому указанному пути

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;

//public class Main {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("Файл: " + file.getName() + " успешно создан");
//            } else {
//                System.out.println("Файл: " + file.getName() + " уже существует");
//            }
//        } catch (IOException e) {
//
//        }
//        File folder = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test");
//        try {
//            if (folder.mkdir()) {
//                System.out.println("Папка: " + folder.getName() + " успешно создана");
//            } else {
//                System.out.println("Папка: " + folder.getName() + "уже существует");
//            }
//        } catch (Exception e) {
//
//        }
//
//        String sourcePathString = "C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test.txt";
//        String targetPathString = "C:\\Users\\diman\\IdeaProjects\\31 - File_untitled\\src\\test\\test.txt";
//
//        try {
//            Path sourcePath = Paths.get(sourcePathString);
//            Path targetDirPath = Paths.get(targetPathString);
//
//            // Перемещаем файл/папку
//            Files.move(sourcePath, targetDirPath, StandardCopyOption.REPLACE_EXISTING);
//
//            System.out.println("Файл/Папка успешно перемещены из " + sourcePath + " в " + targetDirPath);
//
//        } catch (IOException e) {
//            System.err.println("Ошибка при перемещении файла/папки: ");
//        }
//    }
//}

// 8)Отображение структуры папок
// --Рекурсивный вывод дерева папок и файлов, начиная с указанного пути

//public class Main {
//    public static void printDirectoryTree(File folder, String str) {
//        if (folder == null || !folder.exists()) return;
//
//        File[] files = folder.listFiles();
//        if (files == null) return;
//
//        for (File f : files) {
//            if (f.isDirectory()) {
//                System.out.println(str + "|--" + f.getName() + " (#)");
//                printDirectoryTree(f, str + "   ");
//            } else {
//                System.out.println(str + "|--" + f.getName() + " (*)");
//            }
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        System.out.println("(*) -> This is File");
//        System.out.println("(#) -> This is Folder");
//        File mainFolder = new File("C:\\Users\\diman\\IdeaProjects\\31 - File_untitled");
//        printDirectoryTree(mainFolder,"");
//    }
//}







