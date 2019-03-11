/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
/**
 *
 * @author jgome
 */
public class Play extends BasicGameState{
    public Play(int state){    
    }
    public void init(GameContainer gc, StateBasedGame sgb)throws SlickException
    {
        
    }
    public void render(GameContainer gc, StateBasedGame sgb, Graphics g)throws SlickException
    {
        g.clear();
        g.drawString("Bienvenido", 50, 50);
    }
    public void update(GameContainer gc, StateBasedGame sgb, int delta)throws SlickException
    {
    }
    @Override
    public int getID() {
        return 1; //To change body of generated methods, choose Tools | Templates.
    }
}
