/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.Dao;

import globalharmony.Bo.Song;
import globalharmony.util.SQLUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ozumc
 */
public class SongHandler {
    private SQLUtil sqlUtil;
    public SongHandler() {
        sqlUtil = new SQLUtil();
    }
    
    public int addSong(String sName, String sLanguage, int year, String sGenre, String Album,int sPopularity){
        String cmdTemplate = "insert into Song() values('%s', '%s', %d,'%s','%s',%d)";
        String cmd = String.format(cmdTemplate,sName,sLanguage,year,sGenre,Album,sPopularity);
        return sqlUtil.executeUpdate(cmd);
    }
    
    public List<Song> loadSong(String keyword){
        
            List<Song> songs = new ArrayList<>();
            String cmdTemplate = "select * from Song where sName like '%s'";
            String cmd = String.format(cmdTemplate, "%" + keyword + "%");
            ResultSet rs = sqlUtil.executeQuery(cmd);
            try {
            while(rs.next()){
                String sName = rs.getString("sName");
                String sLang = rs.getString("SLang");
                int sYear = rs.getInt("sYear");
                String sGenre = rs.getString("sGenre");
                String sAlbum = rs.getString("sAlbum");
                int sPopularity = rs.getInt("sPopularity");
                Song s = new Song(sName,sLang, sYear, sGenre, sAlbum, sPopularity);
                songs.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SongHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return songs;
    }
    
    public int deleteSong(String sName){
        String cmdTemplate = "delete from Song where sName = '%s'";
        String cmd = String.format(cmdTemplate,sName);
        return sqlUtil.executeUpdate(cmd);
        
    }
}
