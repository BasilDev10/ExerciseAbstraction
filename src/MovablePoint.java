public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Moving up");
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Moving down");
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving left");
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Moving right");
        x += xSpeed;
    }
    public String toString() {
        return "x: " + x + "\ny: " + y;
    }
}
