package day28_loops;

import java.time.LocalDate;

public class JavaCityCases {
    public static void main(String[] args) {
        /*
        add new package day28_loops

add new class JavaCityCases

int totalCases = 0;
loop day = 1 till day 30

every day there are 200 new cases

every sunday(day % 7 == 0) there are 500 new cases

"day 1 - daily cases: 200"

--------------

print totalCases =
         */
        int cases = 0 ;
        for(int day = 1; day <= 30; day++) {
           cases += (day % 7 != 0) ? 200 : 500;
            System.out.println("day " + day + " - total cases: " + cases + " - " + LocalDate.of(2021, 03, day));
        }
        System.out.print("Total cases : " + cases);
    }
}
