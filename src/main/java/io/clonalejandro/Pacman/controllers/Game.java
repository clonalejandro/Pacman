package io.clonalejandro.Pacman.controllers;

import io.clonalejandro.Pacman.utils.Player;
import io.clonalejandro.Pacman.utils.WindowAPI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by alejandrorioscalera
 * On 5/2/18
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©Pacman 2017 / 2018
 */

public class Game extends Window implements Runnable {


    /** SMALL CONSTRUCTORS **/

    private Thread thread;
    private Player player;
    private volatile static State STATE = State.MENUS;

    public Game(){
        super("Pacman", 500, 500);
    }


    /** REST **/

    public void start(){
        setState(State.RUNNING);
        thread = new Thread(this, "Drawer");
        thread.start();
    }


    public void end(){
        try {
            if (thread != null && getState() != null){
                setState(State.END);
                thread.join();
            }
        }
        catch (Exception ex) { ex.printStackTrace(); }
    }


    public void run() {
        final WindowAPI windowAPI = getWindow();
        final String title = windowAPI.getTitle();

        new Loop(this) {
            void onFpsUpdate() {
                windowAPI.setTitle(title + " | FPS: " + Loop.getFps());
            }

            void updateTick(){
                tick();
            }

            void updateRender(){
                render();
            }
        };

    }


    /**
     * This function set state of this game
     * @param state
     */
    public static synchronized void setState(State state){
        STATE = state;
    }


    /**
     * This function return a state of this game
     * @return
     */
    public static synchronized State getState() {
        return STATE;
    }


    /** OTHERS **/

    void openWindow(){
        player = new Player(200, 200, this);
    }


    void tick(){
        player.tick();
    }


    void render(){
        if (getBufferStrategy() == null) createBufferStrategy(3);

        final Graphics graphics = getBufferStrategy().getDrawGraphics();

        drawBack(graphics);
        player.render(graphics);

        //graphics.dispose();
        getBufferStrategy().show();
    }


    int closeWindow(){
        end();
        return WindowConstants.EXIT_ON_CLOSE;
    }


}
