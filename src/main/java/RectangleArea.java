class RectangleArea {
    private int[] coords = new int[4];
    // int startX, int startY, int endX, int endY
    public RectangleArea(int[] coords) {
        this.coords[0] = coords[0]; //startX
        this.coords[1] = coords[1]; //startY
        this.coords[2] = coords[2]; //endX
        this.coords[3] = coords[3]; //endY
    }

    public int getArea() {
        int firstSide = (int) Math.round(Math.sqrt(Math.pow(coords[2] - coords[0], 2)));
        int secondSide = (int) Math.round(Math.sqrt(Math.pow(coords[3] - coords[1], 2)));
        int square = firstSide * secondSide;
        return square;
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}