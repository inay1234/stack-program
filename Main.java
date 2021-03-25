/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER BARU
 */
import java.io.*;//tempat impor
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main( String[] arg)
    {
        Menu menu = new Menu();

        menu.loadPlaylist(); 
        menu.runMenu();

    }

}
