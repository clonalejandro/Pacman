package io.clonalejandro.Pacman.utils;

import javax.swing.*;
import java.awt.*;

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

public abstract class WindowAPI extends JFrame {


    /** SMALL CONSTRUCTORS **/

    protected WindowAPI(String name, int width, int height, Component target){
        this.setSize(width, height);
        this.setTitle(name);

        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.add(target, BorderLayout.CENTER);

        this.pack();
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(onClose());
        this.setVisible(true);
    }


    /** REST **/

    /**
     * Abstract function
     * @return
     */
    public abstract int onClose();


    /**
     * This function remove this frame
     * @deprecated
     */
    @Deprecated
    public void remove(){
        this.hide();
        this.removeAll();
    }


    /**
     * This function unhide this frame
     * @deprecated
     */
    @Deprecated
    public void unhideFrame(){
        this.show();
    }


    /**
     * This function remove a component
     * @param component
     */
    public void removeComponent(Component component){
        this.remove(component);
    }


}
