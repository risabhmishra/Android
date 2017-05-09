package com.rm.dell.card_view;

/**
 * Created by DELL on 4/8/2017.
 */

public class Contact {
    public Contact(int image_id,String name,String email,String phone){
        this.setImage_id(image_id);
        this.setName(name);
        this.setEmail(email);
        this.setPhone(phone);
    }
private int image_id;
    private String name,email,phone;

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImage_id() {
        return image_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
