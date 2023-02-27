package com.example.olx.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ConfiguracaoFirebase {

    private DatabaseReference referenciaFirebase;
    private FirebaseAuth referenciaAutenticacao;
    private StorageReference referenciaStorage;

    public DatabaseReference getFirebase(){
        if(referenciaFirebase == null){
            referenciaFirebase = FirebaseDatabase.getInstance().getReference();
        } return referenciaFirebase;
    }

    public FirebaseAuth getFirebaseAutenticacao(){
        if(referenciaAutenticacao== null){
            referenciaAutenticacao = FirebaseAuth.getInstance();
        } return referenciaAutenticacao;
    }

    public StorageReference getFirebaseStorage(){
        if(referenciaStorage == null){
            referenciaStorage = FirebaseStorage.getInstance().getReference();
        } return referenciaStorage;
    }


}
