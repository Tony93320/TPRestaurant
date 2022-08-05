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
public class Carte 
{
    private int idCarte;
    private String nomCarte;
    private ArrayList<Menu> lesMenus;

    public Carte(int unId,String unNom)
    {
        idCarte = unId;
        nomCarte = unNom;
        lesMenus = new ArrayList<>();
    }    

    public int getIdCarte() {
        return idCarte;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public ArrayList<Menu> getLesMenus() {
        return lesMenus;
    }
    
    public void AjouterMenu(Menu nouveauMenu)
    {
        lesMenus.add(nouveauMenu);
    }
    
    // Cette méthode permet de récupérer le plat le mieux noté
    // C'est à dire celui qui a la note la plus grande
    public Plat getBestNomPlat()
    {
        Plat bestPlat = null;
        
        // A vous de jouer
        
        
        return bestPlat;
    }
}
