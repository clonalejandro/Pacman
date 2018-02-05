package io.clonalejandro.Pacman.controllers;

import io.clonalejandro.Pacman.utils.Skin;
import io.clonalejandro.Pacman.utils.WindowAPI;

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

public abstract class Window extends Canvas {


    /** SMALL CONSTRUCTORS **/

    private final String name;
    private final int width, height;
    private static WindowAPI window;

    Window(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;

        this.setPreferredSize(new Dimension(width, height));
        createWindow();
    }


    /** REST **/

    /**
     * This function return a windowAPI
     * @return
     */
    public static WindowAPI getWindow(){
        return window;
    }


    void drawBack(Graphics graphics){
        graphics.drawImage(getBack(), 0, 0, this);
    }


    abstract void openWindow();
    abstract int closeWindow();


    /** OTHERS **/

    /**
     * This function create a Game frame or Window
     */
    private void createWindow(){
        window = new WindowAPI(name, width, height, this) {
            public int onClose() { return closeWindow(); }
        };

        drawBack(this.getGraphics());
        openWindow();
    }


    private BufferedImage getBack(){
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }
}
