/*
 * DirectProviderJobManager.java
 * Created: 13 Feb 2018
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

package sif3.infra.common.env.mgr;

import sif3.common.CommonConstants.AdapterType;
import sif3.infra.common.env.types.EnvironmentInfo;
import sif3.infra.common.interfaces.ProviderJobManager;

/**
 * @author Joerg Huber
 *
 */
public class DirectProviderJobManager extends BaseProviderJobManager implements ProviderJobManager
{
    /*
     * Constructor: Create an Job manager for the given environment.
     */
    public DirectProviderJobManager(EnvironmentInfo environmentInfo)
    {
        super(environmentInfo);
    }

    /*-----------------------*/
    /*-- Interface Methods --*/
    /*-----------------------*/

    /* (non-Javadoc)
     * @see sif3.infra.common.interfaces.JobManager#getAdapterType()
     */
    @Override
    public AdapterType getAdapterType()
    {
        return AdapterType.ENVIRONMENT_PROVIDER;
    }

    /*---------------------*/
    /*-- Private methods --*/
    /*---------------------*/
}
