package cn.lesliu.Trading.pojo;

import java.util.Date;

public class UserDetail extends UserDetailKey {
    private Integer age;

    private String idnum;

    private String studentid;

    private String academe;

    private String realname;

    private String sex;

    private String phone;

    private String email;

    private String qq;

    private Date registdate;

    private Date lastdate;

    private String capacity;

    private String signature;

    private String dormnum;

    private String grade;

    public UserDetail(String id, String username, Integer age, String idnum, String studentid, String academe, String realname, String sex, String phone, String email, String qq, Date registdate, Date lastdate, String capacity, String signature, String dormnum, String grade) {
        super(id, username);
        this.age = age;
        this.idnum = idnum;
        this.studentid = studentid;
        this.academe = academe;
        this.realname = realname;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.qq = qq;
        this.registdate = registdate;
        this.lastdate = lastdate;
        this.capacity = capacity;
        this.signature = signature;
        this.dormnum = dormnum;
        this.grade = grade;
    }
    public UserDetail(String id,String username,String email){
        super(id, username);
        this.email = email;
    }
    public UserDetail() {
        super();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum == null ? null : idnum.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getAcademe() {
        return academe;
    }

    public void setAcademe(String academe) {
        this.academe = academe == null ? null : academe.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Date getRegistdate() {
        return registdate;
    }

    public void setRegistdate(Date registdate) {
        this.registdate = registdate;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getDormnum() {
        return dormnum;
    }

    public void setDormnum(String dormnum) {
        this.dormnum = dormnum == null ? null : dormnum.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}