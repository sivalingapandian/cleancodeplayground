package com.mycompany.cleancode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pandian on 6/11/15.
 */
public class MySingletonTest {

    @Test
    public void shouldRetrurnSingleInstance() throws InterruptedException {
        MySingleton.getInstance();
    }

}