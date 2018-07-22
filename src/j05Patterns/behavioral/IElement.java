//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IElement.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * <b>Visitor Design Pattern</b>: Represent an operation to be performed on the
 * elements of an object structure. Visitor lets you define a new operation
 * without changing the classes of the elements on which it operates.<br/>
 * <br/>
 * 
 * <b>Responsibility</b> Abstract definition of "Element"
 * <ul>
 * <li>Marker interface for any Element type.</li>
 * </ul>
 * 
 * <br/>
 * Example usage:
 * <pre><code>
 *    //
 *    // Abstract Base Node for a simple Element hierarchy.
 *    //  
 *    abstract
 *    class AbstractNode 
 *    implements IElement 
 *    {
 *        //--------------------------------------------------------------------
 *        public 
 *        BaseNode(String aName) 
 *        {
 *            theName = aName;
 *        }
 *                
 *        //--------------------------------------------------------------------
 *        public final String 
 *        getName() 
 *        {
 *            return theName;
 *        }        
 *
 *        //--------------------------------------------------------------------
 *        // members
 *        //--------------------------------------------------------------------
 *        private final String theName;
 *    }
 *
 *    //
 *    // RedNode
 *    //  
 *    class RedNode 
 *    extends AbstractNode 
 *    {
 *        //--------------------------------------------------------------------
 *        public 
 *        RedNode() 
 *        {
 *            super("Red");
 *        }
 *    }
 *    
 *    //
 *    // BlackNode
 *    //  
 *    class BlackNode 
 *    extends AbstractNode 
 *    {
 *        //--------------------------------------------------------------------
 *        public 
 *        BlackNode() 
 *        {
 *            super("Black");
 *        }
 *    }
 *    
 *    //
 *    // Simple Visitor
 *    // 
 *    class NodeVisitor
 *    extends AbstractVisitor&lt;AbstractNode&gt;
 *    {
 *        //--------------------------------------------------------------------
 *        public void
 *        visitRedNode(RedNode aNode)
 *        {
 *             // do RedNode visiting
 *             System.out.println(aNode.getName());    
 *        }
 *        
 *        //--------------------------------------------------------------------
 *        public void
 *        visitBlackNode(BlackNode aNode)
 *        {
 *             // do BlackNode visiting
 *             System.out.println(aNode.getName());    
 *        }
 *    }
 *    
 *    //
 *    // Usage example
 *    //
 *    IVisitor&lt;AbstractNode&gt; myVisitor = new NodeVisitor();
 *    myVisitor.visit(new RedNode());
 *    myVisitor.visit(new BlackNode());
 * </code></pre>
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jul 1, 2007 6:59:35 AM $
 */
public interface 
IElement 
{
    // marker interface
}
