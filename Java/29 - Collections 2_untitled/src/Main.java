import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int numberCount(String str) {
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numberCount++;
            }
        }
        return numberCount;
    }

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dog", "собака");
        dictionary.put("home1", "дом");
        dictionary.put("mother", "мама");
        dictionary.put("father", "11папа");
        dictionary.put("brother45", "брат");


        do {
            System.out.println();
            System.out.println("Введите слово (print,exit,cls,size,letter,num,delete,update) : ");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            word = word.toLowerCase();
            //6) update        -> заменить значение по ключу
            if (word.equals("update")) {
                System.out.println("Введите ключ для обновления значения: ");
                String keyToUpdate = scanner.nextLine().toLowerCase();
                if (dictionary.containsKey(keyToUpdate)) {
                    System.out.println("Введите новое значение для ключа: ");
                    String newValue = scanner.nextLine().toLowerCase();
                    dictionary.put(keyToUpdate, newValue);
                    System.out.println("Новое значение для ключа: " + keyToUpdate + " успешно обновлено");
                } else {
                    System.out.println("Ошибка обновления значения,такой ключ не найден");
                }
            }
            //5) delete        -> удаление по ключу
            else if (word.equals("delete")) {
                System.out.println("Введите ключ для удаления: ");
                String keyToDelete = scanner.nextLine().toLowerCase();
                if (dictionary.containsKey(keyToDelete)) {
                    dictionary.remove(keyToDelete);
                    System.out.println("Ключ: " + keyToDelete + " был успешно удален");
                } else {
                    System.out.println("Ошибка удаления ключа,такой ключ не найден");
                }
            }
            //4) num(всего)    -> количество чисел в словаре
            else if (word.equals("num")) {
                int totalNumbersCount = 0;
                for (String key : dictionary.keySet()) {
                    totalNumbersCount += numberCount(key);
                }
                for (String value : dictionary.values()) {
                    totalNumbersCount += numberCount(value);
                }
                System.out.println("Количество цифр во всех парах: " + totalNumbersCount);
            }
            //3) letter(всего) -> количество букв в словаре
            else if (word.equals("letter")) {
                int totalLetters = 0;
                for (String key : dictionary.keySet()) {
                    totalLetters += key.length();
                    totalLetters += dictionary.get(key).length();
                }
                System.out.println("Всего в словаре букв: " + totalLetters);
            }
            //2) size          -> количество слов в словаре (пар)
            else if (word.equals("size")) {
                System.out.println("Размер словаря  в парах : " + dictionary.size());
            }
            //1) cls           -> очищает весь словарь
            else if (word.equals("cls")) {
                dictionary.clear();
                System.out.println("Словарь успешно очищен");
            } else if (word.equals("exit")) {
                System.out.println("До свидания");
                break;
            } else if (word.equals("print")) {
                int count = 1;
                for (String key : dictionary.keySet()) {
                    System.out.println(count++ + ")" + key + "(en)=>" + dictionary.get(key) + "(ru)");
                }
            } else if (dictionary.containsKey(word)) {
                System.out.println(word + "(en)=>" + dictionary.get(word) + "(ru)");
            } else if (dictionary.containsValue(word)) {
                for (String key : dictionary.keySet()) {
                    if (dictionary.get(key).equals(word)) {
                        System.out.println(word + "(ru)=>" + key + "(en)");
                        break;
                    }
                }
            } else {
                System.out.println("Слово не найдено,хотите добавить слово " + word + "?" + "\n1 - Да\n2 - Нет");
                int select = scanner.nextInt();
                if (select == 1) {
                    scanner = new Scanner(System.in);
                    System.out.println("Введите перевод слова : ");
                    String translate = scanner.nextLine();
                    translate = translate.toLowerCase();
                    System.out.println("Выберите вариант для перевода: \n" +
                            "1 - (en)=>(ru)\n" +
                            "2 - (ru)=>(en)\n" +
                            "3 - Отмена");
                    select = scanner.nextInt();
                    if (select == 1) {
                        dictionary.put(word, translate);
                        System.out.println("Слово успешно добавлено");
                    } else if (select == 2) {
                        dictionary.put(translate, word);
                        System.out.println("Слово успешно добавлено");
                    } else {
                        System.out.println("Отмена");
                    }
                } else if (select == 2) {
                    System.out.println("Хорошо");
                } else {
                    System.out.println("Неверный ввод");
                }
            }
        } while (true);
    }
}