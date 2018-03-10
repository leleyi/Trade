package cn.lesliu.Trading.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Goods extends GoodsKey {
    private BigDecimal price;

    private String categories;

    private String name;

    private String summary;

    private Date exhibitdate;

    private Integer isdelete;

    private Integer issale;

    private Integer old;

    private Date undercarriagedate;

    private Integer enjoy;

    private String isline;

    private String buyday;

    private Integer usetime;

    private String picture;

    private String userid;

    private String adv;

    private BigDecimal originalcost;

    private Integer num;

    private List<GoodsImg> imgs;

    public List<GoodsImg> getImgs() {
        return imgs;
    }

    public void setImgs(List<GoodsImg> imgs) {
        this.imgs = imgs;
    }


    public Goods(String id, String owner, BigDecimal price, String categories, String name, String summary, Date exhibitdate, Integer isdelete, Integer issale, Integer old, Date undercarriagedate, Integer enjoy, String isline, String buyday, Integer usetime, String picture, String userid, String adv, BigDecimal originalcost, Integer num) {
        super(id, owner);
        this.price = price;
        this.categories = categories;
        this.name = name;
        this.summary = summary;
        this.exhibitdate = exhibitdate;
        this.isdelete = isdelete;
        this.issale = issale;
        this.old = old;
        this.undercarriagedate = undercarriagedate;
        this.enjoy = enjoy;
        this.isline = isline;
        this.buyday = buyday;
        this.usetime = usetime;
        this.picture = picture;
        this.userid = userid;
        this.adv = adv;
        this.originalcost = originalcost;
        this.num = num;
    }

    public Goods(String id, String owner, BigDecimal price, String categories, String name, String summary, Date exhibitdate, Integer isdelete, Integer issale, Integer old, Date undercarriagedate, Integer enjoy, String isline, String buyday, Integer usetime, String picture, String userid, String adv, BigDecimal originalcost, Integer num,List imgs) {
        super(id, owner);
        this.price = price;
        this.categories = categories;
        this.name = name;
        this.summary = summary;
        this.exhibitdate = exhibitdate;
        this.isdelete = isdelete;
        this.issale = issale;
        this.old = old;
        this.undercarriagedate = undercarriagedate;
        this.enjoy = enjoy;
        this.isline = isline;
        this.buyday = buyday;
        this.usetime = usetime;
        this.picture = picture;
        this.userid = userid;
        this.adv = adv;
        this.originalcost = originalcost;
        this.num = num;
        this.imgs = imgs;
    }


    public Goods() {
        super();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories == null ? null : categories.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Date getExhibitdate() {
        return exhibitdate;
    }

    public void setExhibitdate(Date exhibitdate) {
        this.exhibitdate = exhibitdate;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getIssale() {
        return issale;
    }

    public void setIssale(Integer issale) {
        this.issale = issale;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public Date getUndercarriagedate() {
        return undercarriagedate;
    }

    public void setUndercarriagedate(Date undercarriagedate) {
        this.undercarriagedate = undercarriagedate;
    }

    public Integer getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(Integer enjoy) {
        this.enjoy = enjoy;
    }

    public String getIsline() {
        return isline;
    }

    public void setIsline(String isline) {
        this.isline = isline == null ? null : isline.trim();
    }

    public String getBuyday() {
        return buyday;
    }

    public void setBuyday(String buyday) {
        this.buyday = buyday == null ? null : buyday.trim();
    }

    public Integer getUsetime() {
        return usetime;
    }

    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAdv() {
        return adv;
    }

    public void setAdv(String adv) {
        this.adv = adv == null ? null : adv.trim();
    }

    public BigDecimal getOriginalcost() {
        return originalcost;
    }

    public void setOriginalcost(BigDecimal originalcost) {
        this.originalcost = originalcost;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}