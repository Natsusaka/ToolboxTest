package com.inside_research.toolboxtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    boolean mToggleMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ToolBoxTest toolBoxTest = (ToolBoxTest) this.getApplication();
        Toolbar toolbar = toolBoxTest.getToolbar();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ナビゲーションアイコンクリック時の処理
                int i=0;
            }
        });
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                // メニュークリック時の処理
                return false;
            }
        });

        toolbar.setNavigationIcon(R.drawable.plus);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( "test", "OK" );
                Toast.makeText(SecondActivity.this, "Navigation click", Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if( mToggleMode )
        {
            toolbar.setNavigationIcon(R.drawable.plus);
            mToggleMode = false;
        } else {
            toolbar.setNavigationIcon(R.drawable.small_icon);
            mToggleMode = true;
        }


        return super.onOptionsItemSelected(item);
    }
}
