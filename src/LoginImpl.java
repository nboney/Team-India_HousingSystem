import java.util.ArrayList;

public class LoginImpl implements Login{
    static ArrayList<HousingUILogin> users = new ArrayList<HousingUILogin>();


    @Override
    public void register(HousingUILogin housingUILogin) {
        users.add(housingUILogin);
    }

    @Override
    public boolean isLogin(String userName, String passWord) {
        boolean flag = false;
        for (HousingUILogin housingUILogin : users){
            if(userName.equals(housingUILogin.getUserName())&&
                    passWord.equals(housingUILogin.getPassWord())){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
