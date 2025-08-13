import java.math.BigDecimal;
import java.time.*;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;


public class Main {
//         String[] romans = {"M","D","C","L","X","V","I"};
//         int[] values = {1000,500,100,50,10,5,1};

    public static String toRoman(int number){
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(10);
        while (number>0){
            while (number>= values[i]){
                number-=values[i];
                stringBuilder.append(romans[i]);
            }
            i++;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args)   {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entur num : (1 - 3999)");
        int num = 14;//scanner.nextInt();

        if (num>=1 && num <= 3999){
            System.out.println(toRoman(num));
        }else{
            System.out.println("Error data");
        }


//        LocalDate
//        LocalTime
//        LocalDateTime
//        Period
//        Duration
//        System
//        Instand (1970)
//        ZonaId
//        DateTimeFormatter

//        LocalDate today = LocalDate.now();
//        LocalDate bith =  LocalDate.of(1996,1,21);
//
//      Period period =  Period.between(bith,today);
//        System.out.println(period.getMonths());


        //07-16
        //01-21
        //05--5

//          today.minus(Duration.ofHours(20000));
//          today.minus(Period.of(2,10,10));

//////        today = LocalDate.parse("1996-01-21");
////        System.out.println(today.isLeapYear());
////        System.out.println(today.getYear());
////        System.out.println(today.getDayOfYear());
////        System.out.println(today.getDayOfYear());
////        System.out.println(today.isAfter(bith));
////        System.out.println(today.getDayOfWeek());
//
//
//        today =  today.plusDays(-10769);
//        System.out.println(today);


//        LocalTime localTime = LocalTime.now();
//
//
//        System.out.println(localTime);

        //21:20

//     a++;

//        LocalDateTime localDateTime = LocalDateTime.of(2025,21,1,11,10,1);
//        localDateTime.pl


        //meseca (1-31)

        //qoda (1-365)
        //nedeli


//        LocalDate.now();

//
//        long start = System.nanoTime();
//
//        Thread.sleep(5000);
//
//        long end = System.nanoTime();
//
//        long durationNano =  end - start;
//
//        //second / millisecond microsecond nanosecond
//        double second = durationNano / 1_000_000_000.0;
//        System.out.println(second);



//        Instant start = Instant.now();
//
//        Thread.sleep(5000);
//
//        Instant end = Instant.now();
//
//        Duration durationNano =  Duration.between(start,end);
//
//        System.out.println(durationNano.getNano());


//        Instant start = Instant.now();
//
//        Thread.sleep(5000);
//
//        Instant end = Instant.now();
//
//        Duration durationNano =  Duration.between(start,end);
//
//        System.out.println(durationNano.getNano());



//        long start = System.currentTimeMillis();
//
//        Thread.sleep(5000);
//
//        long end = System.currentTimeMillis();
//
//        long durationNano =  end - start;
//
//        //second / millisecond microsecond nanosecond
//        double second = durationNano / 1_000.0;
//        System.out.println(second);
//
//
//        BigDecimal bigDecimal = BigDecimal.valueOf(10);


//        int a = 3;
//        int b = 2;
//
//        double c =(double) a/b;
//        System.out.println(c);


//        BigDecimal bigDecimal = new BigDecimal(5/2);


//        System.out.println((0.1 + 0.2) == 0.3);
//        System.out.println((0.1 + 0.2) );


//        double d = 19.99;
//        double f = 0.20;
//
//        System.out.println(d*f+d);

//        BigDecimal price = new BigDecimal("19.99");
//        BigDecimal cost = new BigDecimal("0.20");
//        System.out.println(price.multiply(cost).add(price));


    }
}