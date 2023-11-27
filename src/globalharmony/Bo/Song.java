/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

import java.util.Vector;

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
    private int sPopularity;

    public Song(String sName, String sLang, int sYear, String sGenre, String sAlbum, int sPopularity) {
        this.sName = sName;
        this.sLang = sLang;
        this.sYear = sYear;
        this.sGenre = sGenre;
        this.sAlbum = sAlbum;
        this.sPopularity = sPopularity;
    }
    
    public Vector getRow(){
        Vector vec = new Vector();
        vec.add(this.sName);
        vec.add(this.sLang);
        vec.add(this.sYear);
        vec.add(this.sGenre);
        vec.add(this.sAlbum);
        vec.add(this.sPopularity);
        return vec;
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

    public int getsPopularity() {
        return sPopularity;
    }

    public void setsPopularity(int sPopularity) {
        this.sPopularity = sPopularity;
    }
    
    
}
