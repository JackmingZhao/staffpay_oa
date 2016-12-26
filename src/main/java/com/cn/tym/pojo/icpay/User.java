package com.cn.tym.pojo.icpay;

import java.math.BigDecimal;

public class User {
    private String userid;

    private String username;

    private String loginid;

    private String password;

    private String tel;

    private String mobiltel;

    private Short provinceid;

    private Short cityid;

    private String address;

    private String zipcode;

    private String sex;

    private String identityid;

    private String identitytype;

    private String email;

    private String registtime;

    private String lastedittime;

    private Integer unitid;

    private Short usertype;

    private String mchnitid;

    private Long point;

    private String status;

    private String question;

    private String answer;

    private Integer departid;

    private Long qd;

    private String qianbaomoney;

    private String lastmobiltel;

    private Short yktcityid;

    private String uuid;

    private String mchnmark;

    private BigDecimal historyScore;

    private BigDecimal currentScore;

    private BigDecimal usertype1;

    private String activeid;

    private String wechatid;

    private String wechaticon;

    private String proxyorderno;

    private Integer activerebate;

    private String education;

    private String occupation;

    private String birthday;

    private String relname;

    private String transFlag;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMobiltel() {
        return mobiltel;
    }

    public void setMobiltel(String mobiltel) {
        this.mobiltel = mobiltel == null ? null : mobiltel.trim();
    }

    public Short getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Short provinceid) {
        this.provinceid = provinceid;
    }

    public Short getCityid() {
        return cityid;
    }

    public void setCityid(Short cityid) {
        this.cityid = cityid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdentityid() {
        return identityid;
    }

    public void setIdentityid(String identityid) {
        this.identityid = identityid == null ? null : identityid.trim();
    }

    public String getIdentitytype() {
        return identitytype;
    }

    public void setIdentitytype(String identitytype) {
        this.identitytype = identitytype == null ? null : identitytype.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRegisttime() {
        return registtime;
    }

    public void setRegisttime(String registtime) {
        this.registtime = registtime == null ? null : registtime.trim();
    }

    public String getLastedittime() {
        return lastedittime;
    }

    public void setLastedittime(String lastedittime) {
        this.lastedittime = lastedittime == null ? null : lastedittime.trim();
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public String getMchnitid() {
        return mchnitid;
    }

    public void setMchnitid(String mchnitid) {
        this.mchnitid = mchnitid == null ? null : mchnitid.trim();
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public Long getQd() {
        return qd;
    }

    public void setQd(Long qd) {
        this.qd = qd;
    }

    public String getQianbaomoney() {
        return qianbaomoney;
    }

    public void setQianbaomoney(String qianbaomoney) {
        this.qianbaomoney = qianbaomoney == null ? null : qianbaomoney.trim();
    }

    public String getLastmobiltel() {
        return lastmobiltel;
    }

    public void setLastmobiltel(String lastmobiltel) {
        this.lastmobiltel = lastmobiltel == null ? null : lastmobiltel.trim();
    }

    public Short getYktcityid() {
        return yktcityid;
    }

    public void setYktcityid(Short yktcityid) {
        this.yktcityid = yktcityid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMchnmark() {
        return mchnmark;
    }

    public void setMchnmark(String mchnmark) {
        this.mchnmark = mchnmark == null ? null : mchnmark.trim();
    }

    public BigDecimal getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(BigDecimal historyScore) {
        this.historyScore = historyScore;
    }

    public BigDecimal getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(BigDecimal currentScore) {
        this.currentScore = currentScore;
    }

    public BigDecimal getUsertype1() {
        return usertype1;
    }

    public void setUsertype1(BigDecimal usertype1) {
        this.usertype1 = usertype1;
    }

    public String getActiveid() {
        return activeid;
    }

    public void setActiveid(String activeid) {
        this.activeid = activeid == null ? null : activeid.trim();
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid == null ? null : wechatid.trim();
    }

    public String getWechaticon() {
        return wechaticon;
    }

    public void setWechaticon(String wechaticon) {
        this.wechaticon = wechaticon == null ? null : wechaticon.trim();
    }

    public String getProxyorderno() {
        return proxyorderno;
    }

    public void setProxyorderno(String proxyorderno) {
        this.proxyorderno = proxyorderno == null ? null : proxyorderno.trim();
    }

    public Integer getActiverebate() {
        return activerebate;
    }

    public void setActiverebate(Integer activerebate) {
        this.activerebate = activerebate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getRelname() {
        return relname;
    }

    public void setRelname(String relname) {
        this.relname = relname == null ? null : relname.trim();
    }

    public String getTransFlag() {
        return transFlag;
    }

    public void setTransFlag(String transFlag) {
        this.transFlag = transFlag == null ? null : transFlag.trim();
    }
}