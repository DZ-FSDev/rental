package com.dz_fs_dev.rental.interfaces.records;

import java.net.URL;

/**
 * The user of this interface should implement a representation of a
 * jurisdiction. The jurisdiction would support returning the URL
 * to the jurisdiction as well as referencing any statutes that apply.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public interface IJurisdiction {
	/**
	 * Returns the URL to the Jurisdiction.
	 * 
	 * @return The URL to the Jurisdiction.
	 */
	public URL getWebsite();
	
	/**
	 * Returns an array containing the different applicable statues.
	 * 
	 * @return An array containing the different applicable statues.
	 */
	public String[] getApplicableStatues();
}
