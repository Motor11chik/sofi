package org.sofy.domain;

import java.util.List;

/**
 * @author Софи
 * @since 2016.08.27
 */
public interface ITest {
    boolean addQuiz(Quiz quiz);

    boolean removeQuiz(Quiz quiz);

    List<Quiz> listAll();
}
