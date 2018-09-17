package com.flying;

import java.time.Clock;
import java.time.Instant;

public class Test4 {

    public static void main(String[] args) {

        Instant current = Clock.systemDefaultZone().instant();

        System.out.println(current);


    }

}
