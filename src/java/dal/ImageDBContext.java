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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Image;
import model.Tour_Images;

/**
 *
 * @author ADMIN
 */
public class ImageDBContext extends DBContext {

    public ArrayList<Image> getImagesById(int tourId) {
        ArrayList<Image> images = new ArrayList<>();
        try {
            String sql = "select tourId, i.img\n"
                    + "from Tour_images ti inner join Images i\n"
                    + "on ti.imgId = i.id\n"
                    + "where tourId = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, tourId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour_Images tm = new Tour_Images();
                Image i = new Image();
                i.setId(rs.getInt(1));
                i.setImage(rs.getString(2));
                images.add(i);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ImageDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return images;

    }

}
