package com.example.course.abstractapplication;

/**
 * Created by Laze on 9/2/2015.
 */
public class MainApp {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAnimalName("Raf");
        dog.printAnimalName();
        dog.setAnimalAges(32);
        System.out.println("Dog ages: " + dog.getAnimalAges());

        Cat cat = new Cat();
        cat.setAnimalName("Cat");
        cat.printAnimalName();

        System.out.println("My name is now: " + cat.whatsMyName());

        Animal dog2 = getAnimal();

        if (dog2 instanceof Cat) {

        } else if (dog2 instanceof Dog) {
            ((Dog) dog2).newMethod();
        }

        dog2.setAnimalAges(22);
        dog2 = new Cat();

        System.out.println("My second dog has: " + dog2.getAnimalAges() + " ages");


        Animal animall = new Animal() {

            @Override
            public void setAnimalAges(int animalAges) {

            }
            @Override
            public int getAnimalAges() {
                return 0;
            }

        };

        animall.printAnimalName();
        animall.setAnimalAges(30);

    }

    private static Animal getAnimal() {
        return new Dog();
    }
}
