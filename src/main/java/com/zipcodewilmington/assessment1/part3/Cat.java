package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
 */



    public Cat(String name, Integer age) {
        super.name = "Name of Cat";
        this.age = Integer.MAX_VALUE;

    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.name = "Cat name";

        getAge();
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = "Name of Cat";
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super.name = "Cat name";
        this.age = 0;

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
