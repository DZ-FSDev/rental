package com.dz_fs_dev.rental.records.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Basic domain object representing a contract between the tenant(s) and landlord.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
@Entity
public class Contract implements Serializable{
	/**
	 * @since 0.0.1
	 */
	private static final long serialVersionUID = 5429449447294803168L;

	private @Getter @Setter @GeneratedValue @Id long contractId;
	private @Getter @Setter @OneToMany(fetch = FetchType.LAZY) @ElementCollection(targetClass = Tenant.class) Set<Tenant> tenant;
	private @Getter @Setter @OneToOne(fetch = FetchType.LAZY, optional = false) Landlord landlord;
	private @Getter @Setter @OneToOne(fetch = FetchType.LAZY, optional = false) Rent rent;
	
	/**
	 * @since 0.0.1
	 */
	@Override
	public int hashCode() {
		final int prime = 2959841;
		int result = 1;
		result = prime * result + (int) (contractId ^ (contractId >>> 32));
		result = prime * result + ((landlord == null) ? 0 : landlord.hashCode());
		result = prime * result + ((rent == null) ? 0 : rent.hashCode());
		result = prime * result + ((tenant == null) ? 0 : tenant.hashCode());
		return result;
	}
	
	/**
	 * @since 0.0.1
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contract))
			return false;
		Contract other = (Contract) obj;
		if (contractId != other.contractId)
			return false;
		if (landlord == null) {
			if (other.landlord != null)
				return false;
		} else if (!landlord.equals(other.landlord))
			return false;
		if (rent == null) {
			if (other.rent != null)
				return false;
		} else if (!rent.equals(other.rent))
			return false;
		if (tenant == null) {
			if (other.tenant != null)
				return false;
		} else if (!tenant.equals(other.tenant))
			return false;
		return true;
	}
}
