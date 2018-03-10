package cn.lesliu.Trading.pojo;

public class GoodsImg {
    private String imgid;

    private String goodsid;

    private String img;

    private String imgname;

    public GoodsImg(String imgid, String goodsid, String img, String imgname) {
        this.imgid = imgid;
        this.goodsid = goodsid;
        this.img = img;
        this.imgname = imgname;
    }

    public GoodsImg() {
        super();
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid == null ? null : imgid.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }
}