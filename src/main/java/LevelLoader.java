class LevelLoader {
    String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}