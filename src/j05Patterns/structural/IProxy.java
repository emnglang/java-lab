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
 * <b>Proxy Design Pattern</b>: Provide a surrogate or placeholder for 
 * another object to control access to it. (Gamma et al, Design Patterns)
 * <br/><br/>
 * 
 * <b>Responsibility</b> Abstract definition of the "Proxy": <br/>
 * <br/>
 * <ul>
 * <li>maintains a reference that lets the proxy access the real subject. 
 * Proxy may refer to a Subject if the RealSubject and Subject interfaces are 
 * the same.</li>
 * <li>provides an interface identical to Subject's so that a proxy can be 
 * substituted for for the real subject.</li>
 * <li>controls access to the real subject and may be responsible for 
 * creating and deleting it.</li>
 * <li>other responsibilites depend on the kind of proxy:
 * <ul>
 * <li>remote proxies are responsible for encoding a request and 
 * its arguments and for sending the encoded request to the real 
 * subject in a different address space.</li>
 * <li>virtual proxies may cache additional information about the 
 * real subject so that they can postpone accessing it. For example, 
 * the ImageProxy from the Motivation caches the real images's 
 * extent.</li>
 * <li>protection proxies check that the caller has the access 
 * permissions required to perform a request.</li>
 * </ul>
 * </ul>
 *
 * @param <S> <code>Subject</code> element type
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 25, 2007 3:06:58 PM $
 */
public 
interface IProxy<S>
extends ISurrogate<S>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns the <code>Proxy</code> wrapper instance
     * 
     * @return <code>Proxy</code> wrapper instance
     */
    public S
    getSubject();

    //------------------------------------------------------------------------
    /**
     * Returns the actual wrapped <code>Subject</code> instance
     * 
     * @return actual wrapped <code>Subject</code> instance
     */
    public S
    getRealSubject();
}
