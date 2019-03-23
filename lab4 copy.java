package com.example.firebasetest.Activities.Classes;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import com.google.android.gms.tasks.OnSuccessListener;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;


public class lab4 extends AppCompatActivity{
    FirebaseAuth mAuth;
    FirebaseUser currentUser;
    FirebaseDatabase database;
    DatabaseReference myRef;

    SH tempSH = new SH;

    protected void onCreate(Bundle savedInstanceState) {
        //connection to authentication
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();
            /*info available from user
                currentUser.getUid();
                currentUser.getEmail();
                currentUser.getDisplayName();
            */

        //Creation and connection to database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("SH");

        //id is create when added to database
        String id =  "";
        String ownerId = currentUser.getUid();
        String title = "Art Museum SH";
        String description = "Do this SH for Extra Credit";

        //create scavenger hunt class to store data
        SH shDemo = SH(id,ownerId,title,description);

        //insert
            addSHtoDatabase(shDemo);

        //select
            String id_for_searching_SH = "D1dga$fa";
            selectSHonDatabase(id_for_SH);
            //stored in tempSH
            tempSH;

        //edit
            changeSHonDatabase(shDemo);

        //delete
            deleteSHonDatabase(shDemo.id);

    }

    private void addSHtoDatabase(SH sh) {
        //create a new key id for SH
        myRef = database.getReference("SH").push();

        // get post unique ID and update sh key
        String key = myRef.getKey();
        sh.setId(key);

        // add sh data to firebase database
        myRef.setValue(sh).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                showMessage("SH Added successfully");
            }
        });

    }

    private void changeSHonDatabase(SH sh){
        myRef.child(sh.id).setValue(sh).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                showMessage("SH change successfully");
            }
        });
    }


    private void deleteSHonDatabase(String sh_id){
        myRef.child(sh_id).setValue(NULL).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                showMessage("SH change successfully");
            }
        });
    }

    private void selectSHonDatabase(String idSH) {
        myRef = database.getReference("SH").child(idSH);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                SH sh = dataSnapshot.getValue(SH.class);
                tempSH = sh;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

}