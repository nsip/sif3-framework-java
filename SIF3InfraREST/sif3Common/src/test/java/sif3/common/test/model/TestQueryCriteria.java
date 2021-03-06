/*
 * TestQueryCriteria.java
 * Created: 8 Dec 2015
 *
 * Copyright 2015 Systemic Pty Ltd
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

package sif3.common.test.model;

import sif3.common.model.QueryCriteria;

/**
 * @author Joerg Huber
 *
 */
public class TestQueryCriteria
{
    public static void main(String[] argv)
    {
        System.out.println(new QueryCriteria("/SchoolInfos/1234-1245/StudentPersonal"));
        System.out.println(new QueryCriteria("SchoolInfos;"));
        System.out.println(new QueryCriteria("SchoolInfos/1234-1245/StudentPersonals/9876-0998AF/StudentDailyAttendances;zoneId=ABC;contextId=DEFAULT?myParam=7"));
    }   
}
