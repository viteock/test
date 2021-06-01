package day44_custom_classes;

import day44_custom_classes.Animal;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();
        animal.speak("bla-bla-bla");
        animal.type = "tiger";
        System.out.println(animal.type);

        //create object cheetahObject
        System.out.println();

        Animal cheetahObject = new Animal();
        cheetahObject.type = "cheetah";
        System.out.println(cheetahObject.type);
        cheetahObject.eat("cheetos");
        cheetahObject.speak("cheetanguage");
    }
}
