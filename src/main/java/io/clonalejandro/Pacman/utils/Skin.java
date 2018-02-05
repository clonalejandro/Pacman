package io.clonalejandro.Pacman.utils;

import io.clonalejandro.Pacman.entities.Entity;

import java.awt.image.BufferedImage;
import java.io.IOException;

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

public class Skin {


    /** SMALL CONSTRUCTORS **/

    private final int col, row;

    public Skin(final int col, final int row){
        this.col = col;
        this.row = row;
    }


    public Skin(final Entity entity){
        this.col = entity.getCol();
        this.row = entity.getRow();
    }


    /** REST **/

    /**
     * This function return a image
     * @return
     */
    public BufferedImage getImage(){
        final BufferedImage image = new Parser("sprite.png").getAsImage();
        final int size = 48, width = 48, height = 48;

        return image.getSubimage((col * size) - size,
                                 (row * size) - size,
                                    width, height);
    }


}
