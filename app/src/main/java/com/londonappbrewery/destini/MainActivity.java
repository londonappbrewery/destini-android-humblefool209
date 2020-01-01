package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyView;
    private Button topButtonView;
    private Button bottomButtonView;
    private int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        if(savedInstanceState== null){
        storyView = findViewById(R.id.storyTextView);
        topButtonView = findViewById(R.id.buttonTop);
        bottomButtonView = findViewById(R.id.buttonBottom);
        mStoryIndex=1;
        }



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex==1 || mStoryIndex==2){
                    storyView.setText(R.string.T3_Story);
                    topButtonView.setText(R.string.T3_Ans1);
                    bottomButtonView.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                } else if (mStoryIndex == 3) {
                    storyView.setText(R.string.T6_End);
                    makeButtonsInvisible();
                    mStoryIndex=6;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mStoryIndex==1){
                    storyView.setText(R.string.T2_Story);
                    topButtonView.setText(R.string.T2_Ans1);
                    bottomButtonView.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                }
                else if (mStoryIndex == 2) {
                    storyView.setText(R.string.T4_End);
                    makeButtonsInvisible();
                    mStoryIndex = 4;
                }
                else if (mStoryIndex == 3) {
                    storyView.setText(R.string.T5_End);
                    makeButtonsInvisible();
                    mStoryIndex=5;
                }
            }
        });


    }

    private void makeButtonsInvisible(){
        topButtonView.setVisibility(View.GONE);
        bottomButtonView.setVisibility(View.GONE);
    }
}
