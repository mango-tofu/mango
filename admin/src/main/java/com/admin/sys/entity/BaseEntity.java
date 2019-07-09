package com.admin.sys.entity;


import java.io.Serializable;
import java.util.Date;


/**
 * 
 * Chines :基础对象 
 * Enlish :Base object 
 * ClassName: BaseEntity Function: ADD
 * FUNCTION. date: 2018年6月7日 下午1:53:46
 * @author why
 * @since JDK 1.8
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3175985220214098887L;
    private Date createDate;// 创建时间

    private Date updateDate;// 修改时间

    private String operator;// 操作人

    private String comments;// 备注

    private int startRow;//分页查询 开始页码

    private int endRow;//分页查询 结束页码

    
    public BaseEntity(){
        
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
