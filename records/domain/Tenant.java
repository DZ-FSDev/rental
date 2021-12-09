package com.dz_fs_dev.rental.records.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Basic domain object representing a tenant.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
@Entity
public class Tenant implements Serializable {
	/**
	 * @since 0.0.1
	 */
	private static final long serialVersionUID = -8276880885834517846L;

	private @Getter @Setter @GeneratedValue @Id long tenantId;
	private @Getter @Setter @Column(nullable = false) String name;
	private @Getter @Setter @Column(nullable = false) String address;
	private @Getter @Setter @Column(nullable = false) String eMail;
	private @Getter @Setter @Column(nullable = false) String cellPhone;
	
	@Override
	public int hashCode() {
		final int prime = 711;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cellPhone == null) ? 0 : cellPhone.hashCode());
		result = prime * result + ((eMail == null) ? 0 : eMail.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (tenantId ^ (tenantId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Tenant))
			return false;
		Tenant other = (Tenant) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cellPhone == null) {
			if (other.cellPhone != null)
				return false;
		} else if (!cellPhone.equals(other.cellPhone))
			return false;
		if (eMail == null) {
			if (other.eMail != null)
				return false;
		} else if (!eMail.equals(other.eMail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tenantId != other.tenantId)
			return false;
		return true;
	}
}
