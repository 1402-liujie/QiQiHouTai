package qc.lxf.domian;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by asus on 2016/6/24.
 */
@Entity
public class User {
    @Id
    private String id;

    private String name;
    private String pass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
