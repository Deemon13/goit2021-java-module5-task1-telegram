class Level {
    private String name;

    public Level(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + this.name;
    }
}

class LevelTest {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level("Test"));
    }
}