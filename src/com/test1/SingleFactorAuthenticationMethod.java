package com.test1;

public class SingleFactorAuthenticationMethod {
	private Integer sfaAuthId;
	private String authMethod;
	private boolean oauth2Support;
	private String jwtSubject;
	private String issuer;
	private String audience;
	private long issuedAt;
	private String federalIdentitySupport;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SingleFactorAuthenticationMethod() {

	}

	public SingleFactorAuthenticationMethod(Integer sfaAuthId, String authMethod, boolean oauth2Support,
			String jwtSubject, String issuer, String audience, long issuedAt, String federalIdentitySupport,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.sfaAuthId = sfaAuthId;
		this.authMethod = authMethod;
		this.oauth2Support = oauth2Support;
		this.jwtSubject = jwtSubject;
		this.issuer = issuer;
		this.audience = audience;
		this.issuedAt = issuedAt;
		this.federalIdentitySupport = federalIdentitySupport;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSfaAuthId() {
		return sfaAuthId;
	}

	public void setSfaAuthId(Integer sfaAuthId) {
		this.sfaAuthId = sfaAuthId;
	}

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public boolean isOauth2Support() {
		return oauth2Support;
	}

	public void setOauth2Support(boolean oauth2Support) {
		this.oauth2Support = oauth2Support;
	}

	public String getJwtSubject() {
		return jwtSubject;
	}

	public void setJwtSubject(String jwtSubject) {
		this.jwtSubject = jwtSubject;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public long getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(long issuedAt) {
		this.issuedAt = issuedAt;
	}

	public String getFederalIdentitySupport() {
		return federalIdentitySupport;
	}

	public void setFederalIdentitySupport(String federalIdentitySupport) {
		this.federalIdentitySupport = federalIdentitySupport;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}