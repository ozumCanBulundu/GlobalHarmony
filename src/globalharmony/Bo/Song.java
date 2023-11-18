/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Song {
    private String sName;
    private String sLang;
    private int sYear;
    private String sGenre;
    private String sAlbum;
    private String sPopularity;

    public Song(String sName, String sLang, int sYear, String sGenre, String sAlbum, String sPopularity) {
        this.sName = sName;
        this.sLang = sLang;
        this.sYear = sYear;
        this.sGenre = sGenre;
        this.sAlbum = sAlbum;
        this.sPopularity = sPopularity;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsLang() {
        return sLang;
    }

    public void setsLang(String sLang) {
        this.sLang = sLang;
    }

    public int getsYear() {
        return sYear;
    }

    public void setsYear(int sYear) {
        this.sYear = sYear;
    }

    public String getsGenre() {
        return sGenre;
    }

    public void setsGenre(String sGenre) {
        this.sGenre = sGenre;
    }

    public String getsAlbum() {
        return sAlbum;
    }

    public void setsAlbum(String sAlbum) {
        this.sAlbum = sAlbum;
    }

    public String getsPopularity() {
        return sPopularity;
    }

    public void setsPopularity(String sPopularity) {
        this.sPopularity = sPopularity;
    }
    
    
}
