package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheTargetTest {
    GuessTheTarget obj;
    @Before
    public void setUp() throws Exception {
         obj = new GuessTheTarget();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void GuessTargetTest() {
        assertEquals(true, obj.guessTarget(89));
    }
}
