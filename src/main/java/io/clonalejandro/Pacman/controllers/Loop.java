package io.clonalejandro.Pacman.controllers;

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

public abstract class Loop {


    /** SMALL CONSTRUCTORS **/

    private final Game instance;

    private static int UPDATES  = 0;
    private static int FPS = 0;

    public Loop(Game game){
        instance = game;
        start();
    }


    /** REST **/

    abstract void onFpsUpdate();
    abstract void updateTick();
    abstract void updateRender();

    /**
     * This function return a current updates in this game
     * @return
     */
    public static int getUpdates(){
        return UPDATES;
    }


    /**
     * This function return a current fps in this game
     * @return
     */
    public static int getFps(){
        return FPS;
    }


    /** OTHERS **/

    private void start(){
        final int nanoSeconds = 1000000000;
        final byte updatesPerSecond = 60;
        final double nanoUpdate = nanoSeconds / updatesPerSecond;

        long referenceUpdate = System.nanoTime();
        long referenceCounter = System.nanoTime();

        double timeLapsed;
        double delta = 0;

        while (Game.getState() != State.END){
            final long date = System.nanoTime();

            timeLapsed = date - referenceUpdate;
            referenceUpdate = date;

            delta += timeLapsed / nanoUpdate;

            if (delta >= 1){
                updateTick();
                delta--;
                UPDATES++;
            }

            updateRender();
            FPS++;

            if (System.nanoTime() - referenceCounter > nanoSeconds) {
                onFpsUpdate();

                /* RESET TIMES */
                UPDATES = 0;
                FPS = 0;
                referenceCounter = System.nanoTime();
            }
        }
    }


}
