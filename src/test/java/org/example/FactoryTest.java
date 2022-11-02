package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class FactoryTest {

    @Test
    @DisplayName("a human instructor should return uppercase version of question")
    void humanConstructorShouldReturnUppercaseVersionOfQuestion() {
        //arrange
        HumanInstructor humanInstructor = new HumanInstructor();
        String question = "java";
        String expectedAnswer = "JAVA";

        // act
        String actualAnswer = humanInstructor.askQuestion(question);
//        if (!expectedAnswer.equals(actualAnswer))
//            fail();
        //assertion
        Assertions.assertEquals(expectedAnswer,actualAnswer);

    }

    @Test
    @DisplayName("a human instructor implements instructor interface")
    void humanConstructorShouldReturnAnInstructorInterface() {
        //arrange
        HumanInstructor humanInstructor = new HumanInstructor();
        String question = "java";
        String expectedAnswer = "JAVA";

        // act
        Instructor instructor = humanInstructor;
        String actualAnswer = instructor.askQuestion(question);
        // no assert

    }

    @Test
    @DisplayName("instructor factory returns a human constructor")
    void instructorFactoryShouldReturnHumanConstructor() {
        //arrange
        InstructorFactory instructorFactory = new InstructorFactory();
        String question = "java";
        String expectedAnswer = "JAVA";
        String typeOfInstructor = "human";

        // act
        Instructor instructor1 = instructorFactory.returnInstructor(typeOfInstructor);
        String actualAnswer = instructor1.askQuestion(question);

        // assertions
        Assertions.assertInstanceOf(HumanInstructor.class, instructor1);

    }






}