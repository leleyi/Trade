package cn.lesliu.Trading.pojo;

import java.math.BigDecimal;

public class Skill {
    private String id;

    private String owner;

    private BigDecimal price;

    private String categories;

    private String skill;

    private String summary;

    public Skill(String id, String owner, BigDecimal price, String categories, String skill, String summary) {
        this.id = id;
        this.owner = owner;
        this.price = price;
        this.categories = categories;
        this.skill = skill;
        this.summary = summary;
    }

    public Skill() {
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

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }
}