//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// NullHandler.java Copyright (c) 2009 Giovanni Azua Garcia
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
 * Null Object Pattern implementation of <code>IHandler</code>. 
 * <br/><br/>
 * <code>NullHandler</code> is a Singleton therefore it may not be directly 
 * instantiated, neither it may be extended.
 *
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Jun 23, 2007 1:40:23 PM $
 */
public final 
class NullHandler
implements IHandler<Object>, ISingleton
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns Singleton instance of <code>NullHandler</code>.
     * 
     * @return Singleton instance of <code>NullHandler</code>.
     */
    public static NullHandler
    getInstance()
    {
        return INSTANCE;
    }
    
    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public IHandler<Object> 
    getSuccessor()
    throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("'NullHandler' does not " +
            "support method getSuccessor().");
    }
    
    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public void 
    start(Object aRequest) 
    throws IllegalArgumentException
    {
        // do nothing
    }

    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public boolean 
    canHandle(Object aRequest) 
    throws IllegalArgumentException
    {
        return true;
    }

    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public void
    handle(Object aRequest)
    {
        // do nothing
    }
    
    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public void 
    setSuccessor(IHandler<Object> aSuccessor)
    throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("'NullHandler' does not " +
            "support method setSuccessor().");
    }
    
    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public void 
    setChainStrategy(IChainStrategy aStrategy)
    throws IllegalArgumentException
    {
        throw new UnsupportedOperationException("'NullHandler' does not " +
            "support method setChainStrategy().");
    }    
    
    //------------------------------------------------------------------------
    // private
    //------------------------------------------------------------------------
    private 
    NullHandler()
    {        
        // do nothing        
    }
    
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    /**
     * Singleton instance of <code>NullHandler</code>
     */
    private static final NullHandler INSTANCE = new NullHandler();
}
