package io.clonalejandro.Pacman.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.URL;

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

public class Parser {


    /** SMALL CONSTRUCTORS **/

    private final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private final String path;

    public Parser(String path){
        this.path = path;
    }


    /** REST **/

    /**
     * This function return a InputStream from instance
     * @return
     */
    public InputStream getStream(){
        return loader.getResourceAsStream(path);
    }


    /**
     * This function return a complete path
     * @return
     */
    public URL getPath(){
        return loader.getResource(path);
    }


    /**
     * This function return a StreamReader from instance
     * @return
     */
    public InputStreamReader getStreamReader(){
        return new InputStreamReader(getStream());
    }


    /**
     * This function return a JsonElement for parse
     * @return
     */
    public JsonElement getResponse(){
        return new JsonParser().parse(getStreamReader());
    }


    /**
     * This function return a Int array from jsonElement
     * @param element
     * @param response
     * @return
     */
    public int[] getIntArray(String element, JsonElement response){
        return new Gson().fromJson(response.getAsJsonObject().get(element), int[].class);
    }


    /**
     * This function return the element as Buffered Image
     * @return
     */
    public BufferedImage getAsImage(){
        BufferedImage res = null;

        try { res = ImageIO.read(getPath()); }
        catch (IOException ex) { ex.printStackTrace(); }

        return  res;
    }


}
