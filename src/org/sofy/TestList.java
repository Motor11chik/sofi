package org.sofy;

import org.sofy.domain.ITest;
import org.sofy.domain.Quiz;
import org.sofy.domain.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Софи
 * @since 2016.08.27
 */
public class TestList {


    static String number() {
        System.out.println("Введите вопрос");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        return x;
    }

    public static void main(String... args) {
        List<String> vopros = new LinkedList<>();
//        List<String> vopros1 = new LinkedList<String>();
//        vopros.add(number());
//        vopros.add(number());
        ITest test = new Test();
        ITest test1 = new ITest() {
            @Override
            public boolean addQuiz(Quiz quiz) {
                return true;
            }

            @Override
            public boolean removeQuiz(Quiz quiz) {
                return false;
            }

            @Override
            public List<Quiz> listAll() {
                return null;
            }
        };

        Quiz quiz1 = new Quiz("2 + 2 = ?", "4");
        Quiz quiz2 = new Quiz("2 + 2 = ?", "4");
        Quiz quiz3 = quiz1;
        System.out.println(quiz1.equals(quiz2));
        System.out.println(quiz1.equals(quiz3));

        System.out.println(quiz1);
        test.addQuiz(quiz1);
        System.out.println(test.addQuiz(quiz1));
        test1.addQuiz(quiz1);
        System.out.println(test1.addQuiz(quiz1));


//        System.out.println(vopros);
    }

}
