//package homework.hw4;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Human {
//    private String name;
//    private String surname;
//    private int year;
//    private Human mother;
//    private Human father;
//    private int iq;
//    private Pet pet;
//    private String[][] schedule;
//
//    public void greetPet(Pet pet) {
//        System.out.println("Hello, " + pet.nickname);
//    }
//
//    public void describePet(Pet pet) {
//        System.out.println("I have a " + pet.species + ", he is " + pet.age + " years old, he is very sly");
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", year=" + year +
//                ", iq=" + iq +
//                ", pet=" + pet +
//                ", mother=" + mother +
//                ", father=" + father +
//                ", schedule=" + Arrays.toString(schedule) +
//                '}';
//
//    }
//
//    public Human(String name, String surname, int year) {
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//    }
//
//    public Human(String name, String surname, int year, Human mother, Human father) {
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//        this.mother = mother;
//        this.father = father;
//    }
//
//    public Human(String name, String surname, int year, Human mother, Human father, int iq, Pet pet, String[][] schedule) {
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//        this.mother = mother;
//        this.father = father;
//        this.iq = iq;
//        this.pet = pet;
//        this.schedule = schedule;
//    }
//
//    public Human() {
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Human human = (Human) o;
//        return year == human.year &&
//                iq == human.iq &&
//                Objects.equals(name, human.name) &&
//                Objects.equals(surname, human.surname) &&
//                Objects.equals(mother, human.mother) &&
//                Objects.equals(father, human.father) &&
//                Objects.equals(pet, human.pet) &&
//                Arrays.equals(schedule, human.schedule);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(name, surname, year, mother, father, iq, pet);
//        result = 31 * result + Arrays.hashCode(schedule);
//        return result;
//    }
//}