/*
 *
 * Copyright (c)  2001-2011 RagingCat Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 * This software is the confidential and proprietary information of RagingCat Project.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of RagingCat Project's license agreement.
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
 
 
 package com.google.code.p.keytooliui.shared.awt.awteventmulticaster;

import com.google.code.p.keytooliui.shared.awt.awtevent.*;
import com.google.code.p.keytooliui.shared.util.eventlistener.*;

import java.util.EventListener;

/**
    MEMO:
        protected java.awt.AWTEventMulticaster.EventListener a;
        protected java.awt.AWTEventMulticaster.EventListener b;
**/

public class MFileAllEditorEventMulticaster extends java.awt.AWTEventMulticaster implements MFileAllEditorListener
{
    // --------------------------
    // PUBLIC STATIC [XX]Listener
    
    public static MFileAllEditorListener add(MFileAllEditorListener pwlA, MFileAllEditorListener pwlB)
	{
        return (MFileAllEditorListener) addInternal(pwlA, pwlB);
	}
  
	public static MFileAllEditorListener remove(MFileAllEditorListener pwlA, MFileAllEditorListener pwlB)
	{
        return (MFileAllEditorListener) removeInternal(pwlA, pwlB);
	}
    
    // ----------------
    // PROTECTED STATIC
    
    protected static EventListener addInternal(EventListener elrA, EventListener elrB)
	{
		if (elrA == null) return elrB;
		if (elrB == null) return elrA;
        return new MFileAllEditorEventMulticaster(elrA, elrB);
	}
	
    // -----------
	// PUBLIC VOID
	
	public void fileRecord(MFileAllEditorEvent evt)
	{
		if (a != null)
			((MFileAllEditorListener) a).fileRecord(evt);
    
		if (b != null)
			((MFileAllEditorListener) b).fileRecord(evt);
	}
	
	public void fileDelete(MFileAllEditorEvent evt)
	{
		if (a != null)
			((MFileAllEditorListener) a).fileDelete(evt);
    
		if (b != null)
			((MFileAllEditorListener) b).fileDelete(evt);
	}
	
	// ---------
    // PROTECTED
    
    protected MFileAllEditorEventMulticaster(EventListener elrA, EventListener elrB)
	{
        super(elrA, elrB);
	}
  
	protected EventListener remove(EventListener elrOld)
	{
        if (elrOld == a) return b;
		if (elrOld == b) return a;
        
        EventListener elrA2 = removeInternal(a, elrOld);
        EventListener elrB2 = removeInternal(b, elrOld);
        
        if (elrA2 == a && elrB2 == b)
			return this;
		
		return addInternal(elrA2, elrB2);
    }
}