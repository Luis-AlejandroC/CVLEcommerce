package com.carvajal.ecmc.model;

public class User {

		private Integer userId;
		private String fulName;
		private String nickName;
		private String email;
		private String userHomeAdress;
		private String cellPhone;
		private String userPassword;
		private String kindOfUser;
		private String adress;
		
		
		public User() {
			
		}

		//Getter and setter User
		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public String getFulName() {
			return fulName;
		}


		public void setFulName(String fulName) {
			this.fulName = fulName;
		}


		public String getNickName() {
			return nickName;
		}


		public void setNickName(String nickName) {
			this.nickName = nickName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getUserHomeAdress() {
			return userHomeAdress;
		}


		public void setUserHomeAdress(String userHomeAdress) {
			this.userHomeAdress = userHomeAdress;
		}


		public String getCellPhone() {
			return cellPhone;
		}


		public void setCellPhone(String cellPhone) {
			this.cellPhone = cellPhone;
		}


		public String getUserPassword() {
			return userPassword;
		}


		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}


		public String getKindOfUser() {
			return kindOfUser;
		}


		public void setKindOfUser(String kindOfUser) {
			this.kindOfUser = kindOfUser;
		}


		public String getAdress() {
			return adress;
		}


		public void setAdress(String adress) {
			this.adress = adress;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", fulName=" + fulName + ", nickName=" + nickName + ", email=" + email
					+ ", userHomeAdress=" + userHomeAdress + ", cellPhone=" + cellPhone + ", userPassword="
					+ userPassword + ", kindOfUser=" + kindOfUser + ", adress=" + adress + "]";
		}
		
		
}
