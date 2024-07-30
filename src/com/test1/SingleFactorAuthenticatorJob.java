package com.test1;

public class SingleFactorAuthenticatorJob {
	private Integer sfaDeviceId;
	private String sfaDeviceName;
	private String sfaDeviceRegistry;
	private String sfaDeviceStartTime;
	private String sfaDeviceApprovedTime;
	private String sfaDeviceOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SingleFactorAuthenticatorJob() {

	}

	public SingleFactorAuthenticatorJob(Integer sfaDeviceId, String sfaDeviceName, String sfaDeviceRegistry,
			String sfaDeviceStartTime, String sfaDeviceApprovedTime, String sfaDeviceOwner, boolean authorizedDevice,
			String timeOutInSeconds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.sfaDeviceId = sfaDeviceId;
		this.sfaDeviceName = sfaDeviceName;
		this.sfaDeviceRegistry = sfaDeviceRegistry;
		this.sfaDeviceStartTime = sfaDeviceStartTime;
		this.sfaDeviceApprovedTime = sfaDeviceApprovedTime;
		this.sfaDeviceOwner = sfaDeviceOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSfaDeviceId() {
		return sfaDeviceId;
	}

	public void setSfaDeviceId(Integer sfaDeviceId) {
		this.sfaDeviceId = sfaDeviceId;
	}

	public String getSfaDeviceName() {
		return sfaDeviceName;
	}

	public void setSfaDeviceName(String sfaDeviceName) {
		this.sfaDeviceName = sfaDeviceName;
	}

	public String getSfaDeviceRegistry() {
		return sfaDeviceRegistry;
	}

	public void setSfaDeviceRegistry(String sfaDeviceRegistry) {
		this.sfaDeviceRegistry = sfaDeviceRegistry;
	}

	public String getSfaDeviceStartTime() {
		return sfaDeviceStartTime;
	}

	public void setSfaDeviceStartTime(String sfaDeviceStartTime) {
		this.sfaDeviceStartTime = sfaDeviceStartTime;
	}

	public String getSfaDeviceApprovedTime() {
		return sfaDeviceApprovedTime;
	}

	public void setSfaDeviceApprovedTime(String sfaDeviceApprovedTime) {
		this.sfaDeviceApprovedTime = sfaDeviceApprovedTime;
	}

	public String getSfaDeviceOwner() {
		return sfaDeviceOwner;
	}

	public void setSfaDeviceOwner(String sfaDeviceOwner) {
		this.sfaDeviceOwner = sfaDeviceOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
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
