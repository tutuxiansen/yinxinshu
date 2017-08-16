package com.xhhy.domain;

import java.io.Serializable;
//简历管理
import java.util.Date;
public class ResumeBean implements Serializable{
	private int resumeId;
	private String resumePosition;		//应聘职位名称
	private String resumeCode;		//应聘职位编码
	private String resumeClass;		//职位分类
    private String resumeName;//	姓名
    private String resumeGender;	//性别
    private int resumeType;		//招聘类型
    private String resumeEmail;	//email
    private long resumePhone;		//联系电话
    private String resumeAddress;	//住址
    private String resumeIdentity;	//政治面貌
    private String resumeIdnumber;		//身份证号
    private String resumeCollege;	//毕业院校
    private String resumeEducation;		//学历
    private String resumeMajor;	//专业
    private String resumeExperience;	//工作经验
    private int resumeMoney;		//薪资要求
    private int resumeWork;		//是否在职
    private int resumeStudent;		//是否应届生
    private Date resumeTime ;		//登记时间
    private String resumeResume;		//个人履历
    private String resumeEnclosure;	//简历附件
    private int resumeRecommend;		//是否有人推荐面试
    private String resumeRecommender;	//推荐人
    private Date resumeRecommendTime;	//推荐时间
    private String resumeRecommendOpinion;	//推荐面试意见
    private int interviewType;		//简历状态
    private String interviewNameOne;	//一面面试人
    private Date interviewDateOne;		//一面面试时间
    private String interviewEvaluateOne;	//一面面试评价
    private String interviewNameTwo;	//二面面试
    private Date interviewDateTwo;		//二面面试时间
    private String interviewEvaluateTwo;	//二面面试评价
    private String interviewNameThree;//三面面试
    private Date interviewDateThree;	//三面面试时间
    private String interviewEvaluateThree;	//三面面试评价
    private String interviewDecision;	//录用决议
    private Date interviewDecisionTime;	//决议时间
    private int resumeLjsc;		//逻辑删除
	public int getResumeId() {
		return resumeId;
	}
	public void setResumeId(int resumeId) {
		this.resumeId = resumeId;
	}
	
	
	public String getResumePosition() {
		return resumePosition;
	}
	public void setResumePosition(String resumePosition) {
		this.resumePosition = resumePosition;
	}
	public String getResumeClass() {
		return resumeClass;
	}
	public void setResumeClass(String resumeClass) {
		this.resumeClass = resumeClass;
	}
	public String getResumeCode() {
		return resumeCode;
	}
	public void setResumeCode(String resumeCode) {
		this.resumeCode = resumeCode;
	}
	public String getResumeName() {
		return resumeName;
	}
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}
	public String getResumeGender() {
		return resumeGender;
	}
	public void setResumeGender(String resumeGender) {
		this.resumeGender = resumeGender;
	}
	public int getResumeType() {
		return resumeType;
	}
	public void setResumeType(int resumeType) {
		this.resumeType = resumeType;
	}
	public String getResumeEmail() {
		return resumeEmail;
	}
	public void setResumeEmail(String resumeEmail) {
		this.resumeEmail = resumeEmail;
	}

	
	public long getResumePhone() {
		return resumePhone;
	}
	public void setResumePhone(long resumePhone) {
		this.resumePhone = resumePhone;
	}
	public String getResumeAddress() {
		return resumeAddress;
	}
	public void setResumeAddress(String resumeAddress) {
		this.resumeAddress = resumeAddress;
	}
	public String getResumeIdentity() {
		return resumeIdentity;
	}
	public void setResumeIdentity(String resumeIdentity) {
		this.resumeIdentity = resumeIdentity;
	}
	
	
	
	public String getResumeIdnumber() {
		return resumeIdnumber;
	}
	public void setResumeIdnumber(String resumeIdnumber) {
		this.resumeIdnumber = resumeIdnumber;
	}
	public String getResumeCollege() {
		return resumeCollege;
	}
	public void setResumeCollege(String resumeCollege) {
		this.resumeCollege = resumeCollege;
	}
	
	
	public String getResumeEducation() {
		return resumeEducation;
	}
	public void setResumeEducation(String resumeEducation) {
		this.resumeEducation = resumeEducation;
	}
	public String getResumeMajor() {
		return resumeMajor;
	}
	public void setResumeMajor(String resumeMajor) {
		this.resumeMajor = resumeMajor;
	}
	public String getResumeExperience() {
		return resumeExperience;
	}
	public void setResumeExperience(String resumeExperience) {
		this.resumeExperience = resumeExperience;
	}
	public int getResumeMoney() {
		return resumeMoney;
	}
	public void setResumeMoney(int resumeMoney) {
		this.resumeMoney = resumeMoney;
	}
	public int getResumeWork() {
		return resumeWork;
	}
	public void setResumeWork(int resumeWork) {
		this.resumeWork = resumeWork;
	}
	public int getResumeStudent() {
		return resumeStudent;
	}
	public void setResumeStudent(int resumeStudent) {
		this.resumeStudent = resumeStudent;
	}
	public Date getResumeTime() {
		return resumeTime;
	}
	public void setResumeTime(Date resumeTime) {
		this.resumeTime = resumeTime;
	}
	public String getResumeResume() {
		return resumeResume;
	}
	public void setResumeResume(String resumeResume) {
		this.resumeResume = resumeResume;
	}
	public String getResumeEnclosure() {
		return resumeEnclosure;
	}
	public void setResumeEnclosure(String resumeEnclosure) {
		this.resumeEnclosure = resumeEnclosure;
	}
	public int getResumeRecommend() {
		return resumeRecommend;
	}
	public void setResumeRecommend(int resumeRecommend) {
		this.resumeRecommend = resumeRecommend;
	}
	public String getResumeRecommender() {
		return resumeRecommender;
	}
	public void setResumeRecommender(String resumeRecommender) {
		this.resumeRecommender = resumeRecommender;
	}
	public Date getResumeRecommendTime() {
		return resumeRecommendTime;
	}
	public void setResumeRecommendTime(Date resumeRecommendTime) {
		this.resumeRecommendTime = resumeRecommendTime;
	}
	public String getResumeRecommendOpinion() {
		return resumeRecommendOpinion;
	}
	public void setResumeRecommendOpinion(String resumeRecommendOpinion) {
		this.resumeRecommendOpinion = resumeRecommendOpinion;
	}
	public int getInterviewType() {
		return interviewType;
	}
	public void setInterviewType(int interviewType) {
		this.interviewType = interviewType;
	}
	public String getInterviewNameOne() {
		return interviewNameOne;
	}
	public void setInterviewNameOne(String interviewNameOne) {
		this.interviewNameOne = interviewNameOne;
	}
	public Date getInterviewDateOne() {
		return interviewDateOne;
	}
	public void setInterviewDateOne(Date interviewDateOne) {
		this.interviewDateOne = interviewDateOne;
	}

	
	public String getInterviewEvaluateOne() {
		return interviewEvaluateOne;
	}
	public void setInterviewEvaluateOne(String interviewEvaluateOne) {
		this.interviewEvaluateOne = interviewEvaluateOne;
	}
	
	
	public String getInterviewNameTwo() {
		return interviewNameTwo;
	}
	public void setInterviewNameTwo(String interviewNameTwo) {
		this.interviewNameTwo = interviewNameTwo;
	}
	public Date getInterviewDateTwo() {
		return interviewDateTwo;
	}
	public void setInterviewDateTwo(Date interviewDateTwo) {
		this.interviewDateTwo = interviewDateTwo;
	}
	public String getInterviewEvaluateTwo() {
		return interviewEvaluateTwo;
	}
	public void setInterviewEvaluateTwo(String interviewEvaluateTwo) {
		this.interviewEvaluateTwo = interviewEvaluateTwo;
	}
	public String getInterviewNameThree() {
		return interviewNameThree;
	}
	public void setInterviewNameThree(String interviewNameThree) {
		this.interviewNameThree = interviewNameThree;
	}
	public Date getInterviewDateThree() {
		return interviewDateThree;
	}
	public void setInterviewDateThree(Date interviewDateThree) {
		this.interviewDateThree = interviewDateThree;
	}
	public String getInterviewEvaluateThree() {
		return interviewEvaluateThree;
	}
	public void setInterviewEvaluateThree(String interviewEvaluateThree) {
		this.interviewEvaluateThree = interviewEvaluateThree;
	}
	public String getInterviewDecision() {
		return interviewDecision;
	}
	public void setInterviewDecision(String interviewDecision) {
		this.interviewDecision = interviewDecision;
	}
	public Date getInterviewDecisionTime() {
		return interviewDecisionTime;
	}
	public void setInterviewDecisionTime(Date interviewDecisionTime) {
		this.interviewDecisionTime = interviewDecisionTime;
	}
	public int getResumeLjsc() {
		return resumeLjsc;
	}
	public void setResumeLjsc(int resumeLjsc) {
		this.resumeLjsc = resumeLjsc;
	}
	
	
    
    

}
