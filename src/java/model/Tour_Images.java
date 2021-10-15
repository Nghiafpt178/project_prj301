/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Tour_Images {
    private Tour tourId;
    private Image imgId;

    public Tour_Images() {
    }

    public Tour_Images(Tour tourId, Image imgId) {
        this.tourId = tourId;
        this.imgId = imgId;
    }

    public Tour getTourId() {
        return tourId;
    }

    public void setTourId(Tour tourId) {
        this.tourId = tourId;
    }

    public Image getImgId() {
        return imgId;
    }

    public void setImgId(Image imgId) {
        this.imgId = imgId;
    }
    
}
