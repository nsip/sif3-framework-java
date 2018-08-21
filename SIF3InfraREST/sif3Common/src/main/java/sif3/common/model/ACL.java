/*
 * ACL.java
 * Created: 11 Jan 2018
 *
 * Copyright 2018 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License. 
 */

package sif3.common.model;

import java.io.Serializable;
import java.util.HashMap;

import sif3.common.CommonConstants.RightType;

/**
 * @author Joerg Huber
 *
 */
public abstract class ACL implements Serializable
{
    private static final long serialVersionUID = -7589657216577175353L;

    public enum AccessType {APPROVED, SUPPORTED, REJECTED, REQUESTED, UNSUPPORTED};
    
    public enum AccessRight {QUERY, CREATE, UPDATE, DELETE, PROVIDE, SUBSCRIBE, ADMIN};
    
    private HashMap<AccessRight, AccessType> rights = new HashMap<AccessRight, AccessType>();
    
    public abstract RightType getRightType();

    public HashMap<AccessRight, AccessType> getRights()
    {
        return this.rights;
    }

    public void setRights(HashMap<AccessRight, AccessType> rights)
    {
        this.rights = rights;
    }
    
    public void addRight(AccessRight right, AccessType accessType)
    {
        rights.put(right, accessType);
    }
    
    public boolean hasRight(AccessRight right, AccessType accessType)
    {
        AccessType accessExists = rights.get(right);
        if (accessExists != null)
        {
            return accessExists == accessType;
        }
        else
        {
            return false;
        }
    }
    
    public AccessType getAccessType(AccessRight right)
    {
        return rights.get(right);
    }

    @Override
    public String toString()
    {
        return "ACL [rights=" + rights + ", getRightType()=" + getRightType() + "]";
    }
    
    
}
