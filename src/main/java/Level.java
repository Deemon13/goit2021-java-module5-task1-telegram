class Level {
    private LevelInfo levelInfo;
    private Point[] points;

    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

    public int calculateLevelHash() {
        int sumHash = 0;
        for (int i = 0; i < points.length; i++) {
            int mPoint = points[i].getX() * points[i].getY();
            sumHash += mPoint;
        }return sumHash;
    }

    @Override
    public String toString() {
        // Quarke level, name is <LEVEL_NAME>, difficulty is <DIFFICULTY>, point count is <POINT_COUNT>
        return "Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length;
    }
}

class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Test
        //System.out.println(new Level("Test"));

        //Quarke level, name is Test, point count is 3
        //System.out.println(new Level("Test", points));

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level(info, points));

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}