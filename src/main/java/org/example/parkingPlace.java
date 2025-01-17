package org.example;

public class parkingPlace {
    int stunde = 60;
    int minuten;
    int preis = 3;
    int starTtime = 480;
    int endTime = 920;
    double time;
    double totalpreis;

    double calcTime(int starTtime , int endTime , double time) {
        if (starTtime <= 480 && endTime <= 480) {
            return starTtime = 0;


        } else if (starTtime >= 1020) {
            return starTtime = 0;


        }
        time = endTime - starTtime;
        return time;

    }

    double calcPreis(double time , double totalpreis) {

            totalpreis = time * preis;
            return totalpreis;
    }
}



