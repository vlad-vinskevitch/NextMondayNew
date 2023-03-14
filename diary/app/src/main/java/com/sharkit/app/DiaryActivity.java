package com.sharkit.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.sharkit.app.component.DaggerDiaryComponent;


public class DiaryActivity extends AppCompatActivity {

    private final SomeClass someClass, someClass1;

    public DiaryActivity() {
        this.someClass = DaggerDiaryComponent.builder().build().getInstance();
        this.someClass1 = DaggerDiaryComponent.builder().build().getInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        someClass.print();
        someClass1.print();
    }
}