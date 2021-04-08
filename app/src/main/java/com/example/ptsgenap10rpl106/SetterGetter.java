package com.example.ptsgenap10rpl106;

public class SetterGetter {
    String tittle, tittle2;
    String img;

    public SetterGetter(String tittle, String tittle2, String img){
        this.tittle = tittle;
        this.tittle2 = tittle2;
        this.img = img;
    }

    public String getTittle2() {
        return tittle2;
    }

    public void setTittle2(String tittle2) {
        this.tittle2 = tittle2;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
