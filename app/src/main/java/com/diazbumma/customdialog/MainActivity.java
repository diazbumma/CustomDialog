package com.diazbumma.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Dialog dialogProfile;
    private ImageButton buttonClose;
    private Button buttonFollow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogProfile = new Dialog(this);
    }

    public void showPopUp(View v){
        dialogProfile.setContentView(R.layout.custom_dialog);
        buttonClose = dialogProfile.findViewById(R.id.button_profile_close);
        buttonFollow = dialogProfile.findViewById(R.id.button_profile_follow);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogProfile.dismiss();
            }
        });
        
        dialogProfile.show();
    }

}
