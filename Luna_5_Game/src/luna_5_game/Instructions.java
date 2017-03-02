package El_Chapo;

import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class Instructions extends BasicGameState {

    private StateBasedGame game;
    public Image startimage;

    public Instructions(int xSize, int ySize) {
    }

    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
        startimage = new Image("res/Instructions.png");
        this.game = game;
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
        startimage.draw();
    }

    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {
    }

    public int getID() {
        return 4;
    }

    public void keyReleased(int key, char c) {
        switch (key) {
            case Input.KEY_1:
//                El_Chapo_Lvl1.player.health = 100;
//                El_Chapo_Lvl1.player.speed = .4f;
//                El_Chapo_Lvl1.player.ammo = 6;
//                //El_Chapo_Lvl1.counter = 0;
//                El_Chapo_Lvl1.player.x = 96f;
//                El_Chapo_Lvl1.player.y = 228f;
                game.enterState(1, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
                break;
            case Input.KEY_2:
                break;
            case Input.KEY_3:
                break;
            default:
                break;
        }
    }
}