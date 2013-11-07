/*
 * EnvironmentZoneContextInfo.java
 * Created: 17/10/2013
 *
 * Copyright 2013 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package sif3.common.model;

import java.io.Serializable;

/**
 * This class links up environment with its zone and context. In SIF3 each environment has a number of services that are valid in
 * a given zone and context. To enable that link this class is used.
 * 
 * @author Joerg Huber
 */
public class EnvironmentZoneContextInfo implements Serializable
{
    private static final long serialVersionUID = 2062088818816762019L;
    
    private String environmentName = null;
    private SIFZone zone = null;
    private SIFContext context = null;
        
    public EnvironmentZoneContextInfo(String environmentName)
    {
    	this(environmentName, (SIFZone)null, (SIFContext)null);
    }
    
    public EnvironmentZoneContextInfo(String environmentName, SIFZone zone)
    {
    	this(environmentName, zone, (SIFContext)null);
    }
    
    public EnvironmentZoneContextInfo(String environmentName, SIFZone zone, SIFContext context)
    {
    	super();
    	setEnvironmentName(environmentName);
    	setZone(zone);
    	setContext(context);
    }
    public EnvironmentZoneContextInfo(String environmentName, String zoneID)
    {
    	this(environmentName, new SIFZone(zoneID), (SIFContext)null);
    }

    public EnvironmentZoneContextInfo(String environmentName, String zoneID, String contextID)
    {
    	this(environmentName, new SIFZone(zoneID), new SIFContext(contextID));
    }

    public String getEnvironmentName()
    {
    	return this.environmentName;
    }
	
	public void setEnvironmentName(String environmentName)
    {
    	this.environmentName = environmentName;
    }
	
	public SIFZone getZone()
    {
    	return this.zone;
    }
	
	public void setZone(SIFZone zone)
    {
    	this.zone = zone;
    }
	
	public SIFContext getContext()
    {
    	return this.context;
    }
	
	public void setContext(SIFContext context)
    {
    	this.context = context;
    }
	
	@Override
    public String toString()
    {
	    return "EnvironmentZoneContextInfo [environmentName=" + this.environmentName + ", zone="
	            + this.zone + ", context=" + this.context + "]";
    }

}
