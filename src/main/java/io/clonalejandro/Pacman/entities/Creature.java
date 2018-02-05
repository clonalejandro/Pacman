package io.clonalejandro.Pacman.entities;

/**
 * Created by alejandrorioscalera
 * On 6/2/18
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

public interface Creature {


    /** INTERFACE **/

    Entity type = null;

    public Entity getType();
    public int[] getLocation();
    public void updateSkin();

    void onDeath();
    void spawn();
}
