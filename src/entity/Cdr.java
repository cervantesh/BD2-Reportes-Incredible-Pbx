package entity;
// Generated Apr 1, 2017 3:14:45 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cdr generated by hbm2java
 */
public class Cdr  implements java.io.Serializable {


     private Long recid;
     private Date calldate;
     private String clid;
     private String src;
     private String dst;
     private String dcontext;
     private String channel;
     private String dstchannel;
     private String lastapp;
     private String lastdata;
     private int duration;
     private int billsec;
     private String disposition;
     private int amaflags;
     private String accountcode;
     private String uniqueid;
     private String userfield;
     private String did;
     private String recordingfile;
     private String cnum;
     private String cnam;
     private String outboundCnum;
     private String outboundCnam;
     private String dstCnam;

    public Cdr() {
    }

    public Cdr(Date calldate, String clid, String src, String dst, String dcontext, String channel, String dstchannel, String lastapp, String lastdata, int duration, int billsec, String disposition, int amaflags, String accountcode, String uniqueid, String userfield, String did, String recordingfile, String cnum, String cnam, String outboundCnum, String outboundCnam, String dstCnam) {
       this.calldate = calldate;
       this.clid = clid;
       this.src = src;
       this.dst = dst;
       this.dcontext = dcontext;
       this.channel = channel;
       this.dstchannel = dstchannel;
       this.lastapp = lastapp;
       this.lastdata = lastdata;
       this.duration = duration;
       this.billsec = billsec;
       this.disposition = disposition;
       this.amaflags = amaflags;
       this.accountcode = accountcode;
       this.uniqueid = uniqueid;
       this.userfield = userfield;
       this.did = did;
       this.recordingfile = recordingfile;
       this.cnum = cnum;
       this.cnam = cnam;
       this.outboundCnum = outboundCnum;
       this.outboundCnam = outboundCnam;
       this.dstCnam = dstCnam;
    }
   
    public Long getRecid() {
        return this.recid;
    }
    
    public void setRecid(Long recid) {
        this.recid = recid;
    }
    public Date getCalldate() {
        return this.calldate;
    }
    
    public void setCalldate(Date calldate) {
        this.calldate = calldate;
    }
    public String getClid() {
        return this.clid;
    }
    
    public void setClid(String clid) {
        this.clid = clid;
    }
    public String getSrc() {
        return this.src;
    }
    
    public void setSrc(String src) {
        this.src = src;
    }
    public String getDst() {
        return this.dst;
    }
    
    public void setDst(String dst) {
        this.dst = dst;
    }
    public String getDcontext() {
        return this.dcontext;
    }
    
    public void setDcontext(String dcontext) {
        this.dcontext = dcontext;
    }
    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getDstchannel() {
        return this.dstchannel;
    }
    
    public void setDstchannel(String dstchannel) {
        this.dstchannel = dstchannel;
    }
    public String getLastapp() {
        return this.lastapp;
    }
    
    public void setLastapp(String lastapp) {
        this.lastapp = lastapp;
    }
    public String getLastdata() {
        return this.lastdata;
    }
    
    public void setLastdata(String lastdata) {
        this.lastdata = lastdata;
    }
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getBillsec() {
        return this.billsec;
    }
    
    public void setBillsec(int billsec) {
        this.billsec = billsec;
    }
    public String getDisposition() {
        return this.disposition;
    }
    
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }
    public int getAmaflags() {
        return this.amaflags;
    }
    
    public void setAmaflags(int amaflags) {
        this.amaflags = amaflags;
    }
    public String getAccountcode() {
        return this.accountcode;
    }
    
    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }
    public String getUniqueid() {
        return this.uniqueid;
    }
    
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }
    public String getUserfield() {
        return this.userfield;
    }
    
    public void setUserfield(String userfield) {
        this.userfield = userfield;
    }
    public String getDid() {
        return this.did;
    }
    
    public void setDid(String did) {
        this.did = did;
    }
    public String getRecordingfile() {
        return this.recordingfile;
    }
    
    public void setRecordingfile(String recordingfile) {
        this.recordingfile = recordingfile;
    }
    public String getCnum() {
        return this.cnum;
    }
    
    public void setCnum(String cnum) {
        this.cnum = cnum;
    }
    public String getCnam() {
        return this.cnam;
    }
    
    public void setCnam(String cnam) {
        this.cnam = cnam;
    }
    public String getOutboundCnum() {
        return this.outboundCnum;
    }
    
    public void setOutboundCnum(String outboundCnum) {
        this.outboundCnum = outboundCnum;
    }
    public String getOutboundCnam() {
        return this.outboundCnam;
    }
    
    public void setOutboundCnam(String outboundCnam) {
        this.outboundCnam = outboundCnam;
    }
    public String getDstCnam() {
        return this.dstCnam;
    }
    
    public void setDstCnam(String dstCnam) {
        this.dstCnam = dstCnam;
    }




}


