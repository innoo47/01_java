package com.ohgiraffers.section04.uses2;

public class Application {
    public static void main(String[] args) {

        DatabaseSaveProvider databaseSaveProvider = new DatabaseSaveProvider();
        FileSaveProvider fileSaveProvider = new FileSaveProvider();

        Person person = new Person(databaseSaveProvider);
        person.doSomething();
    }
}
