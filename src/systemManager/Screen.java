package systemManager;

import java.awt.*;

public abstract class Screen {

    public static int getWidth() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screen.getWidth();
        return (int) width;
    }

    //public static int getWidth()
    public static int getHeight() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        double height = screen.getHeight();
        return (int) height;
    }

    public static Point getStartPos(int width, int height) {
        int halfWidth = width / 2;
        int halfHeight = height / 2;
        int halfScreenWidth = getWidth() / 2;
        int halfScreenHeight = getHeight() / 2;

        int posX = halfScreenWidth - halfWidth;
        int posY = halfScreenHeight - halfHeight;
        return new Point(posX, posY);
    }
}
