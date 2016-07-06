package cn.wzvtc.soft14.repository;

import cn.wzvtc.soft14.domian.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by asus on 2016/6/24.
 */
@Repository
public interface UserPepo extends CrudRepository<User,String> {
    List findByNameAndPass(String name,String pass);
}
