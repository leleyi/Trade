package cn.lesliu.Trading.pojo;

public class GoodsKey {
    private String id;

    private String owner;

    public GoodsKey(String id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    public GoodsKey(String id){
        this.id = id;
    }

    public GoodsKey() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }
}