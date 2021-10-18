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
     public ArrayList<Tour> getToursByTitle(int status) {
        ArrayList<Tour> tours = new ArrayList<>();
        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],[status],[img]  \n"
                    + "  FROM [Tour] WHERE [status] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, status);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setStatus(rs.getInt("status"));
                t.setImg(rs.getString("img"));
                tours.add(t);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tours;

    }

    public Tour getToursByCode(String tcode) {

        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],[status],[img]  \n"
                    + "  FROM [Tour] WHERE [tourCode] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, tcode);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setStatus(rs.getInt("status"));
                t.setImg(rs.getString("img"));
                return t;

            }

        } catch (SQLException ex) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public void bookTour(Booktour booktour) {

        try {
            String sql = "INSERT INTO [Booktour]\n"
                    + "           ([tourCode]\n"
                    + "           ,[username]\n"
                    + "           ,[startDate]\n"
                    + "           ,[endDate]\n"
                    + "           ,[price]\n"
                    + "           ,[status]\n"
                    + "           ,[fullname]\n"
                    + "           ,[phone]\n"
                    + "           ,[email]\n"
                    + "           ,[address]\n"
                    + "           ,[require])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, booktour.getTour().getTourCode());
            stm.setString(2, booktour.getUsername());
            stm.setDate(3, booktour.getTour().getStartDate());
            stm.setDate(4, booktour.getTour().getEndDate());
            stm.setInt(5, (int) booktour.getTour().getTourPrice());
            stm.setInt(6, booktour.getStatus());
            stm.setString(7, booktour.getFullname());
            stm.setString(8, booktour.getPhone());
            stm.setString(9, booktour.getEmail());
            stm.setString(10, booktour.getAddress());
            stm.setString(11, booktour.getRequire());
            stm.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(TourDBContext.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Tour> searchTour(String name, Date startDate, Date endDate) {
        ArrayList<Tour> searchTour = new ArrayList<>();
        try {
            String sql = "SELECT [tourCode],[tourName],[tourPrice],[tourNumberGuests],\n"
                    + "[tourStartDate],[tourTime],[tourEndDate],[tourSchedule],[tourDescription],\n"
                    + "[tourVehicle],[status],[img]  \n"
                    + "  FROM [Tour] where (1=1)\n";

            HashMap<Integer, Object[]> params = new HashMap<>();
            int paramIndex = 0;
            if (name != null) {
                sql += " and tourName like '%'+?+'%' ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = String.class.getTypeName();
                param[1] = name;
                params.put(paramIndex, param);

            }
            if (startDate != null) {
                sql += " and tourStartDate >= ? ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getTypeName();
                param[1] = startDate;
                params.put(paramIndex, param);

            }
            if (endDate != null) {
                sql += " and tourEndDate <= ? ";
                paramIndex++;
                Object[] param = new Object[2];
                param[0] = Date.class.getTypeName();
                param[1] = endDate;
                params.put(paramIndex, param);

            }

            PreparedStatement stm = connection.prepareStatement(sql);

            for (Map.Entry<Integer, Object[]> entry : params.entrySet()) {
                Integer index = entry.getKey();
                Object[] value = entry.getValue();
                String type = value[0].toString();
                if (type.equals(String.class.getTypeName())) {
                    stm.setString(index, value[1].toString());
                } else if (type.equals(Date.class.getTypeName())) {
                    stm.setDate(index, (Date) value[1]);
                } else if (type.equals(Date.class.getTypeName())) {
                    stm.setDate(index, (Date) value[1]);
                }

            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour t = new Tour();
                t.setTourCode(rs.getString("tourCode"));
                t.setTourName(rs.getString("tourName"));
                t.setTourPrice(rs.getInt("tourPrice"));
                t.setNumberGuests(rs.getInt("tourNumberGuests"));
                t.setStartDate(rs.getDate("tourStartDate"));
                t.setDateTime(rs.getString("tourTime"));
                t.setEndDate(rs.getDate("tourEndDate"));
                t.setSchedule(rs.getString("tourSchedule"));
                t.setDescription(rs.getString("tourDescription"));
                t.setVehicle(rs.getString("tourVehicle"));
                t.setStatus(rs.getInt("status"));
                t.setImg(rs.getString("img"));
                searchTour.add(t);

            }

        } catch (SQLException e) {
        }

        return searchTour;
    }
}
