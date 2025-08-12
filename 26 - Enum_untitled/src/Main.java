//ЗАДАНИЕ 1: Дни недели и рабочие дни
//Цель: создать enum Day, который определяет дни недели.
//Добавь метод isWeekend(), который возвращает true, если день — выходной (суббота или воскресенье).

//import Models.Day;
//
//public class Main {
//    public static void main(String[] args) {
//        Day today = Day.SUNDAY;
//        System.out.println("Сегодня " + today.getDayOfTheWeekend() + ".Это выходной день? - " + today.isWeekend());
//        Day weekendDay = Day.TUESDAY;
//        System.out.println(weekendDay.getDayOfTheWeekend() + " это выходной день? - " + weekendDay.isWeekend());
//        System.out.println("\nДни недели:");
//        for (Day day : Day.values()) {
//            System.out.println(day + " - Выходной: " + day.isWeekend());
//        }
//    }
//}

//ЗАДАНИЕ 2: Курс валют
//Цель: создать enum Currency с валютами (USD, EUR, RUB) и их курсом к рублю.
//Добавь метод toRuble(double amount).

//import Models.Currency;
//
//public class Main {
//    public static void main(String[] args) {
//        double usdAmount = 100.0;
//        double eurAmount = 50.0;
//        double rubAmount = 2000.0;
//        double usdToRub = Currency.USD.toRuble(usdAmount);
//        double eurToRub = Currency.EUR.toRuble(eurAmount);
//        double rubToRub = Currency.RUB.toRuble(rubAmount);
//        System.out.println(usdAmount + " USD= " + usdToRub + " RUB");
//        System.out.println(usdAmount + " EUR= " + eurToRub + " RUB");
//        System.out.println(usdAmount + " RUB= " + rubToRub + " RUB");
//        System.out.println("\nКурс валют:");
//        System.out.println("USD к RUB: " + Currency.USD.getRateToRuble());
//        System.out.println("EUR к RUB: " + Currency.EUR.getRateToRuble());
//        System.out.println("RUB к RUB: " + Currency.RUB.getRateToRuble());
//    }
//}

//ЗАДАНИЕ 3: Уровень приоритета задач
//Цель: создать enum Priority с уровнями LOW, MEDIUM, HIGH, CRITICAL.
//У каждого должен быть числовой код приоритета.

//import Models.Priority;
//
//public class Main {
//    public static void main(String[] args) {
//        Priority lowPriority = Priority.LOW;
//        Priority higthPriority = Priority.HIGH;
//        System.out.println("Приоритет задачи: " + lowPriority + " ,код: " + lowPriority.getPriorityCode());
//        System.out.println("Приоритет задачи: " + higthPriority + " ,код: " + higthPriority.getPriorityCode());
//        System.out.println("\nВсе уровни:");
//        for (Priority priority : Priority.values()) {
//            System.out.println(priority + " - Код приоритета: " + priority.getPriorityCode());
//        }
//    }
//}

//ЗАДАНИЕ 4: Направления движения
//Цель: создать enum Direction с направлениями NORTH, SOUTH, EAST, WEST.
//Добавь метод opposite() — возвращает противоположное направление.

//import Models.Direction;
//
//public class Main {
//    public static void main(String[] args) {
//        Direction currentDirection = Direction.NORTH;
//        System.out.println("Корабль \"Счастливый\" движется в направлении на " + currentDirection.getDirection());
//        System.out.println("Корабль \"Счастливый\" развернулся и движется в направлении на " + currentDirection.opposite().getDirection());
//    }
//}

//ЗАДАНИЕ 5: Статус заказа
//Цель: создать enum OrderStatus с этапами заказа: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
//Добавь метод canChangeTo(OrderStatus newStatus) — можно ли перейти в другой статус.

import Models.OrderStatus;

public class Main {
    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.NEW;
        System.out.println("Текущий статус: " + currentStatus);
        System.out.println("Можно перейти в PROCESSING: " + currentStatus.canChangeTo(OrderStatus.PROCESSING));
        System.out.println("Можно перейти в SHIPPED: " + currentStatus.canChangeTo(OrderStatus.SHIPPED));
        System.out.println("Можно перейти в CANCELLED: " + currentStatus.canChangeTo(OrderStatus.CANCELLED));

        currentStatus = OrderStatus.PROCESSING;
        System.out.println("\nТекущий статус: " + currentStatus);
        System.out.println("Можно перейти в SHIPPED: " + currentStatus.canChangeTo(OrderStatus.SHIPPED));
        System.out.println("Можно перейти в DELIVERED: " + currentStatus.canChangeTo(OrderStatus.DELIVERED));
        System.out.println("Можно перейти в CANCELLED: " + currentStatus.canChangeTo(OrderStatus.CANCELLED));
    }
}
