package DTO;

public class UserDTO {
  private String UserID;
	private String UserName;
	private String Email;
	private String PhoneNumber;
	private String UserSNN;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String userID, String userName, String email, String phoneNumber, String userSNN) {
		this.UserID = userID;
		this.UserName = userName;
		this.Email = email;
		this.PhoneNumber = phoneNumber;
		this.UserSNN = userSNN;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		this.UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getUserSNN() {
		return UserSNN;
	}

	public void setUserSNN(String userSNN) {
		this.UserSNN = userSNN;
	}
	
}
