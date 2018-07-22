//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// ISurrogate.java Copyright (c) 2009 Giovanni Azua Garcia
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

import java.lang.reflect.*;

/**
 * Base abstraction for any Design Pattern type whose structure is based on 
 * surrogation or wrapping. Surrogate Design Patterns are those that for some 
 * purpose wrap and provide to clients the same interface view of the actual 
 * wrapped <code>Component</code> interface. <br/><br/>
 * 
 * Structural surrogate Patterns are:
 * 
 * <ul>
 * <li>Adapter Pattern</li>
 * <li>Composite Pattern</li>
 * <li>Decorator Pattern</li>
 * <li>Proxy Pattern</li>
 * </ul>
 * 
 * @param <C> <code>Component</code> or wrapper element type
 *
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Apr 5, 2008 3:44:45 PM $
 */
public 
interface ISurrogate<C>
extends InvocationHandler
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns the <code>Component</code> interface view <code>&lt;C&gt;</code> 
     * of this <code>ISurrogate</code><br/><br/>
     * Client code calls this method to receive an instance of type <code
     * >&lt;C&gt;</code> making accessible the Component business methods 
     * while the underlying implementation is wrapped by this surrogate. 
     * 
     * @return <code>Component</code> interface view <code>&lt;C&gt;</code> 
     *         of this <code>ISurrogate</code> type
     */
    public C
    getComponent();    
}
