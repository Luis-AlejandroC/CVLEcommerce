package com.carvajal.ecmc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name= "Usuarios")
public class User {
		@Id
		@GeneratedValue (strategy= GenerationType.IDENTITY)
		private Integer userId;
		private String fullName;
		private String nickName;
		private String email;
		private String userHomeAdress;
		private String cellPhone;
		private String userPassword;
		private String kindOfUser;
		private String adress;
		
		//JPA attribute
		@OneToMany(mappedBy = "user")
		private List<Product> products;
		
		@OneToMany(mappedBy = "user")
		private List<Order> orders;
		public User() {
			
		}

		//Getter and setter User
		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
		}


		public String getFullName() {
			return fullName;
		}


		public void setFullName(String fullName) {
			this.fullName = fullName;
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

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		//print user values
		@Override
		
		public String toString() {
			return "User [userId=" + userId + ", fullName=" + fullName + ", nickName=" + nickName + ", email=" + email
					+ ", userHomeAdress=" + userHomeAdress + ", cellPhone=" + cellPhone + ", userPassword="
					+ userPassword + ", kindOfUser=" + kindOfUser + ", adress=" + adress + "]";
		}
		
		
}
