/*
 * PhaseDataResponse.java
 * Created: 19 Jun 2018
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

package sif3.common.ws.job;

import javax.ws.rs.core.Response.Status;

import sif3.common.model.PayloadMetadata;
import sif3.common.model.StringPayload;

/**
 * @author Joerg Huber
 *
 */
public class PhaseDataResponse extends StringPayload
{
    private static final long serialVersionUID = 3148009552559307122L;
    
    public Status status = null;

    public PhaseDataResponse()
    {
        this(null, null, null);
    }
    
    public PhaseDataResponse(String data, PayloadMetadata payloadMetadata, Status status)
    {
        super(data, payloadMetadata);
        setStatus(status);
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "PhaseDataResponse [status=" + status + ", toString()=" + super.toString() + "]";
    }
}
