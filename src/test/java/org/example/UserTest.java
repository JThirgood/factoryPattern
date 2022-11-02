package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserTest {

    @Test
    @DisplayName("User Filter Test")
    void HumanInstructorReturnsUpperCase() {
        // arrange
        var u1 = new User(1,"Craig","red");
        var u2 = new User(2,"Simon","blue");
        var u3 = new User(3,"John","blue");

        var unfilteredUsers = List.of(u1,u2,u3);
        var expectedAnswer = List.of(u2,u3);

        // act
        var filteredUsers = UserProcessor.filter(unfilteredUsers, "blue");

        System.out.println(expectedAnswer);

        // assert
        Assertions.assertEquals(expectedAnswer, filteredUsers);

    }

}