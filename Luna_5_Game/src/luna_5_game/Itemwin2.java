
package El_Chapo;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class Itemwin2 {
   
    public int x;
    public int y;
    public boolean isvisible = true;
    Image currentImage;
    Shape hitbox;
    Image chappy = new Image("res/Chapo.png");

    Itemwin2(int a, int b) throws SlickException {
        this.x = a;
        this.y = b;
        this.hitbox = new Rectangle(a, b, 64, 64);// 64 is the width of the item
        this.currentImage = chappy;
    }

}
