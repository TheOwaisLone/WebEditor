package com.ovilone.webeditor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private final Intent editor = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        initializeLogic();
    }
    @SuppressLint({"InflateParams", "SetTextI18n"})
    private void initialize() {
        Button btn_new_file = findViewById(R.id.btn_new_file);
        Button btn_exit = findViewById(R.id.btn_exit);

        btn_new_file.setOnClickListener(_view -> {
            editor.setClass(getApplicationContext(), EditorActivity.class);
            editor.putExtra("code",R.string.my_code);
            editor.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(editor);
        });

        btn_exit.setOnClickListener(_view -> finishAffinity());

    }
    private void initializeLogic() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(0xFFFFFFFF);
    }

}