//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IChainStrategy.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * Strategy that defines the {@link IHandler} decision-logic regarding
 * handling and forwarding of the requests.
 * 
 * @see IStrategy
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 6, 2007 10:32:19 PM $
 */
public 
interface IChainStrategy
extends IStrategy
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Defines the decision-logic regarding handling and forwarding of the 
     * requests.
     * 
     * @param aHandler Chain of Responsibility <code>IHandler<code> instance.
     * @param aRequest Request to process
     */
    public void
    process(IHandler<Object> aHandler, Object aRequest);
}
