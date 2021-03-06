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
 
 
 package com.google.code.p.keytooliui.shared.swing.textfield;

/**
    textfield:
    for use to display the current selection of a string
**/




public final class Tfd30x30SelString extends Tfd30x30Abs
{   
    // --------------------
    // PRIVATE STATIC FINAL
    
    private static final String _f_s_strTip = "current string value (not editable textfield)";

    // ------
    // PUBLIC
    
  
    
    public Tfd30x30SelString(javax.swing.event.DocumentListener docListenerParent)
    {
        super(Tfd30x30SelString._f_s_strTip, docListenerParent);
    }
    
    public Tfd30x30SelString()
    {
        this((javax.swing.event.DocumentListener) null);
    }
}