package cn.iszt.hhl;

/**
 * Created by Administrator on 15-8-12.
 */
public class UserLoginImpl implements UserLogin {
    public void login(String userName) {
        System.out.println("欢迎 " + userName + " 正在登陆......");
    }
}
