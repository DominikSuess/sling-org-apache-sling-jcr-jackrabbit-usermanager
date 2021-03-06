/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.jackrabbit.usermanager;

import java.util.List;

import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.servlets.post.Modification;

/**
 * The <code>DeleteAuthorizables</code> service api.
 * <p>
 * This interface is not intended to be implemented by bundles. It is
 * implemented by this bundle and may be used by client bundles.
 * </p>
 * 
 * @since 2.2.0
 */
public interface DeleteAuthorizables {

    /**
     * Deletes one or more users or groups from the repository
     * 
     * @param jcrSession the JCR session of the user creating the user
     * @param baseResource the base resource to calculate the relative paths from (required)
     * @param paths An array of relative resource paths to Authorizables to be deleted (required)
     * @param changes The list of changes for this operation (optional)
     * @throws RepositoryException if authorizable (user or group) can't be deleted
     */
    public void deleteAuthorizables(Session jcrSession,
                            Resource baseResource,
                            String [] paths,
                            List<Modification> changes
                ) throws RepositoryException;
    
}
