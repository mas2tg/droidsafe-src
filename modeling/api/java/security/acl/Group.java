/*
 * Copyright (C) 2015,  Massachusetts Institute of Technology
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please email droidsafe@lists.csail.mit.edu if you need additional
 * information or have any questions.
 * 
 * 
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


/***** THIS FILE HAS BEEN MODIFIED FROM THE ORIGINAL BY THE DROIDSAFE PROJECT. *****/


package java.security.acl;

import droidsafe.annotations.*;
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import java.security.Principal;
import java.util.Enumeration;

/**
 * A {@code Principal} that represents a group of principals.
 *
 * @see Principal
 */
public interface Group extends Principal {

    /**
     * Adds a member to this group.
     *
     * @param user
     *            the member to add.
     * @return {@code true} if the member was added, {@code false} if it was already a member.
     */
    boolean addMember(Principal user);

    /**
     * Removes a member from this group.
     *
     * @param user
     *            the member to remove.
     * @return {@code true} if the member was removed, {@code false} if it was not a member.
     */
    boolean removeMember(Principal user);

    /**
     * Returns whether the specified principal is a member of this group.
     *
     * @param member
     *            the principal to check.
     * @return {@code true} if the principal is a member, otherwise {@code false}.
     */
    boolean isMember(Principal member);

    /**
     * Returns the members of this group.
     *
     * @return the members of this group.
     */
    Enumeration<? extends Principal> members();

}
