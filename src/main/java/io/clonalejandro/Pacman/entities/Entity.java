package io.clonalejandro.Pacman.entities;

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

public enum Entity {


    /** ENUM **/

    GHOST_RED_RIGHT_WALK(1, 1),
    GHOST_RED_RIGHT_STAY(1, 2),
    GHOST_RED_DOWN_WALK(1, 3),
    GHOST_RED_DOWN_STAY(1, 4),
    GHOST_RED_LEFT_WALK(1, 5),
    GHOST_RED_LEFT_STAY(1, 6),
    GHOST_RED_UP_WALK(1, 7),
    GHOST_RED_UP_STAY(1, 9),

    GHOST_PINK_RIGHT_WALK(2, 1),
    GHOST_PINK_RIGHT_STAY(2, 2),
    GHOST_PINK_DOWN_WALK(2, 3),
    GHOST_PINK_DOWN_STAY(2, 4),
    GHOST_PINK_LEFT_WALK(2, 5),
    GHOST_PINK_LEFT_STAY(2, 6),
    GHOST_PINK_UP_STAY(2, 7),
    GHOST_PINK_UP_WALK(2, 8),

    GHOST_BLUE_RIGHT_WALK(3, 1),
    GHOST_BLUE_RIGHT_STAY(3, 2),
    GHOST_BLUE_DOWN_WALK(3, 3),
    GHOST_BLUE_DOWN_STAY(3, 4),
    GHOST_BLUE_LEFT_WALK(3, 5),
    GHOST_BLUE_LEFT_STAY(3, 6),
    GHOST_BLUE_UP_WALK(3, 7),
    GHOST_BLUE_UP_STAY(3, 8),

    GHOST_ORANGE_RIGHT_WALK(4, 1),
    GHOST_ORANGE_RIGHT_STAY(4, 2),
    GHOST_ORANGE_DOWN_WALK(4, 3),
    GHOST_ORANGE_DOWN_STAY(4, 4),
    GHOST_ORANGE_LEFT_WALK(4, 5),
    GHOST_ORANGE_LEFT_STAY(4, 6),
    GHOST_ORANGE_UP_WALK(4, 7),
    GHOST_ORANGE_UP_STAY(4, 8),;


    /** SMALL CONSTRUCTORS **/

    private final int col;
    private final int row;

    Entity(int col, int row){
        this.col = col;
        this.row = row;
    }


    /** REST **/

    /**
     * This function return a Column for entity
     * @return
     */
    public int getCol() {
        return col;
    }


    /**
     * This function return a Row for entity
     * @return
     */
    public int getRow() {
        return row;
    }


    /**
     * This function return a location for entity
     * @return
     */
    public int[] getLocation(){
        int[] res = new int[2];

        res[0] = col;
        res[1] = row;

        return res;
    }

}
