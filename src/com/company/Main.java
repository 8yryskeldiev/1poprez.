package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pet pet = new Pet();
        Dog dog = new Dog();
        dog.setAge(pet.generateDefaultAge());
        dog.setName("шарик");
        dog.setBreed("Алабай");
        dog.setColor(Color.BROWN);
        dog.setShelter(new Shelter("Dog", "Исанова 123"));
        dog.setCommands("Cидеть");
        Dog dog1 = new Dog("Тузик", "овчарка", Color.WHITE, new Shelter("ASS", "Манас 23"));
        dog1.setCommands("Голос");
        Dog dog2 = new Dog("Тарзан", "питбуль", Color.BLACK, new Shelter("AA", "Айни 45"),"лежать");
        dog1.generateDefaultAge();
        dog2.generateDefaultAge();

        System.out.println(dog.getInfo());
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());


        dog.makeVoice();
        dog1.makeVoice(5,"GAW-GAW");
        dog2.makeVoice("gar gar",3);
    }
}
