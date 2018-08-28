/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.accov.pkg2018;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author MireilleKhalifeh
 */
public enum CouleurCameneon {
    Blanc,
    Noir,
    Rose;

    private static final Random random = new Random();
    private static final List<CouleurCameneon> listeCameneon =
            Collections.unmodifiableList(Arrays.asList(values()));

    public static CouleurCameneon randomColor()  {
        return listeCameneon.get(random.nextInt(listeCameneon.size()));
    }

    public static CouleurCameneon getColor(String color) {
        if(color.equals(Blanc.name()))
            return Blanc;
        if(color.equals(Noir.name()))
            return Noir;
        return Rose;
    }
}