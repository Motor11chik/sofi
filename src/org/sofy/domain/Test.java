package org.sofy.domain;

import java.util.List;

/**
 * Created by Софи on 27.08.2016.
 */
public class Test implements ITest {
    @Override
    public boolean addQuiz(Quiz quiz) {
        return false;
    }

    @Override
    public boolean removeQuiz(Quiz quiz) {
        return false;
    }

    @Override
    public List<Quiz> listAll() {
        return null;
    }
}
