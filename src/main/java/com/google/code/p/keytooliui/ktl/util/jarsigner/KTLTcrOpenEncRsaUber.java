package com.google.code.p.keytooliui.ktl.util.jarsigner;

/**

    "Tcr" for "Trusted certifcate" (entry)

     encrypting file with RSA public key of trusted certificate entry
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

public final class KTLTcrOpenEncRsaUber extends KTLTcrOpenEncRsaDMAbs
{
    // ------
    // PUBLIC

    public KTLTcrOpenEncRsaUber(
        Frame frmOwner, 
     
        
        // input
        String strPathAbsOpenKst, // existing keystore of type Uber 
        char[] chrsPasswdOpenKst,
        
        String strPathAbsFileOpenData,
        String strPathAbsFileSaveData,
        String strInstanceCipherAlgo
        )
    {
        super(
            frmOwner, 
       
        
            // input
            strPathAbsOpenKst, // existing keystore of type Uber 
            chrsPasswdOpenKst,
        
            strPathAbsFileOpenData,
            strPathAbsFileSaveData,
         
            KTLAbs.f_s_strProviderKstUber,
            strInstanceCipherAlgo
            );
            
    }
    
    
    // ---------
    // protected
    
    protected KeyStore _getKeystoreOpen_(File fleOpen)
    {
        return UtilKstUber.s_getKeystoreOpen(
            super._frmOwner_, 
       
            fleOpen,
            super._chrsPasswdKst_);
    }
}
