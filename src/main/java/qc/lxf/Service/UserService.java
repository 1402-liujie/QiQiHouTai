package cn.wzvtc.soft14.Service;

import cn.wzvtc.soft14.domian.User;
import cn.wzvtc.soft14.repository.UserPepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2016/6/24.
 */
@Service
public class UserService {
    @Autowired
    private UserPepo userPepo;

    public boolean isExist(String name,String pass){
        List<User> result = userPepo.findByNameAndPass(name,pass);
        if(result.size()!=0)
            return  true;
        else
            return false;
    }
}
