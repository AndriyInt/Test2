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
 
 
 package com.google.code.p.keytooliui.shared.lang.bool;

/**
    for use in table, contains:
    . a red "checked" image
    . a booleanChecked y/n
    
    if (value==true)
    {
        returns:
        . a "checked" icon
        . a nil text
    }
    
    else
    {
        returns:
        . a nil icon
        . a "-" text
    }
    
**/



public final class BOCheckedDotRed extends BOCheckedDotAbs
{
    // --------------------
    // PRIVATE STATIC FINAL
    
    private static final String _f_s_strIcon = "tick_red9x11.gif";;
    
    // ------
    // PUBLIC
    
    public BOCheckedDotRed(boolean blnChecked)
    {
        super(BOCheckedDotRed._f_s_strIcon, blnChecked);
    }
    
    public BOCheckedDotRed()
    {
        super(BOCheckedDotRed._f_s_strIcon);
    }
}