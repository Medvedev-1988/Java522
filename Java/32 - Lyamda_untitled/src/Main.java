interface StringFilterable {
    boolean filter(String str);
}

interface CounterCondition {
    boolean check(int x);
}

public class Main {
    public static void printFiltered(String[] arr, StringFilterable filterable) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (filterable == null) {
            return;
        }
        for (String str : arr) {
            if (str != null && filterable.filter(str)) {
                System.out.println(str);
            }
        }
    }

    public static int countIf(int[] arr, CounterCondition condition) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (condition == null) {
            return -1;
        }
        int count = 0;
        for (int num : arr) {
            if (condition.check(num)) {
                count++;
            }
        }
        return count;
    }

    public static int sumIf(int[] arr, CounterCondition condition) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (condition == null) {
            return -1;
        }
        int sum = 0;
        for (int num : arr) {
            if (condition.check(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        Задание:1
//        Напиши метод printFiltered(String[] arr, StringFiltrable filtrable),
//        который печатает строки, удовлетворяющие фильтру.
//                printFiltered(arr, s -> s.length() > 3);
//                printFiltered(arr, s -> s.startsWith("A"));
//                printFiltered(arr, s -> s.contains("o"));

//        String[] arr = {"Киви", "Яблоко", "Апельсин", "Лук", "Манго", "Авокадо"};
//        System.out.println("Строки,длиннее 3 символов:");
//        printFiltered(arr, str -> str.length() > 3);
//        System.out.println("\nСтроки,начинающиеся с 'А'");
//        printFiltered(arr, str -> str.startsWith("А"));
//        System.out.println("\nСтроки,содержащие 'о'");
//        printFiltered(arr, str -> str.contains("о"));

//        Задание:2
//        Напиши метод countIf(int[] arr, CounterCondition condition),
//        который подсчитывает по условию .
//                countIf(arr, x -> x % 2 == 0);    // количество чётных
//                countIf(arr, x -> x > 5);         // сколько > 5
//                countIf(arr, x -> x % 10 == 0);   // сколько кратно 10

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        System.out.print("Количество чётных: " + countIf(arr, x -> x % 2 == 0));
//        System.out.print("\nСколько >5: " + countIf(arr, x -> x > 5));
//        System.out.print("\nСколько кратно 10: " + countIf(arr, x -> x % 10 == 0));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30};
        System.out.print("Сумма чётных: " + sumIf(arr, x -> x % 2 == 0));
        System.out.print("\nСумма > 5: " + sumIf(arr, x -> x > 5));
        System.out.print("\nСумма кратно 10: " + sumIf(arr, x -> x % 10 == 0));
    }
}