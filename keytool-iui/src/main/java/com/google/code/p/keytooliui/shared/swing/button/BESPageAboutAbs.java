/*
 *
 * Copyright (c)  2001-2011 keyTool IUI Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 *
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of keyTool IUI Project's license agreement.
 *
 * THE SOFTWARE IS PROVIDED AND LICENSED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. 
 *
 * LICENSE FOR THE SOFTWARE DOES NOT INCLUDE ANY CONSIDERATION FOR ASSUMPTION OF RISK
 * BY KEYTOOL IUI PROJECT, AND KEYTOOL IUI PROJECT DISCLAIMS ANY AND ALL LIABILITY FOR INCIDENTAL
 * OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF OR INABILITY
 * TO USE THE SOFTWARE, EVEN IF KEYTOOL IUI PROJECT HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. 
 *
 */
 
 
package com.google.code.p.keytooliui.shared.swing.button;

/*

    known subclasses:
    . BESPageAbout16
    . BESPageAbout24 (not done yet)

*/


import com.google.code.p.keytooliui.shared.lang.*;

public abstract class BESPageAboutAbs extends BEnabledState
{    
    // --------------
    // PRIVATE STATIC
    
    private static String _s_strToolTipText = null;
    
    // ------------------
    // STATIC INITIALIZER

    static
    {
    
        String strBundleFileShort =
            com.google.code.p.keytooliui.shared.Shared.f_s_strBundleDir +
            ".BESPageAboutAbs" // class name
            ;
    
        
        
        String strWhere = "com.google.code.p.keytooliui.shared.swing.button.BESPageAboutAbs";
        
        try
        {
            java.util.ResourceBundle rbeResources = java.util.ResourceBundle.getBundle(strBundleFileShort, 
                java.util.Locale.getDefault());
                
            _s_strToolTipText = rbeResources.getString("toolTipText");
        }
        
        catch (java.util.MissingResourceException excMissingResource)
        {
            excMissingResource.printStackTrace();
            MySystem.s_printOutExit(strWhere, "excMissingResource caught");
        }
        
        strBundleFileShort = null;
        strWhere = null;
    }
    
    // ---------
    // PROTECTED
    
    protected BESPageAboutAbs(java.awt.event.ActionListener alr, String strImage,
            java.beans.PropertyChangeListener prl)
    {
        super(com.google.code.p.keytooliui.shared.swing.imageicon.S_IINShared.s_get(strImage), alr, prl);
        setToolTipText(BESPageAboutAbs._s_strToolTipText);
    }
        
    protected BESPageAboutAbs(java.awt.event.ActionListener alr, String strImage)
    {
        this(alr, strImage, (java.beans.PropertyChangeListener) null);
    }
        
}