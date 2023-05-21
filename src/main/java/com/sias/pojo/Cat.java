package com.sias.pojo;

public class Cat extends Pet{
    private Integer id;
    private String name;
    private String sex;
    private String description;
    private String img;
    private String variety;

    public Cat() {
    }

    public Cat(String name, String sex, String variety, String name1, String sex1, String variety1) {
        super(name, sex, variety);
        this.name = name1;
        this.sex = sex1;
        this.variety = variety1;
    }

//    public Cat(String name, String sex, String description, String img, String variety) {
//        this.name = name;
//        this.sex = sex;
//        this.description = description;
//        this.img = img;
//        this.variety = variety;
//    }

    public Cat(Integer id, String name, String sex, String description, String img, String variety, Integer id1, String name1, String sex1, String description1, String img1, String variety1) {
        super(id, name, sex, description, img, variety);
        this.id = id1;
        this.name = name1;
        this.sex = sex1;
        this.description = description1;
        this.img = img1;
        this.variety = variety1;
    }

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
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                ", variety='" + variety + '\'' +
                '}';
    }
}
