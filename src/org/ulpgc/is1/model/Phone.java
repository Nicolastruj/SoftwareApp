package org.ulpgc.is1.model;

public class Phone {
    private String number;
    public Phone(String number){
        this.number = number;
    }
    public boolean isValid(){
        if (number != null && number.matches("\\d{10}")) {
            return true;
        } else {
            return false;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
