package io.zmz.jcartadministrationback.dto.out;

public class CustomerListOutDTO {
    private Integer customerId;
    private String username;
    private String realname;
    private String mobile;
    private String email;
    private Byte status;
    private Long createTimetamp;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimetamp() {
        return createTimetamp;
    }

    public void setCreateTimetamp(Long createTimetamp) {
        this.createTimetamp = createTimetamp;
    }
}
