package com.google.code.p.keytooliui.ktl.swing.button;
 

 
import java.awt.event.*;
 
public final class RBTypeCrtPem extends RBTypeCrtAbs
{    
    // ------
    // PUBLIC
    
    public RBTypeCrtPem(
        boolean blnIsEnabled,
        ItemListener itmListenerParent)
    {
        super(
            blnIsEnabled,
            itmListenerParent,
            com.google.code.p.keytooliui.ktl.util.jarsigner.KTLAbs.f_s_strFormatFileCrtPem,
            com.google.code.p.keytooliui.ktl.io.S_FileExtensionUI.f_s_strsCrtX509Pem
            );
    }
}