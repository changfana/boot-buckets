package com.example.eurekaclient.classloader;

public class ClassLoaderTest extends ClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader =ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
