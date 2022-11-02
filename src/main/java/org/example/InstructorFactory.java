package org.example;

public class InstructorFactory{
    public  Instructor returnInstructor(String typeOfInstructor){
        if (typeOfInstructor == null || typeOfInstructor.isEmpty())
            return null;
        switch (typeOfInstructor)
            return new HumanInstructor();
        }

    }
}
