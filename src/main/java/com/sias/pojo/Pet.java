package com.sias.pojo;

public class Pet {
    private Integer id;
    private String name;
    private String sex;
    private String description;
    private String img;
    private String variety;

    public Pet() {
    }

    public Pet(Integer id, String name, String sex, String description, String img, String variety) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.description = description;
        this.img = img;
        this.variety = variety;
    }

    public Pet(String name, String sex, String variety) {
        this.name = name;
        this.sex = sex;
        this.variety = variety;
    }

//    public Pet(String name, String sex, String description, String img, String variety) {
//        this.name = name;
//        this.sex = sex;
//        this.description = description;
//        this.img = img;
//        this.variety = variety;
//    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}
