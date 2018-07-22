//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IReceiver.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * <b>Command Design Pattern</b>: Encapsulate a request as an object, 
 * thereby letting you parameterize clients with different 
 * requests, queue or log requests, and support undoable operations.
 * (Gamma et al, Design Patterns)
 * <br/><br/>
 * <b>Responsibility</b>: Abstract generic definition of the "Receiver".
 * <ul>
 * <li>Knows how to perform the operations associated with carrying 
 * out the request.</li>
 * </ul><br/>
 * 
 * <br/>
 * Example usage:
 * <pre><code>
 *    //
 *    // Create Command Pattern elements 
 *    //  
 *    IInvoker myInvoker = new ConcreteInvoker();
 *    ICommand myCommand = new ConcreteCommand();
 *    IReceiver myReceiver = new ConcreteReceiver();
 *    
 *    //
 *    // Associate Command Pattern elements 
 *    //
 *    myInvoker.setCommand(myCommand);
 *    myCommand.setReceiver(myReceiver);
 *    
 *    //
 *    // Optionally parameterize the Invoker
 *    //
 *    myInvoker.setParameter(new SomeParameter());
 *    
 *    //
 *    // Execute Invoker's invoke method that triggers execution of 
 *    // Command and Receiver
 *    //
 *    myInvoker.invoke();
 *    
 *    //
 *    // Optionally and if the Command is synchronous, retrieve a result
 *    //
 *    System.out.println(myInvoker.getResult().toString());
 * </code></pre>
 *
 * @param <P> Command Parameter context-specific
 * @param <R> Command Result context-specific
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jun 19, 2007 11:09:44 PM $
 */
public 
interface IReceiver<P, R> 
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Sets the input parameter required for the execution of 
     * this <code>IReceiver</code>.
     * 
     * @param aParameter Parameter required for executing the
     *        <code>IReceiver</code>.
     * @throws IllegalArgumentException 'aParameter' must not be null.
     */
    public void 
    setParameter(P aParameter)
    throws IllegalArgumentException;

    //------------------------------------------------------------------------
    /**
     * Returns result out of executing this <code>IReceiver</code>.
     * 
     * @return Result out of executing this <code>IReceiver</code>.
     * @throws IllegalStateException No result available.
     */
    public R 
    getResult()
    throws IllegalStateException;    
    
    //------------------------------------------------------------------------
    /**
     * Starts the execution of the <code>IReceiver</code>.
     * 
     * @throws IllegalStateException Parameter not set.
     */
    public void 
    execute()
    throws IllegalStateException;        
}
