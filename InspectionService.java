import java.util.ArrayList;
import java.util.List;


class InspectionService {
    private List<Inspection> inspections = new ArrayList<>();

    public void addInspection(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Inspection description cannot be empty or null.");
        }
        int id = inspections.size() + 1;
        Inspection inspection = new Inspection(id, description);
        inspections.add(inspection);
        System.out.println("Added: " + inspection);
    }

    public void resolveInspection(int id) {
        for (Inspection inspection : inspections) {
            if (inspection.getId() == id) {
                inspection.resolve();
                System.out.println("Resolved: " + inspection);
                return;
            }
        }
        throw new IllegalArgumentException("Inspection ID " + id + " not found!");
    }

    public void displayInspections() {
        System.out.println("--- All Inspections ---");
        if (inspections.isEmpty()) {
            System.out.println("No inspections recorded yet.");
        } else {
            for (Inspection inspection : inspections) {
                System.out.println(inspection);
            }
        }
    }
}