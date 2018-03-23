package com.pwc.chim.audrey.util;

import java.util.Map;

import org.apache.commons.dbcp2.BasicDataSource;

public class ExtendedBasicDataSource extends BasicDataSource {
	
	public void setEncryptConnectionProperty(Map<String, String> encryptConnectionProperty) {
		addConnectionProperty("CONNECTION_PROPERTY_THIN_NET_ENCRYPTION_LEVEL", (String) encryptConnectionProperty.get("CONNECTION_PROPERTY_THIN_NET_ENCRYPTION_LEVEL"));
		addConnectionProperty("CONNECTION_PROPERTY_THIN_NET_ENCRYPTION_TYPES", (String) encryptConnectionProperty.get("CONNECTION_PROPERTY_THIN_NET_ENCRYPTION_TYPES"));
		addConnectionProperty("CONNECTION_PROPERTY_THIN_NET_CHECKSUM_LEVEL", (String) encryptConnectionProperty.get("CONNECTION_PROPERTY_THIN_NET_CHECKSUM_LEVEL"));
		addConnectionProperty("CONNECTION_PROPERTY_THIN_NET_CHECKSUM_TYPES", (String) encryptConnectionProperty.get("CONNECTION_PROPERTY_THIN_NET_CHECKSUM_TYPES"));
	}
}