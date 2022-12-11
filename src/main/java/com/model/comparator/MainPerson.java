package com.model.comparator;

import java.util.*;

/**
 * @author Paweł Recław, AmeN
 * @project exercises_streams
 * @created 11.12.2022
 */
public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(
                List.of(
                        new Person("Julia", 13),
                        new Person("Marian", 23),
                        new Person("Julia", 21),
                        new Person("Marcelina", 15),
                        new Person("Gaweł", 29)
                )
        );

//        personList.sort(Comparator.comparing(person -> person.getName()));
//        personList.sort(Comparator.comparing(person -> person.getAge()));
//
//        personList.sort((o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        });

//        Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getName));

        // .reversed() - odwraca kierunek comparator'a dając możliwość sortowania w drugą stronę.
        Set<Person> personSet = new TreeSet<>(Comparator.comparing(Person::getName).reversed());
        personSet.addAll(personList);
        personSet.forEach(System.out::println);


        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int wynikPorownaniaImion = o1.getName().compareTo(o2.getName());
                if (wynikPorownaniaImion == 0) {
                    // dokonujemy porównania wieku ponieważ porównanie imion nie było rozstrzygające
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
                return wynikPorownaniaImion;
            }
        });
    }
}
