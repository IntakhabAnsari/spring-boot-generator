package com.ashokit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CUSTOMER_DTLS")
@Data
public class CustomerDtlsEntity {
		@Id
		@SequenceGenerator(name="abc",
		                   sequenceName="CUSTOMER_ID_SEQ",
		                   allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="abc")
		private Integer customerId;
		private String customerName;
		private String customerEmail;
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerEmail() {
			return customerEmail;
		}
		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}
		@Override
		public String toString() {
			return "CustomerDtlsEntity [customerId=" + customerId + ", customerName=" + customerName
					+ ", customerEmail=" + customerEmail + "]";
		}
		
		
}
