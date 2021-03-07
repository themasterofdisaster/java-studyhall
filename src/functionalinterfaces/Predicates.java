package functionalinterfaces;

/*
    Predicate

        In mathematics, a predicate is commonly understood to be a boolean-valued function 'P: X? {true, false}',
        called the predicate on X. Informally, a strong.

        A predicate can be thought of as an operator or function that returns a value that is either true or false.
        It is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

        You can use predicates anywhere where you need to evaluate a condition on group/collection of similar objects
        such that evaluation can result either in true or false.

    Source: https://howtodoinjava.com/java8/how-to-use-predicate-in-java-8/
 */

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }

    public static List<Employee> filterEmployees (List<Employee> employees,
                                                  Predicate<Employee> predicate)
    {
        return employees.stream()
                .filter( predicate )
                .collect(Collectors.<Employee>toList());
    }
}