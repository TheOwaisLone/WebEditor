package com.ovilone.webeditor;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class EditorActivity extends AppCompatActivity {
    private EditText edittext_code;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_editor);
        initialize();
    }
    private void initialize() {
        Toolbar toolbar = findViewById(R.id._toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton save_fab = findViewById(R.id.save_fab);
        FloatingActionButton run_fab = findViewById(R.id.run_fab);

        edittext_code = findViewById(R.id.edittext_code);
        TextView tab_text = findViewById(R.id.tab_text);
        TextView h1_text = findViewById(R.id.h1_text);


        tab_text.setOnClickListener(_view -> edittext_code.getText().insert(edittext_code.getSelectionStart(), "     "));

        h1_text.setOnClickListener(_view -> {
            edittext_code.getText().insert(edittext_code.getSelectionStart(), "<h1> </h1>");
            edittext_code.setSelection(edittext_code.getSelectionStart() - 5);
        });

        save_fab.setOnClickListener(_view -> Toast.makeText(this, R.string.save, Toast.LENGTH_SHORT).show());

       run_fab.setOnClickListener(_view -> Toast.makeText(this, R.string.run, Toast.LENGTH_SHORT).show());
    }
}
