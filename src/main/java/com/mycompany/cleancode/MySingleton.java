package com.mycompany.cleancode;

import java.util.Random;

/**
 * Created by pandian on 6/11/15.
 */
public class MySingleton {

    private static MySingleton mySingleton;

    private MySingleton() throws InterruptedException{
        if( new Random().nextBoolean() ) {
            getInstance();
            Thread.sleep(20);
        }
    }

    public static synchronized MySingleton getInstance() throws InterruptedException{
        if( mySingleton == null ) {
            mySingleton = new MySingleton();
        }
        System.out.println("Object:" + mySingleton);
        return mySingleton;
    }

}
