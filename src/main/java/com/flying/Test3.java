package com.flying;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {

        Instant current = Clock.systemDefaultZone().instant();

        System.out.println(current);


    }

}
