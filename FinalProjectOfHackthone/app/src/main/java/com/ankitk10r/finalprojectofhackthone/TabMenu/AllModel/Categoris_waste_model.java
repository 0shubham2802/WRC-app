package com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel;

public class Categoris_waste_model {
    String waste_name;
    String waste_image_url;


    public Categoris_waste_model(String waste_name, String waste_image_url) {
        this.waste_name = waste_name;
        this.waste_image_url = waste_image_url;
    }

    public Categoris_waste_model() {
    }

    public String getWaste_name() {
        return waste_name;
    }

    public void setWaste_name(String waste_name) {
        this.waste_name = waste_name;
    }

    public String getWaste_image_url() {
        return waste_image_url;
    }

    public void setWaste_image_url(String waste_image_url) {
        this.waste_image_url = waste_image_url;
    }
}
