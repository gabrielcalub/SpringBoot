public class SheepFarm {
    public static void main(String[] args) {
        // Create prototype sheep
        Sheep blackPrototype = new BlackSheep("pau");
        Sheep whitePrototype = new WhiteSheep("gabe");

        // Your first sheep pair is thriving!
        System.out.println("Black sheep: " + blackPrototype.getName());
        System.out.println("White sheep: " + whitePrototype.getName());

        // Number of sheep to create
        int numberOfSheep = 10;

        // Measure time for traditional initialization (for comparison)
        long startTimeTraditional = System.nanoTime();
        for (int i = 0; i < numberOfSheep; i++) {
            Sheep newBlackSheep = new BlackSheep("Jane");
            System.out.println("here");
            newBlackSheep.setName("Black Sheep " + i);
            System.out.println("Black sheep: " + newBlackSheep.getName());
        }
        long endTimeTraditional = System.nanoTime();
        long durationTraditional = endTimeTraditional - startTimeTraditional;

        // Measure time for prototype cloning
        long startTimeCloning = System.nanoTime();
        for (int i = 0; i < numberOfSheep; i++) {
            Sheep clonedBlackSheep = blackPrototype.clone();
            clonedBlackSheep.setName("Cloned Black Sheep " + i);
            System.out.println("Cloned black sheep: " + clonedBlackSheep.getName());
        }
        long endTimeCloning = System.nanoTime();
        long durationCloning = endTimeCloning - startTimeCloning;

        // Output the results
        System.out.println("Time for traditional initialization: " + durationTraditional + " nanoseconds");
        System.out.println("Time for prototype cloning: " + durationCloning + " nanoseconds");
    }
}
