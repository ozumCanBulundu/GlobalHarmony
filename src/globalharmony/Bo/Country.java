/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Country {
    private String cAlbName;
    private int cId;

    public Country(String cAlbName, int cId) {
        this.cAlbName = cAlbName;
        this.cId = cId;
    }

    public String getcAlbName() {
        return cAlbName;
    }

    public void setcAlbName(String cAlbName) {
        this.cAlbName = cAlbName;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    
}
