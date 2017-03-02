package luna_5_game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {

    public static final String gamename = "Capture El Chapo!";
    public static final int play = 0;
    public static final int xSize = 1000;
    public static final int ySize = 750;
    public Main(String gamename) {
        super(gamename);
        this.addState(new Menu(xSize, ySize));
        this.addState(new MainGame(xSize, ySize));
        this.addState(new lose(xSize, ySize));
        this.addState(new win(xSize, ySize));
        this.addState(new Instructions(xSize, ySize));
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(play).init(gc, this);
        this.enterState(play);
    }

    public static void main(String[] args) {
        AppGameContainer appgc;
        try {
            // player = new Player();
            appgc = new AppGameContainer(new Main(gamename));
            appgc.setDisplayMode(xSize, ySize, false);
            int maxFPS = 60;
            appgc.setTargetFrameRate(maxFPS);
            appgc.setTargetFrameRate(60);
            appgc.start();

        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
