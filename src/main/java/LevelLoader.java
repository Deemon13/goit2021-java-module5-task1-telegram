class LevelLoader {
    static private LevelLoader instance = new LevelLoader();

    static public LevelLoader getInstance() {
        return LevelLoader.instance;
    }

    String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));

        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
