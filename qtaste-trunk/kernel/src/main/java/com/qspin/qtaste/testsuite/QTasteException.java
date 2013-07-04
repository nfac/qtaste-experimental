/*
    Copyright 2007-2009 QSpin - www.qspin.be

    This file is part of QTaste framework.

    QTaste is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    QTaste is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with QTaste. If not, see <http://www.gnu.org/licenses/>.
*/

/*
 * QTasteException.java
 *
 * Created on 23 octobre 2007, 10:31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.qspin.qtaste.testsuite;

/**
 *
 * @author lvboque
 */
@SuppressWarnings("serial")
public class QTasteException extends Exception {
    
    /** Creates a new instance of QTasteException */
    public QTasteException(String message) {
        super(message);
    }

    public QTasteException(String message, Throwable e) {
        super(message, e);
    }
}