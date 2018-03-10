package cn.lesliu.Trading.pojo;

public class EmailMessages {
    private String messageid;

    private String goodsid;

    private String goodsname;

    private String senduserid;

    private String sendusername;

    private String goodsownerid;

    private String goodsownername;

    private String givewords;

    private String giveprice;

    public EmailMessages(String messageid, String goodsid, String goodsname, String senduserid, String sendusername, String goodsownerid, String goodsownername, String givewords, String giveprice) {
        this.messageid = messageid;
        this.goodsid = goodsid;
        this.goodsname = goodsname;
        this.senduserid = senduserid;
        this.sendusername = sendusername;
        this.goodsownerid = goodsownerid;
        this.goodsownername = goodsownername;
        this.givewords = givewords;
        this.giveprice = giveprice;
    }

    public EmailMessages() {
        super();
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid == null ? null : messageid.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid == null ? null : senduserid.trim();
    }

    public String getSendusername() {
        return sendusername;
    }

    public void setSendusername(String sendusername) {
        this.sendusername = sendusername == null ? null : sendusername.trim();
    }

    public String getGoodsownerid() {
        return goodsownerid;
    }

    public void setGoodsownerid(String goodsownerid) {
        this.goodsownerid = goodsownerid == null ? null : goodsownerid.trim();
    }

    public String getGoodsownername() {
        return goodsownername;
    }

    public void setGoodsownername(String goodsownername) {
        this.goodsownername = goodsownername == null ? null : goodsownername.trim();
    }

    public String getGivewords() {
        return givewords;
    }

    public void setGivewords(String givewords) {
        this.givewords = givewords == null ? null : givewords.trim();
    }

    public String getGiveprice() {
        return giveprice;
    }

    public void setGiveprice(String giveprice) {
        this.giveprice = giveprice == null ? null : giveprice.trim();
    }
}