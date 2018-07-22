//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IDecorator.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * <b>Decorator Design Pattern</b>: Attach additional responsibilities to an 
 * object dynamically. Decorators provide a flexible alternative to 
 * subclassing for extending functionality. (Gamma et al, Design Patterns)
 * <br/><br/>
 * 
 * <b>Responsibility</b> Abstract definition of the "Decorator": <br/>
 * <br/>
 * <ul>
 * <li>maintains a reference to a Component object and defines an interface 
 * that conforms to Component's interface.</li> 
 * </ul>
 *
 * <b>Note:</b> Concrete decorator implementations that offer added 
 * functionality i.e. additional methods, must ensure implementing 
 * the delta <code>&lt;D&gt; - &lt;C&gt;</code> otherwise a 
 * {@link NoSuchMethodError} will occur. This was a deliberate choice towards 
 * more flexibility rather than stronger type safety.  Note that {@link #
 * getComponent()} will return the <code>Decorator</code> and not the 
 * <code>Component</code> type, therefore the concrete <code>Decorator</code> 
 * should implement the delta functionality. See the Decorator example code 
 * for details.
 * <br/><br/> 
 * @see ISurrogate
 * @param <C> <code>Component</code> element type. Interface type 
 *        being decorated. 
 * @param <D> <code>Decorator</code> element type. This type covers the 
 *        following two use-cases: 
 *        <ul>
 *        <li>If the Decorator does not offer added functionality then 
 *        this type is the same as &lt;C&gt;</li>
 *        <li>Otherwise &lt;D&gt; will be a subclass of &lt;C&gt; that 
 *        is, it will comply to &lt;C&gt; and offer extra functionality</li>
 *        </ul>
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 25, 2007 3:06:58 PM $
 */
public 
interface IDecorator<C, D extends C>
extends ISurrogate<D>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns the actual decorated <code>Component</code> instance
     * 
     * @return actual decorated <code>Component</code> instance
     */
    public C
    getDecorated();
}
