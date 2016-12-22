package com.example.jrcat.mygame;

import org.hamcrest.core.StringContains;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    public String getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(String myProperty) {
        this.myProperty = myProperty;
    }

    private String myProperty;

    private void DoSomething(String someValue){
        setMyProperty(someValue);
    }


}