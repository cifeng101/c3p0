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


package com.mchange.v2.c3p0.impl;

import java.lang.String;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import com.mchange.v1.util.ClosableResource;

abstract class C3P0Statement implements Statement, ClosableResource
{
    final Statement inner;

    public C3P0Statement(Statement inner)
    {
       this.inner = inner;
    }


    public void close() throws SQLException
    {
        inner.close();
    }

    public boolean execute(String a) throws SQLException
    {
        return inner.execute(a);
    }

    public Connection getConnection() throws SQLException
    {
        return inner.getConnection();
    }

    public SQLWarning getWarnings() throws SQLException
    {
        return inner.getWarnings();
    }

    public void clearWarnings() throws SQLException
    {
        inner.clearWarnings();
    }

    public void setFetchDirection(int a) throws SQLException
    {
        inner.setFetchDirection(a);
    }

    public int getFetchDirection() throws SQLException
    {
        return inner.getFetchDirection();
    }

    public void setFetchSize(int a) throws SQLException
    {
        inner.setFetchSize(a);
    }

    public int getFetchSize() throws SQLException
    {
        return inner.getFetchSize();
    }

    public ResultSet getResultSet() throws SQLException
    {
        return inner.getResultSet();
    }

    public ResultSet executeQuery(String a) throws SQLException
    {
        return inner.executeQuery(a);
    }

    public int executeUpdate(String a) throws SQLException
    {
        return inner.executeUpdate(a);
    }

    public int getMaxFieldSize() throws SQLException
    {
        return inner.getMaxFieldSize();
    }

    public void setMaxFieldSize(int a) throws SQLException
    {
        inner.setMaxFieldSize(a);
    }

    public int getMaxRows() throws SQLException
    {
        return inner.getMaxRows();
    }

    public void setMaxRows(int a) throws SQLException
    {
        inner.setMaxRows(a);
    }

    public void setEscapeProcessing(boolean a) throws SQLException
    {
        inner.setEscapeProcessing(a);
    }

    public int getQueryTimeout() throws SQLException
    {
        return inner.getQueryTimeout();
    }

    public void setQueryTimeout(int a) throws SQLException
    {
        inner.setQueryTimeout(a);
    }

    public void cancel() throws SQLException
    {
        inner.cancel();
    }

    public void setCursorName(String a) throws SQLException
    {
        inner.setCursorName(a);
    }

    public int getUpdateCount() throws SQLException
    {
        return inner.getUpdateCount();
    }

    public boolean getMoreResults() throws SQLException
    {
        return inner.getMoreResults();
    }

    public int getResultSetConcurrency() throws SQLException
    {
        return inner.getResultSetConcurrency();
    }

    public int getResultSetType() throws SQLException
    {
        return inner.getResultSetType();
    }

    public void addBatch(String a) throws SQLException
    {
        inner.addBatch(a);
    }

    public void clearBatch() throws SQLException
    {
        inner.clearBatch();
    }

    public int[] executeBatch() throws SQLException
    {
        return inner.executeBatch();
    }

    public String toString()
    { return super.toString() + "[ " + inner.toString() + " ]"; }

}

