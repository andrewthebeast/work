package luna_5_game;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import static luna_5_game.MainGame.player;
import static luna_5_game.MainGame.antidote;

public class win extends BasicGameState {

    private StateBasedGame game;
    public Image win;

    public win(int xSize, int ySize) {
    }

    public void init(GameContainer container, StateBasedGame game)
            throws SlickException {
        this.game = game;
        win = new Image("res/Win.png");
    }

    public void render(GameContainer container, StateBasedGame game, Graphics g)
            throws SlickException {
        g.setColor(Color.white);
        win.draw();
    }

    public void update(GameContainer container, StateBasedGame game, int delta)
            throws SlickException {

    }

    public int getID() {
        return 3;
    }

    public void keyReleased(int key, char c) {
        switch (key) {
            case Input.KEY_1:
                player.health = 100;
                player.speed = .4f;
                player.ammo = 6;
                player.x = 96f;
                player.y = 228f;
                antidote.isvisible = true;
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
