//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IStrategy.java Copyright (c) 2009 Giovanni Azua Garcia
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
package j05Patterns.behavioral;

/**
 * <b>Strategy Design Pattern</b>: Define a family of algorithms, encapsulate 
 * each one, and make them interchangeable. Strategy lets the algorithm vary 
 * independently from clients that use it.<br/>
 * <br/>
 * 
 * <b>Responsibility</b>: Abstract definition of the "Strategy"
 * 
 * <ul>
 * <li>declares an interface common to all supported algorithms. Context uses 
 * this interface to call the algorithm defined by a ConcreteStrategy</li>
 * </ul>
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 6, 2007 9:59:45 PM $
 */
public 
interface IStrategy
{
    // marker interface
}
