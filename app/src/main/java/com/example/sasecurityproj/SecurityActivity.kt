package com.example.sasecurityproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

class SecurityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)

        var masterkey = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
        var spref = EncryptedSharedPreferences.create(
            "EFile",masterkey,this,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )

        var editor = spref.edit()
        editor.putString("imp","Myimppassword")
        editor.putString("imp2","mykey")
            .commit()
    }
}