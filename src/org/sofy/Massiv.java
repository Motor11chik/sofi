package org.sofy;

import java.util.Scanner;

public class Massiv {


    static String number() {
        System.out.println("Введите ответ");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        return x;
    }

    public static void main(String[] args) {
        int r, q, i;
        r = 0;
        q = 0;
        String[] answere = {
                "Павел",
                "Моторный",
                "22",
                "Да",
                "Один"
        };
        String[] Queschion = {
                "Ваше Имя?",
                "Ваша фамилия?",
                "Сколько вам лет?",
                "У вас есть дети?",
                "Сколько у вас детей?"
        };


        for (i = 0; i < 5; i++) {

            System.out.println(Queschion[i]);
            if (number().equals(answere[i]))
                r++;
            else
                q++;
        }
        System.out.println("Количество правильных ответов " + r + " Количество неверных ответов " + q);
    }
}
