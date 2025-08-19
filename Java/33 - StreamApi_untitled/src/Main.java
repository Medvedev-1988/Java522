import java.awt.datatransfer.StringSelection;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Задания на конвейерные методы (промежуточные):
//        1)Фильтрация чисел
//        Дан список List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40).
//                Отфильтруй только те числа, которые делятся на 5, но не делятся на 10.

//        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
//        numbers = numbers.stream().filter(x -> x % 5 == 0 && x % 10 != 0).toList();
//        System.out.println(numbers);

//        2)Маппинг строк в длину
//        Дан список List<String> cities = Arrays.asList("Baku", "London", "New York", "Berlin").
//                Получи List<Integer> с длинами всех городов.

//        List<String> cities = Arrays.asList("Baku", "London", "New York", "Berlin");
//        List<Integer> cityLength = cities.stream()
//                .map(String::length)
//                .toList();
//        System.out.println(cityLength);

//        3)Сортировка по длине строки
//        Отсортируй cities по возрастанию длины названия.

//        List<String> cities = Arrays.asList("Baku", "London", "New York", "Berlin", "Osh", "St.Petersburg");
//        List<String> sortedCities = cities.stream().sorted((x, y) -> x.length() - y.length()).toList();
//        System.out.println(sortedCities);

//        4)Переименование файлов
//        Дана коллекция List<String> files = Arrays.asList("photo.jpg", "doc.txt", "archive.zip").
//                Добавь префикс "backup_" ко всем названиям файлов.

//        List<String> files = Arrays.asList("photo.jpg", "doc.txt", "archive.zip");
//        List<String> renamedFiles=files.stream().map(fileName->"backup_"+fileName).toList();
//        System.out.println(renamedFiles);

//        5)Объединение слов
//        Есть List<String> phrases = Arrays.asList("Java is", "fun to", "learn and", "use!").
//                Раздели все фразы на отдельные слова с помощью flatMap.

//        List<String> phrases = Arrays.asList("Java is", "fun to", "learn and", "use!");
//        List<String> words=phrases.stream().flatMap(x->Arrays.stream(x.split(" "))).toList();
//        System.out.println(words);

//        Задания на терминальные методы:
//        6)Проверка наличия большого числа
//        Дан список List<Integer> numbers.
//        Используй anyMatch, чтобы проверить, есть ли число больше 1000.

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(100);
//        numbers.add(10000);
//        numbers.add(50);
//        numbers.add(1000);
//        System.out.println(numbers.stream().anyMatch(x -> x > 1000));

//        7)Поиск самого короткого слова
//        Дан список слов. Найди слово с минимальной длиной с помощью min.

//        List<String> words = new ArrayList<>();
//        words.add("Cat");
//        words.add("House");
//        words.add("Bear");
//        words.add("Animal");
//        words.add("Mouse");
//
//        Optional<String> shortestWord = words.stream().min((x,y)->x.length()-y.length());
//        if (shortestWord.isPresent()) {
//            System.out.println("Самое короткое слово: " + shortestWord.get());
//        } else {
//            System.out.println("Список слов пуст");
//        }

//        8)Сумма чётных чисел
//        Дан список чисел. Найди сумму только чётных чисел с помощью reduce.

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//        System.out.println(numbers.stream().filter(x -> x % 2 == 0).reduce((x,y)->x+y).get());


//        9)Подсчёт слов длиной > 5
//        Дан список слов. Посчитай, сколько слов имеют длину больше 5 с помощью count.

//        List<String> words = new ArrayList<>();
//        words.add("Cat");
//        words.add("Potato");
//        words.add("Bear");
//        words.add("Animal");
//        words.add("Mouse");
//        System.out.println(words.stream().filter(x->x.length()>5).count());

//        10)Найди первую строку, начинающуюся с буквы 'A'
//        Используй findFirst для поиска строки, начинающейся на "A" из списка строк.

        List<String> words = Arrays.asList("Sasha", "Maksim", "Aleksey", "Valera", "Anton");
        Optional<String> startsAWords = words.stream().filter(x -> x.startsWith("A")).findFirst();
        if (startsAWords.isPresent()) {
            System.out.println("Первая строка,начинающаяся на 'А': " + startsAWords.get());
        } else {
            System.out.println("Строка не найдена");
        }
    }
}