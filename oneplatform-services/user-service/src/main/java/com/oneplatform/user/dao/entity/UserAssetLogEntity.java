package com.oneplatform.user.dao.entity;

import com.jeesuite.mybatis.core.BaseEntity;
import javax.persistence.*;

/**
 * generated by www.jeesuite.com
 */
@Table(name = "user_asset_log")
public class UserAssetLogEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    /**
    * @return userId 
    */
    @Column(name = "user_id")
    private Integer userId;
    
    /**
    * @return tradeName 
    */
    @Column(name = "trade_name")
    private String tradeName;
    
    /**
    * @return assetType 余额，平台币，积分
    */
    @Column(name = "asset_type")
    private String assetType;
    
    /**
    * @return subType 可用的，冻结的
    */
    @Column(name = "sub_type")
    private String subType;
    
    /**
    * @return tradeType 支出，收入，冻结，解冻
    */
    @Column(name = "trade_type")
    private String tradeType;
    
    /**
    * @return amount 
    */
    @Column(name = "amount")
    private java.math.BigDecimal amount;
    
    /**
    * @return currentAvailable 当前可用的
    */
    @Column(name = "current_available")
    private java.math.BigDecimal currentAvailable;
    
    /**
    * @return currentFrozen 当前冻结的
    */
    @Column(name = "current_frozen")
    private java.math.BigDecimal currentFrozen;
    
    /**
    * @return sign 
    */
    @Column(name = "sign")
    private String sign;
    
    /**
    * @return memo 
    */
    @Column(name = "memo")
    private String memo;
    
    /**
    * @return hidden 是否隐藏(不对外显示)
    */
    @Column(name = "hidden")
    private Boolean hidden;
    
    /**
    * @return tradeAt 
    */
    @Column(name = "trade_at")
    private java.util.Date tradeAt;
    
    /**
    * @return operator 经办人
    */
    @Column(name = "operator")
    private String operator;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }
    public java.math.BigDecimal getCurrentAvailable() {
        return currentAvailable;
    }

    public void setCurrentAvailable(java.math.BigDecimal currentAvailable) {
        this.currentAvailable = currentAvailable;
    }
    public java.math.BigDecimal getCurrentFrozen() {
        return currentFrozen;
    }

    public void setCurrentFrozen(java.math.BigDecimal currentFrozen) {
        this.currentFrozen = currentFrozen;
    }
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }
    public java.util.Date getTradeAt() {
        return tradeAt;
    }

    public void setTradeAt(java.util.Date tradeAt) {
        this.tradeAt = tradeAt;
    }
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}