class Point { //ćwiczenia
    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = 2 * p.x;
        this.y = 2 * p.y;
    }
}

class Maniek {
    public static void main(String[] args) {
        Point p1 = new Point();
        int x1 = 3;
        int x2 = 4;
        Point p2 = new Point(3,4);
        Point p3 = new Point(p2);

    }
}