/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrestaurant;

import java.util.ArrayList;

/**
 *
 * @author jacqu
 */
public class Menu
{
    private int idMenu;
    private String nomMenu;
    private ArrayList<Plat> lesPlats;

    public Menu(int unId, String unNom)
    {
        idMenu = unId;
        nomMenu = unNom;
        lesPlats = new ArrayList<>();
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getNomMenu() {
        return nomMenu;
    }

    public ArrayList<Plat> getLesPlats() {
        return lesPlats;
    }
    
    public void AjouterPlat(Plat nouveauPlat)
    {
        lesPlats.add(nouveauPlat);
    }
    
    // Cette méthode permet de calculer la note d'un menu
    // En cumulant chaque note de tous les plats du menu
    public int CalculerNote()
    {
        int note = 0;
        
        // A vous de jouer
        
        return note;
    }

}
