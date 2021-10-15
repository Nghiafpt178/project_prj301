/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.New;

/**
 *
 * @author ADMIN
 */
public class NewDBContext extends DBContext {

    public ArrayList<New> getNews() {
        ArrayList<New> news = new ArrayList<>();
        try {
            String sql = "select id,tital, [description], [image]\n"
                    + "from News";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                New n = new New();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                news.add(n);
            }

        } catch (SQLException e) {

        }
        return news;

    }
    
    public New getNewsById(int id) {
        
        try {
            String sql = "select id,tital, [description], [image]\n"
                    + "from News where id =?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                New n = new New();
                n.setId(rs.getInt("id"));
                n.setTitle(rs.getString("tital"));
                n.setDesciption(rs.getString("description"));
                n.setImage(rs.getString("image"));
                return n;
            }

        } catch (SQLException e) {

        }
        return null;

    }

}
