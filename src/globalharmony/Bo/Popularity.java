/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Popularity {
    private int pLike;
    private String pSongName;

    public Popularity(int pLike, String pSongName) {
        this.pLike = pLike;
        this.pSongName = pSongName;
    }

    public int getpLike() {
        return pLike;
    }

    public void setpLike(int pLike) {
        this.pLike = pLike;
    }

    public String getpSongName() {
        return pSongName;
    }

    public void setpSongName(String pSongName) {
        this.pSongName = pSongName;
    }
    
    
}
