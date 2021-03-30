class TexturePool {
    static private TexturePool instance = new TexturePool();

    private TexturePool() {
    }

    static public TexturePool getInstance() {
        return TexturePool.instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}

class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}