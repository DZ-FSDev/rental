package com.dz_fs_dev.rental.records.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * 
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
}
