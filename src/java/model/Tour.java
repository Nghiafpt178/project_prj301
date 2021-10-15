/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.ImageDBContext;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Tour {

    private int id;
    private String tourCode;
    private String tourName;
    private double tourPrice;
    private int numberGuests;
    private Date startDate;
    private Date endDate;
    private String dateTime;
    private String schedule;
    private String description;
    private String vehicle;
    private Admin admin;
    private Location location;
    private int status;
    private ArrayList<Tour_Images> tourImgs = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();
    

    public Tour() {
    }

    public Tour(int id, String tourCode, String tourName, double tourPrice,
            int numberGuests, Date startDate, Date endDate, String dateTime,
            String schedule, String description, String vehicle, Admin admin, Location location, int status) {
        this.id = id;
        this.tourCode = tourCode;
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        this.numberGuests = numberGuests;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateTime = dateTime;
        this.schedule = schedule;
        this.description = description;
        this.vehicle = vehicle;
        this.admin = admin;
        this.location = location;
        this.status = status;
    }

    public ArrayList<Tour_Images> getTourImgs() {
        return tourImgs;
    }

    public void setTourImgs(ArrayList<Tour_Images> tourImgs) {
        this.tourImgs = tourImgs;
    }

    public ArrayList<Image> getImages() {
        ImageDBContext imDB = new ImageDBContext();
        return imDB.getImagesById(id);
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

   
    

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getTourPrice() {
        return tourPrice;
    }

    public String priceVND() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(tourPrice) + " VNĐ";
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
