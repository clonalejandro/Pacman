package io.clonalejandro.Pacman;

import io.clonalejandro.Pacman.controllers.Game;
import io.clonalejandro.Pacman.controllers.Window;
import io.clonalejandro.Pacman.utils.Parser;

import java.util.Arrays;

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

public class Main {


    public static void main(String args[]){
        /*final Parser parser = new Parser("map.json");
        final int[] arr = parser.getIntArray(
                "level", parser.getResponse()
        );


        System.out.println(Arrays.toString(arr));
        */

        new Game().start();
    }
}
