package comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star War", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Sort by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        System.out.println("Sort by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        System.out.println("Sort by year");
        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }
    }
}
