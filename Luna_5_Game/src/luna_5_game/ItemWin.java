package luna_5_game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class ItemWin {
   
    public int x;
    public int y;
    public boolean isvisible = true;
    Image currentImage;
    Shape hitbox;
    Image antidote = new Image("res/tunnle.jpeg");

    ItemWin(int a, int b) throws SlickException {
        this.x = a;
        this.y = b;
        this.hitbox = new Rectangle(a, b, 88, 62);// 64 is the width of the item
        this.currentImage = antidote;
    }
}