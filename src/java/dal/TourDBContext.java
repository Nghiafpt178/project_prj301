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
import model.Admin;
import model.Location;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class TourDBContext extends DBContext {

    public ArrayList<Tour> getTours() {
        ArrayList<Tour> tours = new ArrayList<>();
        try {
            String sql = "SELECT [id],[tourCode],[tourName],[tourPrice],[tourLocationId],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourScheule],[tourDescription],\n"
                    + "[tourVehicle],[status],[adminId]\n"
                    + "  FROM [Tour]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setId(rs.getInt("id"));
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                Location location = new Location();
                location.setId(rs.getInt("tourLocationId"));
                t.setLocation(location);
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourScheule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setStatus(rs.getInt("status"));
                Admin a = new Admin();
                a.setId(rs.getInt("adminId"));
                t.setAdmin(a);
                tours.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tours;

    }
}
