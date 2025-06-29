package Staff;
import java.util.*;
public class Chef implements Staff{
    private String name;
    private int age;
    private String specialty;
    private Timing timing;

    public Chef() {
        this.timing = new Timing();
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Chef's Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Chef's Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Chef's Specialty: ");
        this.specialty = sc.nextLine();
        timing.inputTiming();
        sc.close();
    }

    public void showDetails() {
        System.out.println("Chef Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
        timing.showTiming();
    }

    public String toFileFormat() {
        return "Chef," + name + "," + age + "," + specialty + "," + timing.toFileFormat();
    }

    public void fromFileFormat(String line) {
        String[] parts = line.split(",");
        this.name = parts[1];
        this.age = Integer.parseInt(parts[2]);
        this.specialty = parts[3];
        this.timing.fromFileFormat(parts[4] + "," + parts[5]);
    }
}
