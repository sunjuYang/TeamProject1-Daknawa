package com.kh.common.model.vo;

import java.sql.Date;

public class Attachment {

    private int fileNo;
    private String originName;
    private String changeName;
    private Date fileDate;
    private String filePath;
    private int fileLevel;
    private int postNo;
    private int menuNo;
    private String status;

    public Attachment() {}

    

    public Attachment(int fileNo, String originName, String changeName, String filePath, int menuNo) {
		super();
		this.fileNo = fileNo;
		this.originName = originName;
		this.changeName = changeName;
		this.filePath = filePath;
		this.menuNo = menuNo;
	}



    public Attachment(int fileNo, String originName, String changeName, Date fileDate, String filePath, int fileLevel,
            int postNo, int menuNo, String status) {
        super();
        this.fileNo = fileNo;
        this.originName = originName;
        this.changeName = changeName;
        this.fileDate = fileDate;
        this.filePath = filePath;
        this.fileLevel = fileLevel;
        this.postNo = postNo;
        this.menuNo = menuNo;
        this.status = status;
    }

    public int getFileNo() {
        return fileNo;
    }

    public void setFileNo(int fileNo) {
        this.fileNo = fileNo;
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getChangeName() {
        return changeName;
    }

    public void setChangeName(String changeName) {
        this.changeName = changeName;
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getFileLevel() {
        return fileLevel;
    }

    public void setFileLevel(int fileLevel) {
        this.fileLevel = fileLevel;
    }

    public int getPostNo() {
        return postNo;
    }

    public void setPostNo(int postNo) {
        this.postNo = postNo;
    }

    public int getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(int menuNo) {
        this.menuNo = menuNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attachment [fileNo=" + fileNo + ", originName=" + originName + ", changeName=" + changeName
                + ", fileDate=" + fileDate + ", filePath=" + filePath + ", fileLevel=" + fileLevel + ", postNo=" + postNo
                + ", menuNo=" + menuNo + ", status=" + status + "]";
    }
}
