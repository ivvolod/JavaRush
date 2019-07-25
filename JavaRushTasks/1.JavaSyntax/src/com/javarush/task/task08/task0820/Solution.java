package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(new Dog());
        dogSet.add(new Dog());
        dogSet.add(new Dog());

        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//        Iterator<Object> iterator = pets.iterator();
        pets.removeAll(cats);
//        Iterator<Cat> catIterator = cats.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals(catIterator.next()) == true){
//                iterator.remove();
//            }
//
//        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            }


    }

    public static class Cat{
//        Cat(){}
    }
    public static class Dog{
//        Dog(){}
    }
}
