package com.google.code.p.keytooliui.ktl.util.jarsigner;

/**

    "Kst" for "Keystore"
    
    
    known subclasses:
    . KTLKstOpenXX
   
**/


import com.google.code.p.keytooliui.shared.lang.*;

import com.google.code.p.keytooliui.shared.swing.optionpane.*;
import com.google.code.p.keytooliui.shared.util.jarsigner.*;

// ----
import java.security.KeyStore;
import java.security.KeyStoreException;
// ----
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
// ----


import java.awt.*;

public abstract class KTLKstOpenAbs extends KTLKstAbs
{
    // ---------
    // PROTECTED

    protected KTLKstOpenAbs(
        Frame frmOwner, 
      
        
        // input
        String strPathAbsOpenKst, // existing keystore
        char[] chrsPasswdOpenKst,
        
        String strProvider // should be "SUN", or "SunRsaSign", or "BC"
        )
    {
        super(frmOwner,  strPathAbsOpenKst, chrsPasswdOpenKst, strProvider);
    }
}