/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Bo;

/**
 *
 * @author ozumc
 */
public class Staff {
    private String sAlbName;
    private int idUser;
    private int sallary;

    public Staff(String sAlbName, int idUser, int sallary) {
        this.sAlbName = sAlbName;
        this.idUser = idUser;
        this.sallary = sallary;
    }

    public String getsAlbName() {
        return sAlbName;
    }

    public void setsAlbName(String sAlbName) {
        this.sAlbName = sAlbName;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
    
    
}
