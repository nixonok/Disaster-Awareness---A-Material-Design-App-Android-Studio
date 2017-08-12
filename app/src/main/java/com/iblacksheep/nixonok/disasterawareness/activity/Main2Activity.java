package com.iblacksheep.nixonok.disasterawareness.activity;

import android.app.Application;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.iblacksheep.nixonok.disasterawareness.R;

public class Main2Activity extends AppCompatActivity {

    int itemClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getInt("click_position", 0) > 0) {
            itemClicked = extras.getInt("click_position");
        }

        if (itemClicked == 0 ){

            ImageView image =(ImageView) findViewById (R.id.imageView);
            image.setImageResource(R.drawable.earthquake);


            TextView text0 = (TextView) findViewById( R.id.headingText );
            text0.setText(R.string.earthQuakeHeading);

            TextView text1 = (TextView) findViewById( R.id.simpleText );
            text1.setText(R.string.earthQuakeText);

            TextView text2 = (TextView) findViewById( R.id.headingText2 );
            text2.setText(R.string.earthQuakeHeading2);

            TextView text3 = (TextView) findViewById( R.id.simpleText2 );
            text3.setText(R.string.earthQuakeText2);

            TextView text4 = (TextView) findViewById( R.id.headingText3 );
            text4.setText(R.string.earthQuakeHeading3);

            TextView text5 = (TextView) findViewById( R.id.simpleText3 );
            text5.setText(R.string.earthQuakeText3);


            TextView text6 = (TextView) findViewById( R.id.headingText4 );
            text6.setText(R.string.earthQuakeHeading4);

            TextView text7 = (TextView) findViewById( R.id.simpleText4 );
            text7.setText(R.string.earthQuakeText4);

        }

        if (itemClicked == 1 ){

            ImageView image =(ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.haricane);

            TextView text0 = (TextView) findViewById( R.id.headingText );
            text0.setText(R.string.stormHeading);

            TextView text1 = (TextView) findViewById( R.id.simpleText );
            text1.setText(R.string.stormText);

            TextView text2 = (TextView) findViewById( R.id.headingText2 );
            text2.setText(R.string.stormHeading2);

            TextView text3 = (TextView) findViewById( R.id.simpleText2 );
            text3.setText(R.string.stormText2);

            TextView text4 = (TextView) findViewById( R.id.headingText3 );
            text4.setText(R.string.stormHeading3);

            TextView text5 = (TextView) findViewById( R.id.simpleText3 );
            text5.setText(R.string.stormText3);


            TextView text6 = (TextView) findViewById( R.id.headingText4 );
            text6.setText(R.string.stormHeading4);

            TextView text7 = (TextView) findViewById( R.id.simpleText4 );
            text7.setText(R.string.stormText4);
        }

        if (itemClicked == 2 ){

            ImageView image =(ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.fire);


            TextView text0 = (TextView) findViewById( R.id.headingText );
            text0.setText(R.string.fireHeading);

            TextView text1 = (TextView) findViewById( R.id.simpleText );
            text1.setText(R.string.fireText);

            TextView text2 = (TextView) findViewById( R.id.headingText2 );
            text2.setText(R.string.fireHeading2);

            TextView text3 = (TextView) findViewById( R.id.simpleText2 );
            text3.setText(R.string.fireText2);

            TextView text4 = (TextView) findViewById( R.id.headingText3 );
            text4.setText(R.string.fireHeading3);

            TextView text5 = (TextView) findViewById( R.id.simpleText3 );
            text5.setText(R.string.fireText3);


            TextView text6 = (TextView) findViewById( R.id.headingText4 );
            text6.setText(R.string.fireHeading4);

            TextView text7 = (TextView) findViewById( R.id.simpleText4 );
            text7.setText(R.string.fireText4);

            TextView text9 = (TextView) findViewById( R.id.headingText5 );
            text9.setText(R.string.fireHeading5);

            TextView text8 = (TextView) findViewById( R.id.simpleText5 );
            text8.setText(R.string.fireText5);


        }




        if (itemClicked == 3 ){

            ImageView image =(ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.flood);

            TextView text0 = (TextView) findViewById( R.id.headingText );
            text0.setText(R.string.floodHeading);

            TextView text1 = (TextView) findViewById( R.id.simpleText );
            text1.setText(R.string.floodText);

            TextView text2 = (TextView) findViewById( R.id.headingText2 );
            text2.setText(R.string.floodHeading2);

            TextView text3 = (TextView) findViewById( R.id.simpleText2 );
            text3.setText(R.string.floodText2);

            TextView text4 = (TextView) findViewById( R.id.headingText3 );
            text4.setText(R.string.floodHeading3);

            TextView text5 = (TextView) findViewById( R.id.simpleText3 );
            text5.setText(R.string.floodText3);


            TextView text6 = (TextView) findViewById( R.id.headingText4 );
            text6.setText(R.string.floodHeading4);

            TextView text7 = (TextView) findViewById( R.id.simpleText4 );
            text7.setText(R.string.floodText4);

            TextView text9 = (TextView) findViewById( R.id.headingText5 );
            text9.setText(R.string.floodHeading5);

            TextView text8 = (TextView) findViewById( R.id.simpleText5 );
            text8.setText(R.string.floodText5);


        }

        if (itemClicked == 4 ){

            ImageView image =(ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.tsunami);

            TextView text0 = (TextView) findViewById( R.id.headingText );
            text0.setText(R.string.tsunamiHeading);

            TextView text1 = (TextView) findViewById( R.id.simpleText );
            text1.setText(R.string.tsunamiText);

            TextView text2 = (TextView) findViewById( R.id.headingText2 );
            text2.setText(R.string.tsunamiHeading2);

            TextView text3 = (TextView) findViewById( R.id.simpleText2 );
            text3.setText(R.string.tsunamiText2);

            TextView text4 = (TextView) findViewById( R.id.headingText3 );
            text4.setText(R.string.tsunamiHeading3);

            TextView text5 = (TextView) findViewById( R.id.simpleText3 );
            text5.setText(R.string.tsunamiText3);

        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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
