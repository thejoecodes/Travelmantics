package com.bluestel.travelmatrics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtl {
    public static FirebaseDatabase sFirebaseDatabase;
    public static DatabaseReference sDatabaseReference;
    private static FirebaseUtl sFirebaseUtl;
    public static ArrayList<TravelDeal> sDeals;

    private FirebaseUtl(){};

    public static void openFbReference (String ref){
        if (sFirebaseUtl == null){
            sFirebaseUtl = new FirebaseUtl();
            sFirebaseDatabase = FirebaseDatabase.getInstance();
            sDeals = new ArrayList<TravelDeal>();
        }
        sDatabaseReference = sFirebaseDatabase.getReference().child(ref);
    }
}
