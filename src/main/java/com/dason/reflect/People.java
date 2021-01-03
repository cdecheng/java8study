package com.dason.reflect;

/**
 * 测试反射对象实体
 *
 * @author chendecheng
 * @since 2020-12-31 00:14
 */
public class People {

    private Integer id;

    private String userName;

    private String career;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", career='" + career + '\'' +
                '}';
    }
}
