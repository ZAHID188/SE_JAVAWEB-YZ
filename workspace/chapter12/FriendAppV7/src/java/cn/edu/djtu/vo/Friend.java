/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.vo;

/**
 *
 * @author Administrator
 */
public class Friend {
private Integer fid = 0;
    private String fname = "";
    private String fgender = "男";
    private String ftelephone = "";
    private String fcellphone = "";
    private String fremark = "";
    private String username = "";

    /**
     * @return the fid
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * @param fid the fid to set
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the fgender
     */
    public String getFgender() {
        return fgender;
    }

    /**
     * @param fgender the fgender to set
     */
    public void setFgender(String fgender) {
        this.fgender = fgender;
    }

    /**
     * @return the ftelephone
     */
    public String getFtelephone() {
        return ftelephone;
    }

    /**
     * @param ftelephone the ftelephone to set
     */
    public void setFtelephone(String ftelephone) {
        this.ftelephone = ftelephone;
    }

    /**
     * @return the fcellphone
     */
    public String getFcellphone() {
        return fcellphone;
    }

    /**
     * @param fcellphone the fcellphone to set
     */
    public void setFcellphone(String fcellphone) {
        this.fcellphone = fcellphone;
    }

    /**
     * @return the fremark
     */
    public String getFremark() {
        return fremark;
    }

    /**
     * @param fremark the fremark to set
     */
    public void setFremark(String fremark) {
        this.fremark = fremark;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
