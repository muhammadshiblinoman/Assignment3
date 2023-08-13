package E5_11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        int angle = scan.nextInt();

        scan.close();

        angle = ((angle % 360) + 360) % 360;

        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int[] angles = {0, 45, 90, 135, 180, 225, 270, 315};

        int minDifference = Integer.MAX_VALUE;
        int closestDirectionIndex = 0;

        for (int i = 0; i < angles.length; i++) {
            int difference = Math.abs(angle - angles[i]);
            if (difference < minDifference) {
                minDifference = difference;
                closestDirectionIndex = i;
            }
        }

        System.out.println("Nearest compass direction: " + directions[closestDirectionIndex]);
    }
}
