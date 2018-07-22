//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// NullRequest.java Copyright (c) 2009 Giovanni Azua Garcia
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

import j05Patterns.creational.ISingleton;

/**
 * Null Object Pattern implementation of Chain of Responsibility 
 * Request Parameter. 
 * <br/><br/>
 * <code>NullRequest</code> is a Singleton therefore it may not be directly 
 * instantiated, neither it may be extended.
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 6, 2007 5:35:36 PM $
 */
public final
class NullRequest
implements ISingleton
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns Singleton instance of <code>NullRequest</code>.
     * 
     * @return Singleton instance of <code>NullRequest</code>.
     */
    public static NullRequest
    getInstance()
    {
        return INSTANCE;
    }    
    
    //------------------------------------------------------------------------
    // private
    //------------------------------------------------------------------------
    private 
    NullRequest()
    {       
        // do nothing
    }
    
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    /**
     * Singleton instance of <code>NullRequest</code>
     */
    private static final NullRequest INSTANCE = new NullRequest();    
}
