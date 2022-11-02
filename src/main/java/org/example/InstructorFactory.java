package org.example;

public class InstructorFactory{
    public static Instructor returnInstructor(String typeOfInstructor){
        if (typeOfInstructor == null || typeOfInstructor.isEmpty())
            return null;
        switch (typeOfInstructor) {
            case "human":
                return new HumanInstructor();
            default:
                throw new IllegalArgumentException("Unknown type of instructor "+typeOfInstructor);
        }

    }
}
