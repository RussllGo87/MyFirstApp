package net.pingfang.android.myfirstapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import net.pingfang.android.myfirstapp.R;

public class MainActivity extends ActionBarActivity {

    protected Button btn_compose_message;
    protected Button btn_music_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_compose_message = (Button) findViewById(R.id.btn_compose_message);
        btn_music_play = (Button) findViewById(R.id.btn_music_play);

        btn_compose_message.setOnClickListener(clickListener);
        btn_music_play.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            Intent intent = new Intent();
            switch (viewId) {
                case R.id.btn_compose_message:
                    intent.setClass(getApplication(),ComposeMessageActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_music_play:
                    intent.setClass(getApplication(),MusicPlayActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

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

        return super.onOptionsItemSelected(item);
    }
}
