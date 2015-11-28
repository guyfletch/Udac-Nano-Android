package com.example.guy.frame;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FrameBasic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_basic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

   public void FilmRecBtn_Click(View view){
       Context context = getApplicationContext();
       CharSequence text = "This button will run the Film Recommendation app";
       int duration = Toast.LENGTH_SHORT;

       Toast toast = Toast.makeText(context,text,duration);
       toast.show();
   }

    public void ScoresBtn_Click(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will run the Scores app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void LibraryBtn_Click(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will run the Library app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void BuildBigBtn_Click(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will run the Build it Bigger app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void XYZReaderBtn_Click(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will run the XYZ Reader app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void MyOwnAppBtn_Click(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will run my own app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frame_basic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
