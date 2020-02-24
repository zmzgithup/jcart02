package io.zmz.jcartadministrationback.dto.in;

public class AdministratorUpdateProfileInDTO {

    private Integer administraiorId;
    private String username;
    private String realname;
    private String mobile;
    private String email;
    private String avatarUrl;
    private String password;

    public Integer getAdministraiorId() {
        return administraiorId;
    }

    public void setAdministraiorId(Integer administraiorId) {
        this.administraiorId = administraiorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
