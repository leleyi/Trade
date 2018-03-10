package cn.lesliu.Trading.pojo;

public class UserDetailKey {
    private String id;

    private String username;

    public UserDetailKey(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public UserDetailKey() {
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
}