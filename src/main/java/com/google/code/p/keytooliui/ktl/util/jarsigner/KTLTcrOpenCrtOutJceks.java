package com.google.code.p.keytooliui.ktl.util.jarsigner;

/**

    "Tcr" for "Trusted certifcate" (entry)

**/

import com.google.code.p.keytooliui.ktl.swing.dialog.*;

import com.google.code.p.keytooliui.shared.lang.*;
import com.google.code.p.keytooliui.shared.swing.optionpane.*;
import com.google.code.p.keytooliui.shared.util.jarsigner.*;


// ----
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
// --
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
// ----

import java.awt.*;
import java.io.*;
import java.util.*;

public final class KTLTcrOpenCrtOutJceks extends KTLTcrOpenCrtOutDMAbs
{
    // ------
    // PUBLIC

    public KTLTcrOpenCrtOutJceks(
        Frame frmOwner, 
   
        
        // input
        String strPathAbsOpenKst, // existing keystore of type JCEKS 
        char[] chrsPasswdOpenKst,
        
        String strPathAbsFileSaveCrt, // certificate to save
        String strFormatFileCrt // could be DER-PKCS#7-PEM
        )
    {
        super(
            frmOwner, 
       
        
            // input
            strPathAbsOpenKst, // existing keystore of type JCEKS 
            chrsPasswdOpenKst,
        
            strPathAbsFileSaveCrt, // certificate to save
            strFormatFileCrt, 
            KTLAbs.f_s_strProviderKstJceks
            );
            
    }
    
    
    // ---------
    // protected
    
    protected KeyStore _getKeystoreOpen_(File fleOpen)
    {
        return UtilKstJceks.s_getKeystoreOpen(
            super._frmOwner_, 
      
            fleOpen,
            super._chrsPasswdKst_);
    }
}