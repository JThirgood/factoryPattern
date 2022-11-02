package org.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserProcessor {

    public static List<User> filter (List<User> users, String filterColour) {

        Predicate<User> byColour = user -> user.getFavColour() == filterColour;

        var result = users.stream().filter(byColour)
                .collect(Collectors.toList());

        return result;
    }
}
