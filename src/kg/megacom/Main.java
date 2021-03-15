package kg.megacom;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Animals> animalsSet = new TreeSet<>();
        Animals catSet = new Animals("Cat", 15);
        Animals rabbitSet = new Animals("Rabbits", 12);
        Animals horseSet = new Animals("Horses", 25);
        Animals cowSet = new Animals("Cows", 20);
        Animals goatSet = new Animals("Goat", 10);
        Animals ratSet = new Animals("Rats", 6);
        animalsSet.add(catSet);
        animalsSet.add(rabbitSet);
        animalsSet.add(horseSet);
        animalsSet.add(cowSet);
        animalsSet.add(goatSet);
        animalsSet.add(ratSet);
        System.out.println("-------------Added animals to TreeSet");
        animalsSet.forEach(System.out::println);
        System.out.println("\n-------------Checking size of TreeSet");
        System.out.println(animalsSet.size());
        System.out.println("\n-------------Removed cat from TreeSet");
		animalsSet.remove(catSet);
		animalsSet.forEach(System.out::println);
        System.out.println("\n---Checking content of TreeSet for cat");
        System.out.println(animalsSet.contains(catSet));
        System.out.println("\n---Checking content of TreeSet for rabbit");
        System.out.println(animalsSet.contains(rabbitSet));
        System.out.println(animalsSet.size());
        TreeSet<WildAnimals> wildAnimalsSet = new TreeSet<>();
        WildAnimals africanLion = new WildAnimals("African lion", 30);
        WildAnimals capeBuffalo = new WildAnimals("Cape Buffalo", 33);
        WildAnimals crocodiles = new WildAnimals("Crocodiles", 18);
        WildAnimals elephant = new WildAnimals("Elephant", 43);
        wildAnimalsSet.add(africanLion);
        wildAnimalsSet.add(capeBuffalo);
        wildAnimalsSet.add(crocodiles);
        wildAnimalsSet.add(elephant);
        System.out.println("\n--------------Added wild animals to TreeSet");
        wildAnimalsSet.forEach(System.out::println);
        animalsSet.addAll(wildAnimalsSet);
        System.out.println("\n--------------Added Animals to Wild animals");
        animalsSet.forEach(System.out::println);
    }
}
