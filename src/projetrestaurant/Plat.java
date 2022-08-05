/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetrestaurant;

/**
 *
 * @author jacqu
 */
public class Plat
{
    private int idPlat;
    private String nomPlat;
    private int notePlat;
    private String imagePlat;

    public Plat(int unId, String unNom, int uneNote,String uneImage)
    {
        idPlat = unId;
        nomPlat = unNom;
        notePlat = uneNote;
        imagePlat = uneImage;
    }
    
    public int getIdPlat() {
        return idPlat;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public int getNotePlat() {
        return notePlat;
    }

    public String getImagePlat() {
        return imagePlat;
    }

    // Cette méthode permet d'additionner la note passée en paramètre
    // à la note du plat. Il s'agit de faire un cumul.
    public void CalculerNotePlat(int uneNote) {
        
        // A vous de jouer
        
    }
}
