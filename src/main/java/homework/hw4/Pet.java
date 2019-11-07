//package homework.hw4;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Pet {
//    private String species;
//    private String nickname;
//    private int age;
//    private int trickLevel = 69;
//    private String[] habits;
//
//    public void eat() {
//        System.out.println("I'm eating");
//    }
//
//    public void respond() {
//        System.out.println("Hello, owner. I am" + this.nickname + ". I miss you!");
//    }
//
//    public void foul() {
//        System.out.println("I need to cover it up");
//    }
//
//    @Override
//    public String toString() {
//        return species + "{" +
//                ", nickname='" + nickname + '\'' +
//                ", age=" + age +
//                ", trickLevel=" + trickLevel +
//                ", habits=" + Arrays.toString(habits) +
//                '}';
//    }
//
//    public Pet(String species, String nickname) {
//        this.species = species;
//        this.nickname = nickname;
//    }
//
//    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
//        this.species = species;
//        this.nickname = nickname;
//        this.age = age;
//        this.trickLevel = trickLevel;
//        this.habits = habits;
//    }
//
//    public Pet() {
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pet pet = (Pet) o;
//        return age == pet.age &&
//                trickLevel == pet.trickLevel &&
//                Objects.equals(species, pet.species) &&
//                Objects.equals(nickname, pet.nickname) &&
//                Arrays.equals(habits, pet.habits);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(species, nickname, age, trickLevel);
//        result = 31 * result + Arrays.hashCode(habits);
//        return result;
//    }
//}