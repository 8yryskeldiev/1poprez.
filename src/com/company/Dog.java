package com.company;

public final class Dog extends  Pet {
    private  String  name ,breed , commands;

    public Dog() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog(String тузик, String овчарка, Color white) {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
     super(color,shelter);
        this.name = name;
        this.breed = breed;

    }
    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }
   public void makeVoice(String voice, int number){
       for (int i = 0; i < number; i++) {
           System.out.println(voice);
       }
   }
   public void makeVoice( int number,String voice){
       for (int i = 0; i <number ; i++) {
           System.out.println(voice);

       }
   }
    public void makeVoice( ){
        System.out.println("Гав-Гав");

    }
    public String getInfo(){
        return "Name:  "+ name +" Breed:  "+ breed + " Commands:  " + commands + super.getInfo();

    }
}
