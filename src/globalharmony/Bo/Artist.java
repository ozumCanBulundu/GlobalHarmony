/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Artist {
    private String artName;
    private String artCountry;
    private String artAlbum;
    private String artSong;

    public Artist(String artName, String artCountry, String artAlbum, String artSong) {
        this.artName = artName;
        this.artCountry = artCountry;
        this.artAlbum = artAlbum;
        this.artSong = artSong;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getArtCountry() {
        return artCountry;
    }

    public void setArtCountry(String artCountry) {
        this.artCountry = artCountry;
    }

    public String getArtAlbum() {
        return artAlbum;
    }

    public void setArtAlbum(String artAlbum) {
        this.artAlbum = artAlbum;
    }

    public String getArtSong() {
        return artSong;
    }

    public void setArtSong(String artSong) {
        this.artSong = artSong;
    }
    
    
}
