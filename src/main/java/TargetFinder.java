import java.util.Arrays;

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        double minDistance = Double.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < targets.length; i++) {
            double distance = getDistance(aiCoords[0], aiCoords[1], targets[i][0], targets[i][1]);

            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }
        return new int[]{targets[index][0],targets[index][1]};
    }

    public double getDistance(int startX, int startY, int endX, int endY) {
        return Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}