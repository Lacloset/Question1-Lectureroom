/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emman
 */
    public class LectureRooms {
    private int students;
    private boolean[] lights; // Index 0: Light 1, Index 1: Light 2, Index 2: Light 3

    public LectureRooms() {
        this.students = 0;
        this.lights = new boolean[3]; // All lights are initially off
    }

    public void addStudents(int number) {
        if (number > 0) {
            students += number;
            System.out.println("Added " + number + " students. Total students now: " + students);
        } else {
            System.out.println("Invalid number of students to add.");
        }
    }

    public void removeStudents(int number) {
        if (number > 0) {
            students = Math.max(0, students - number);
            System.out.println("Removed " + number + " students. Total students now: " + students);
        } else {
            System.out.println("Invalid number of students to remove.");
        }
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " is now ON.");
        } else {
            System.out.println("Invalid light number " + lightNumber + ". Valid numbers are 1, 2, or 3.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " is now OFF.");
        } else {
            System.out.println("Invalid light number " + lightNumber + ". Valid numbers are 1, 2, or 3.");
        }
    }

    public void displayStatus() {
        StringBuilder status = new StringBuilder();
        status.append("Current number of students: ").append(students).append("\n");
        status.append("Lights status: ");
        for (int i = 0; i < lights.length; i++) {
            status.append("Light ").append(i + 1).append(": ").append(lights[i] ? "ON" : "OFF");
            if (i < lights.length - 1) status.append(", ");
        }
        System.out.println(status.toString());
    }
}

    
}
