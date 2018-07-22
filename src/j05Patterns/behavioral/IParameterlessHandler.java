//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IParameterlessHandler.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * <b>Chain of Responsibility Design Pattern</b>: Avoid coupling the sender of
 * a request to its receiver by giving more than one object a chance to handle
 * the request. Chain the receiving objects and pass the request along the chain
 * until an object handles it. (Gamma et al, Design Patterns)<br/>
 * <br/>
 * 
 * <b>Responsibility</b>: Abstract definition of the "Handler".
 * 
 * <ul>
 * <li>Defines an interface for handling requests.</li>
 * <li>Implements the Successor link.</li>
 * </ul>
 * 
 * <br/>
 * Example usage:
 * <pre><code>
 *    //
 *    // Create chain elements 
 *    //  
 *    IParameterlessHandler myFirst = new ConcreteHandler();
 *    IParameterlessHandler mySecond = new ConcreteHandler();
 *    IParameterlessHandler myThird = new ConcreteHandler();
 *    
 *    //
 *    // Associate Handler elements 
 *    //
 *    myFirst.setSuccessor(mySecond);
 *    mySecond.setSuccessor(myThird);
 *    
 *    //
 *    // Execute the first Handler that triggers the execution of the 
 *    // complete chain.
 *    //
 *    myFirst.start();
 * </code></pre>
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 6, 2007 6:14:22 PM $
 */
public 
interface IParameterlessHandler
extends IHandler<NullRequest>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Triggers execution of the Chain if the target Handler is the first 
     * reference, otherwise implements the decision-making regarding forwarding
     * the request to its successor <code>IHandler</code> instance.
     */
    public void
    start();

    //------------------------------------------------------------------------
    /**
     * Handle the given request. Implements the actual handling logic and must 
     * not contain any decision-making regarding e.g. forwarding the request.
     */
    public void
    handle();
}
