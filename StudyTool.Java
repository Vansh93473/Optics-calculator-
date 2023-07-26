// By Vansh Ghandi
import java.util.Scanner;

public class OpticsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu and get user choice
            printMenu();
            int choice = scanner.nextInt();

            // Execute the corresponding method based on the user's choice
            switch (choice) {
                case 1:
                    mirrorEquation();
                    break;
                case 2:
                    lensEquation();
                    break;
                case 3:
                    snellsLaw();
                    break;
                case 4:
                    criticalAngle();
                    break;
                case 5:
                    lensmakersFormula();
                    break;
                case 6:
                    lensPower();
                    break;
                case 7:
                    thinLensMagnification();
                    break;
                case 8:
                    // Exit the program
                    System.out.println("Exiting the Optics Calculator. Goodbye!");
                    return;
                default:
                    // Invalid choice; prompt the user to try again
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display the main menu
    private static void printMenu() {
        System.out.println("\n--- Optics Calculator by Vansh ---");
        System.out.println("1. Mirror Equation");
        System.out.println("2. Lens Equation");
        System.out.println("3. Snell's Law");
        System.out.println("4. Critical Angle");
        System.out.println("5. Lensmaker's Formula");
        System.out.println("6. Lens Power");
        System.out.println("7. Thin Lens Magnification");
        System.out.println("8. Exit");
        System.out.print("Enter your choice (1-8): ");
    }

    // Method to calculate the mirror equation
    private static void mirrorEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mirror Equation: 1/f = 1/do + 1/di");
        System.out.print("Enter the object distance (do): ");
        double objectDistance = scanner.nextDouble();

        System.out.print("Enter the image distance (di): ");
        double imageDistance = scanner.nextDouble();

        double focalLength = 1 / ((1 / objectDistance) + (1 / imageDistance));
        System.out.println("Focal Length (f) = " + focalLength);
    }

    // Method to calculate the lens equation
    private static void lensEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lens Equation: 1/f = 1/do + 1/di");
        System.out.print("Enter the object distance (do): ");
        double objectDistance = scanner.nextDouble();

        System.out.print("Enter the image distance (di): ");
        double imageDistance = scanner.nextDouble();

        double focalLength = 1 / ((1 / objectDistance) + (1 / imageDistance));
        System.out.println("Focal Length (f) = " + focalLength);
    }

    // Method to calculate Snell's Law
    private static void snellsLaw() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Snell's Law: n₁sinθ₁ = n₂sinθ₂");
        System.out.print("Enter the refractive index of the first medium (n₁): ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the angle of incidence (θ₁ in degrees): ");
        double angleOfIncidence = Math.toRadians(scanner.nextDouble());

        System.out.print("Enter the refractive index of the second medium (n₂): ");
        double n2 = scanner.nextDouble();

        double angleOfRefraction = Math.asin((n1 / n2) * Math.sin(angleOfIncidence));
        System.out.println("Angle of Refraction (θ₂) = " + Math.toDegrees(angleOfRefraction));
    }

    // Method to calculate the critical angle
    private static void criticalAngle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Critical Angle: θ_c = sin⁻¹(n₂ / n₁)");
        System.out.print("Enter the refractive index of the first medium (n₁): ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the refractive index of the second medium (n₂): ");
        double n2 = scanner.nextDouble();

        double criticalAngle = Math.asin(n2 / n1);
        System.out.println("Critical Angle (θ_c) = " + Math.toDegrees(criticalAngle));
    }

    // Method to calculate the lensmaker's formula
    private static void lensmakersFormula() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lensmaker's Formula: 1/f = (n - 1) * (1 / R₁ - 1 / R₂)");
        System.out.print("Enter the refractive index of the lens material (n): ");
        double refractiveIndex = scanner.nextDouble();

        System.out.print("Enter the radius of curvature of the first lens surface (R₁): ");
        double radius1 = scanner.nextDouble();

        System.out.print("Enter the radius of curvature of the second lens surface (R₂): ");
        double radius2 = scanner.nextDouble();

        double focalLength = (refractiveIndex - 1) * (1 / radius1 - 1 / radius2);
        System.out.println("Focal Length (f) = " + focalLength);
    }

    // Method to calculate the lens power
    private static void lensPower() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lens Power: Power (P) = 1 / f");
        System.out.print("Enter the focal length of the lens (f): ");
        double focalLength = scanner.nextDouble();

        double power = 1 / focalLength;
        System.out.println("Lens Power (P) = " + power);
    }

    // Method to calculate thin lens magnification
    private static void thinLensMagnification() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thin Lens Magnification: Magnification (m) = -di / do");
        System.out.print("Enter the object distance (do): ");
        double objectDistance = scanner.nextDouble();

        System.out.print("Enter the image distance (di): ");
        double imageDistance = scanner.nextDouble();

        double magnification = -imageDistance / objectDistance;
        System.out.println("Magnification (m) = " + magnification);
    }
}
