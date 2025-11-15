import java.util.InputMismatchException;
import java.util.Scanner;


public class StadiumSafetyApplication {
    public static void main(String[] args) {
        System.out.println("Stadium Safety Inspection Tool Started...");
        InspectionService service = new InspectionService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Add Inspection");
            System.out.println("2. Resolve Inspection");
            System.out.println("3. Display Inspections");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        System.out.print("Enter inspection description: ");
                        String description = scanner.nextLine();
                        service.addInspection(description);
                        break;
                    case 2:
                        System.out.print("Enter inspection ID to resolve: ");
                        int id = scanner.nextInt();
                        service.resolveInspection(id);
                        break;
                    case 3:
                        service.displayInspections();
                        break;
                    case 4:
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
