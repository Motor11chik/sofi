package org.sofy;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Софи on 26.08.2016.
 */
public class List {


    static String number() {
        System.out.println("Введите вопрос");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        return x;
    }

    public static void main(String[] args) {
        ArrayList vopros = new ArrayList();
        vopros.add(number());
        vopros.add(number());
        System.out.println(vopros);
    }

}
