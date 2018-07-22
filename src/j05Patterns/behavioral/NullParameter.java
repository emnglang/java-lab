//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// NullParameter.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * Null Object Pattern implementation of Command <code>Parameter</code>. 
 * Prevents different <code>Command</code> implementations from pushing 
 * <code>null</code> into the <code>Receiver</code>'s 
 * <code>execute</code> method.
 * <br/><br/>
 * <code>NullParameter</code> is a Singleton therefore it can not be directly 
 * instantiated, neither it may be extended.
 * <br/><br/>
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jun 19, 2007 10:17:38 PM $
 */
public final
class NullParameter
implements ISingleton
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns Singleton instance of <code>NullParameter</code>.
     * 
     * @return Singleton instance of <code>NullParameter</code>.
     */
    public static NullParameter
    getInstance()
    {
        return INSTANCE;
    }
    
    //------------------------------------------------------------------------
    // private
    //------------------------------------------------------------------------
    private 
    NullParameter()
    {        
        // do nothing
    }
    
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    /**
     * Singleton instance of <code>NullParameter</code>
     */
    private static final NullParameter INSTANCE = new NullParameter(); 
}
