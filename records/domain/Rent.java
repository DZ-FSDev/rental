package com.dz_fs_dev.rental.records.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Basic domain object representing rent to be paid by a tenant.
 * 
 * @author DZ-FSDev
 * @version 0.0.1
 */
@Entity
public class Rent implements Serializable {
	private static final long serialVersionUID = 7437522577109015377L;
	
	private @Getter @Setter @GeneratedValue @Id Long rentId;
	private @Getter @Setter @Column(scale = 2, nullable = false, updatable = false) BigDecimal amount;
	private @Getter @Setter @Column(nullable = false, updatable = false) long effectiveStart;
	private @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "rent") List<Contract> contracts;
	
	/**
	 * Zero-arg constructor for the Rent domain object
	 */
	public Rent() {}

	@Override
	public int hashCode() {
		final int prime = 577;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((contracts == null) ? 0 : contracts.hashCode());
		result = prime * result + (int) (effectiveStart ^ (effectiveStart >>> 32));
		result = prime * result + ((rentId == null) ? 0 : rentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rent))
			return false;
		Rent other = (Rent) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (contracts == null) {
			if (other.contracts != null)
				return false;
		} else if (!contracts.equals(other.contracts))
			return false;
		if (effectiveStart != other.effectiveStart)
			return false;
		if (rentId == null) {
			if (other.rentId != null)
				return false;
		} else if (!rentId.equals(other.rentId))
			return false;
		return true;
	}
}
