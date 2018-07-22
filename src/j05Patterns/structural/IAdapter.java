//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IAdapter.java Copyright (c) 2009 Giovanni Azua Garcia
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

/**
 * <b>Adapter Design Pattern</b>: Convert the interface of a class into another 
 * interface clients expect. Adapter lets classes work together that couldn't 
 * otherwise because of incompatible interfaces.
 * <br/><br/>
 * 
 * <b>Responsibility</b> Abstract definition of the "Adapter": 
 * <br/>
 * <ul>
 * <li>adapts the interface Adaptee to the Target interface.</li> 
 * </ul>
 *
 * @param <T> <code>Target</code> element type
 * @param <A> <code>Adaptee</code> element type
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Jan 28, 2009 12:51:08 PM $
 */
public 
interface IAdapter<T, A>
extends ISurrogate<T>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns the <code>Target</code> instance
     * 
     * @return <code>Target</code> instance
     */
    public T
    getTarget();    

    //------------------------------------------------------------------------
    /**
     * Returns the <code>Adaptee</code> instance
     * 
     * @return <code>Adaptee</code> instance
     */
    public A
    getAdaptee();
    
    //------------------------------------------------------------------------
    /**
     * Sets the adapting strategy e.g. exact, name, user-defined
     * 
     * @param anAdaptingStrategy {@link IAdaptingStrategy} instance to assign
     * @throws IllegalArgumentException 'anAdaptingStrategy' must not be null
     */
    public void
    setAdaptingStrategy(IAdaptingStrategy anAdaptingStrategy)
    throws IllegalArgumentException;
}
