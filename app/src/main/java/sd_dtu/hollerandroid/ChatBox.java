package sd_dtu.hollerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.devcenter.androiduilibrary.ChatView;

public class ChatBox extends AppCompatActivity {

    ChatView chatView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_box);
        chatView = (ChatView) findViewById(R.id.chat_view);
    }
}
