class LevelOld {
    private LevelInfo levelInfo;
    private Point[] points;

    public LevelOld(LevelInfo levelInfo, Point[] points) {
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
        LevelOld.Point p1 = new LevelOld.Point(3, 5);
        LevelOld.Point p2 = new LevelOld.Point(10, 100);
        LevelOld.Point p3 = new LevelOld.Point(50, 40);

        LevelOld.Point[] points = {p1, p2, p3};

        LevelOld.LevelInfo info = new LevelOld.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Test
        //System.out.println(new Level("Test"));

        //Quarke level, name is Test, point count is 3
        //System.out.println(new Level("Test", points));

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new LevelOld(info, points));

        //3015
        System.out.println(new LevelOld(info, points).calculateLevelHash());
    }
}