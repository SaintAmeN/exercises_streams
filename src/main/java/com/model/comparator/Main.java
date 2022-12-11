package com.model.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Paweł Recław, AmeN
 * @project exercises_streams
 * @created 11.12.2022
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>(
                List.of(1, 5, 67, 12, 7, 2, 463457, 346, 2, 21, 2, 5, 67, 7, 785, 2, 12, 6, 45, 2, 2, 3, 5, 6, 7, 7, 7, 77)
        );

        liczby.sort(new Comparator<Integer>() {
            // -1 jeśli liczba1 jest mniejsza od liczba2
            //  0 jeśli równe
            //  1 jeśli liczba1 jest wieksza od liczby2
            @Override
            public int compare(Integer liczba1, Integer liczba2) {
                // if liczba1 == liczba2 to liczba2 == liczba1

//                if (liczba1 < liczba2) {
//                    return -1;
//                }
//                if (liczba1 > liczba2) {
//                    return 1;
//                }
//                return 0;
//                return (liczba1 < liczba2 ? -1 : (liczba1 == liczba2 ? 0 : -1));
                return Integer.compare(liczba1, liczba2);
            }
        });

        liczby.sort((liczba1, liczba2) -> Integer.compare(liczba1, liczba2));

        liczby.sort(Integer::compare);
    }
}
