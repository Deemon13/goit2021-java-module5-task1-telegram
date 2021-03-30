class LevelLoaderOld {
    static private LevelLoaderOld instance = new LevelLoaderOld();

    private LevelLoaderOld() {
    }

    static public LevelLoaderOld getInstance() {
        return LevelLoaderOld.instance;
    }

    String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderOldTest {
    public static void main(String[] args) {
        //LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        //System.out.println(levelLoader.load("StartLevel"));

        //Loading level Startlevel ...
        System.out.println(LevelLoaderOld.getInstance().load("StartLevel"));
    }
}
