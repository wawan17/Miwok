package com.example.andorid.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*WordClickListener numberListener = new WordClickListener();

        TextView number = (TextView) findViewById(R.id.menu_number);
        number.setOnClickListener(numberListener);*/
    }

    /**
     * Method to open number category
     * @param view numbers
     */
    public void openNumber(View view) {
        Intent intent = new Intent(this, NumberActivity.class);
        startActivity(intent);
    }

    /**
     * Method to open family category
     * @param view family
     */
    public void openFamily(View view) {
        Intent intent = new Intent(this, FamilyMemberActivity.class);
        startActivity(intent);
    }

    /**
     * Method to open color category
     * @param view colors
     */
    public void openColor(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }

    /**
     * Method to open phrase category
     * @param view phrase
     */
    public void openPhrase(View view) {
        Intent intent = new Intent(this, PhraseActivity.class);
        startActivity(intent);
    }
}
