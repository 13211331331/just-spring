package cn.iszt.hhl;

/**
 * Created by Administrator on 15-8-13.
 */
public class User extends BaseModel{
    private String userName;
    private Integer id;
    private String passWord;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", passWord='" + passWord + '\'' +
                ", isS='" + super.getIsS() + '\'' +
                '}';
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

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
}
