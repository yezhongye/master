package com.ye.db.employee.entity.statement;

import java.io.Serializable;
import java.util.Date;

public class TbBfOrderFile implements Serializable{
    private String bId;

    private String bMemberId;

    private String bTerminalUd;

    private String bTxnType;

    private String bTxnSubType;

    private String bBfOrderNo;

    private String bTransId;

    private Date bSettlementTime;

    private String bOrderStatus;

    private String bTxnAmt;

    private String bServiceAmt;

    private String bTransNo;

    private Date bPayOrderCreateTime;

    private String bRefundTransId;

    private Date bRefundOrderCreateTime;

    private Date bCreateTime;

    private Date bUpdateTime;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbMemberId() {
        return bMemberId;
    }

    public void setbMemberId(String bMemberId) {
        this.bMemberId = bMemberId == null ? null : bMemberId.trim();
    }

    public String getbTerminalUd() {
        return bTerminalUd;
    }

    public void setbTerminalUd(String bTerminalUd) {
        this.bTerminalUd = bTerminalUd == null ? null : bTerminalUd.trim();
    }

    public String getbTxnType() {
        return bTxnType;
    }

    public void setbTxnType(String bTxnType) {
        this.bTxnType = bTxnType == null ? null : bTxnType.trim();
    }

    public String getbTxnSubType() {
        return bTxnSubType;
    }

    public void setbTxnSubType(String bTxnSubType) {
        this.bTxnSubType = bTxnSubType == null ? null : bTxnSubType.trim();
    }

    public String getbBfOrderNo() {
        return bBfOrderNo;
    }

    public void setbBfOrderNo(String bBfOrderNo) {
        this.bBfOrderNo = bBfOrderNo == null ? null : bBfOrderNo.trim();
    }

    public String getbTransId() {
        return bTransId;
    }

    public void setbTransId(String bTransId) {
        this.bTransId = bTransId == null ? null : bTransId.trim();
    }

    public Date getbSettlementTime() {
        return bSettlementTime;
    }

    public void setbSettlementTime(Date bSettlementTime) {
        this.bSettlementTime = bSettlementTime;
    }

    public String getbOrderStatus() {
        return bOrderStatus;
    }

    public void setbOrderStatus(String bOrderStatus) {
        this.bOrderStatus = bOrderStatus == null ? null : bOrderStatus.trim();
    }

    public String getbTxnAmt() {
        return bTxnAmt;
    }

    public void setbTxnAmt(String bTxnAmt) {
        this.bTxnAmt = bTxnAmt == null ? null : bTxnAmt.trim();
    }

    public String getbServiceAmt() {
        return bServiceAmt;
    }

    public void setbServiceAmt(String bServiceAmt) {
        this.bServiceAmt = bServiceAmt == null ? null : bServiceAmt.trim();
    }

    public String getbTransNo() {
        return bTransNo;
    }

    public void setbTransNo(String bTransNo) {
        this.bTransNo = bTransNo == null ? null : bTransNo.trim();
    }

    public Date getbPayOrderCreateTime() {
        return bPayOrderCreateTime;
    }

    public void setbPayOrderCreateTime(Date bPayOrderCreateTime) {
        this.bPayOrderCreateTime = bPayOrderCreateTime;
    }

    public String getbRefundTransId() {
        return bRefundTransId;
    }

    public void setbRefundTransId(String bRefundTransId) {
        this.bRefundTransId = bRefundTransId == null ? null : bRefundTransId.trim();
    }

    public Date getbRefundOrderCreateTime() {
        return bRefundOrderCreateTime;
    }

    public void setbRefundOrderCreateTime(Date bRefundOrderCreateTime) {
        this.bRefundOrderCreateTime = bRefundOrderCreateTime;
    }

    public Date getbCreateTime() {
        return bCreateTime;
    }

    public void setbCreateTime(Date bCreateTime) {
        this.bCreateTime = bCreateTime;
    }

    public Date getbUpdateTime() {
        return bUpdateTime;
    }

    public void setbUpdateTime(Date bUpdateTime) {
        this.bUpdateTime = bUpdateTime;
    }
}