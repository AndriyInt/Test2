package com.google.code.p.keytooliui.ktl.swing.button;
 

import java.awt.event.*;
 
public final class RBTypeSigDer extends RBTypeSigAbs
{    
    // ------
    // PUBLIC
    
    public RBTypeSigDer(
        boolean blnIsEnabled,
        ItemListener itmListenerParent)
    {
        super(
            blnIsEnabled,
            itmListenerParent,
            com.google.code.p.keytooliui.ktl.util.jarsigner.KTLAbs.f_s_strFormatFileSigDer,
            com.google.code.p.keytooliui.ktl.io.S_FileExtensionUI.f_s_strsSigX509Der
            );
    }
}
