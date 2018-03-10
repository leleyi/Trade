package cn.lesliu.Trading.pojo;

public class User extends PageInfo {
    private String id;

    private String username;

    private String password;

    private Integer enable;

    public User(String id, String username, String password, Integer enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enable = enable;
    }

    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}