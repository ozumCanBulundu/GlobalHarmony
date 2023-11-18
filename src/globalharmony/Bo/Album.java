/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Album {
    private String aName;
    private int aYear;
    private String aGenre;
    private String artistName;

    public Album(String aName, int aYear, String aGenre, String artistName) {
        this.aName = aName;
        this.aYear = aYear;
        this.aGenre = aGenre;
        this.artistName = artistName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaYear() {
        return aYear;
    }

    public void setaYear(int aYear) {
        this.aYear = aYear;
    }

    public String getaGenre() {
        return aGenre;
    }

    public void setaGenre(String aGenre) {
        this.aGenre = aGenre;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    
    
}
