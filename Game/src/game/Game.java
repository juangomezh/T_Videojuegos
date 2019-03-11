/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author jgome
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame{
    public static String gamename="playgame";
    public int menu=0, play=1;
    public Game(String gamename) {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }
    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        this.getState(menu).init(container, this);
        this.getState(play).init(container, this);
        this.enterState(menu);
    }
    public static void main(String Args[])
    {
        AppGameContainer appgc;
        try
        {
            appgc=new AppGameContainer(new Game(gamename));
            appgc.setDisplayMode(640, 360, false);
            appgc.start();
        }
        catch(SlickException e)
        {
           e.printStackTrace();
        }
    }
    
}
