package com.google.code.p.keytooliui.ktl.util.jarsigner;

/**
    "Crt" for "Certificate"
    "Sig" for "Signature"
    

**/




// ----
import java.security.KeyStore;

// --
// ----

import java.awt.*;
import java.io.*;

public final class KTLCrtOpenSigVerJks extends KTLCrtOpenSigVerANAbs
{
    // ------
    // PUBLIC

    public KTLCrtOpenSigVerJks(
        Frame frmOwner, 
    
        
        // input
        String strPathAbsOpenKst, // existing keystore of type JKS 
        char[] chrsPasswdOpenKst,
        String strPathAbsFileOpenData,
        
        String strPathAbsFileOpenSig, // digital signature
        String strFormatFileSig 
        )
    {
        super(
            frmOwner, 
    
        
            // input
            strPathAbsOpenKst, // existing keystore of type JKS 
            chrsPasswdOpenKst,
            strPathAbsFileOpenData,
        
            strPathAbsFileOpenSig, // digital signature
            strFormatFileSig,
            KTLAbs.f_s_strProviderKstJks
            ); 
    }
    
    
    // ---------
    // protected
    
    protected KeyStore _getKeystoreOpen_(File fleOpen)
    {
        return UtilKstJks.s_getKeystoreOpen(
            super._frmOwner_, 
            fleOpen,
            super._chrsPasswdKst_);
    }
}
