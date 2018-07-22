//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IAdaptingStrategy.java Copyright (c) 2009 Giovanni Azua Garcia
// bravegag@hotmail.com
//  
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 3
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, see <http://www.gnu.org/licenses/>.
//
//----------------------------------------------------------------------
package j05Patterns.structural;

import j05Patterns.behavioral.IStrategy;

import java.lang.reflect.Method;

/**
 * Abstract definition of the adapting strategy to use e.g.
 * <ul>
 * <li>Signature exact matching: the Adaptee and Target methods (name and 
 * parameters) must match or at least the Adaptee methods must be a subset 
 * of Target methods</li>
 * <li>Signature types matching: the Adaptee and Target methods must 
 * match or at least the Adaptee methods must be a subset of the type 
 * signature of the Target methods</li>
 * <li>Names mapping: The user defines dynamically the correspondence 
 * between methods in Adaptee and Target by name</li>
 * </ul> 
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Jan 28, 2009 1:00:42 PM $
 */
public 
interface IAdaptingStrategy
extends IStrategy
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * According to the definition of this strategy validates the tuple <code>
     * Target</code>/<code>Adaptee</code>. Should the two not match an 
     * {@link NoSuchMethodError} will be thrown.
     * 
     * @param aTargetClass Target class type
     * @param anAdaptee Adaptee instance 
     * @param anAdapter Adapter instance 
     * @throws NoSuchMethodError 
     */
    public void
    validate(Class<?> aTargetClass, Object anAdaptee, Object anAdapter)
    throws NoSuchMethodError;

    //------------------------------------------------------------------------
    /**
     * Returns the <code>Adaptee</code> or otherwise <code>Adapter</code> method
     * that corresponds to the given <code>Target</code> class type. If the 
     * corresponding method is not found an {@link NoSuchMethodError} will 
     * be thrown.
     * 
     * @see #validate(Class, Object, Object)
     *
     * @param aTargetClass Target class type
     * @param anAdaptee Adaptee instance
     * @param anAdapter Adapter instance
     * @param aTargetMethod Target method to search for in the Adaptee
     * @return <code>Adaptee</code> method that corresponds to the given
     *         <code>Target</code> class type
     * @throws NoSuchMethodError
     */
    public Method
    resolve(Class<?> aTargetClass, Object anAdaptee, Object anAdapter, 
        Method aTargetMethod)
    throws NoSuchMethodError;
}
