/*
 * Distributed as part of c3p0 v.0.8.4-test1
 *
 * Copyright (C) 2003 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v2.c3p0;

import java.io.Serializable;
import java.sql.Connection;

/**
 *  ConnectionTesters should be Serializable, immutable, 
 *  and must have public, no-arg constructors
 */
public interface ConnectionTester extends Serializable
{
    public final static int CONNECTION_IS_OKAY       =  0;
    public final static int CONNECTION_IS_INVALID    = -1;
    public final static int DATABASE_IS_INVALID      = -8;

    public int activeCheckConnection(Connection c);

    public int statusOnException(Connection c, Throwable t);

    /**
     * Multiple testers that are of the same
     * class and use the same criteria for determining fatality
     * should test as equals().
     */
    public boolean equals( Object o );

    /**
     * keep consistent with equals()
     */
    public int hashCode();
}
