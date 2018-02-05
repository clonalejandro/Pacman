package io.clonalejandro.Pacman.utils;

import io.clonalejandro.Pacman.controllers.Window;
import io.clonalejandro.Pacman.entities.Entity;

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

public class Player {


    /** SMALL CONSTRUCTORS **/

    private double x, y;

    private final Window window;
    private final int speed = 2;
    private final Skin playerSkin = new Skin(Entity.GHOST_BLUE_RIGHT_STAY);
    private final BufferedImage player = playerSkin.getImage();
    private boolean colission = false;

    public Player(double x, double y, Window window){
        this.x = x;
        this.y = y;
        this.window = window;
    }


    /** REST **/

    public void tick(){
        double max = window.getWidth() - 48;

        if (!colission && max != x) x += speed;

        else colission = true;

        if (colission && (x == max || x != 0)) x -= speed;
        else colission = false;

        System.out.println(x);
    }


    public void render(Graphics graphics){
        if (player != null)
            graphics.drawImage(player, (int)x, (int)y, null);
    }


}
