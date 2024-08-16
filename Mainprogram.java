/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emman
 */
public class Mainprogram {
    public class Main {
    public static void main(String[] args) {
        LectureRooms room = new LectureRooms();
        EasyReaders reader = new EasyReaders();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("W - Add students");
            System.out.println("X - Remove students");
            System.out.println("Y - Turn on light");
            System.out.println("Z - Turn off light");
            System.out.println("S - Show status");
            System.out.println("Q - Quit");

            String choice = reader.readString("Enter your choice: ").trim().toUpperCase();

            switch (choice) {
                case 'W':
                    int addNumber = reader.readInt("Enter the number of students to add: ");
                    room.addStudents(addNumber);
                    break;
                case 'X':
                    int removeNumber = reader.readInt("Enter the number of students to remove: ");
                    room.removeStudents(removeNumber);
                    break;
                case 'Y':
                    int lightOn = reader.readInt("Enter the light number to turn on (1, 2, or 3): ");
                    room.turnOnLight(lightOn);
                    break;
                case 'Z':
                    int lightOff = reader.readInt("Enter the light number to turn off (1, 2, or 3): ");
                    room.turnOffLight(lightOff);
                    break;
                case 'S':
                    room.displayStatus();
                    break;
                case 'Q':
                    System.out.println("Quitting the program.");
                    return; // Exit the loop and terminate the program
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }
}

    
}
