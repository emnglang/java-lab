//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IFactoryMethod.java Copyright (c) 2009 Giovanni Azua Garcia
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
package j05Patterns.creational;

/**
 * <b>Factory Method Design Pattern</b>: Define an interface for creating an
 * object, but let subclasses decide which class to instantiate. 
 * Factory Method lets a class defer instantiation to subclasses.
 * (Gamma et al, Design Patterns)
 * <br/><br/>
 * 
 * <b>Responsibility</b> Abstract definition of the "Creator": <br/>
 * <br/>
 * <ul>
 * <li>Declares the factory method, which returns an object of type 
 * Product.</li> 
 * <li>Creator may also define a default implementation of the factory 
 * method that returns a default ConcreteProduct object.
 * may call the factory method to create a Product object.</li>
 * </ul>
 * 
 * <br/>
 * Example usage:
 * <pre><code>
 * import org.perfectjpattern.core.api.creational.factorymethod.*;
 *       
 *  //
 *  // Example of Factory Method subtype that creates Product with a
 *  // name parameter. 
 *  //
 *  public IProductFactory
 *  extends IFactoryMethod&lt;Product&gt;
 *  {
 *      //--------------------------------------------------------------------
 *      // public
 *      //--------------------------------------------------------------------
 *      public void
 *      setName(String aName);          
 *  } 
 * 
 * </code></pre>
 * @param <T> Type of elements created.
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jun 19, 2007 11:01:51 PM $
 */
public 
interface IFactoryMethod<T>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns newly created instance
     * 
     * @return Newly created instance
     */
    T create();    
}
