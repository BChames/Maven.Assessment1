package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String name;
    Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
/*
        if (pets == null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }

 */
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        List<Pet> petList = new ArrayList<>();

        if (!(pets == null)){
            petList = Arrays.asList(getPets());
        }

        petList.add(pet);
        pets = petList.toArray(new Pet[petList.size()]);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        ArrayList<Pet> petList = new ArrayList<>(Arrays.asList(pets));

        int index = petList.indexOf(pet);
        petList.set(index, null);

        pets = petList.toArray(new Pet[petList.size()]);
    }



    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return null;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return null;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
