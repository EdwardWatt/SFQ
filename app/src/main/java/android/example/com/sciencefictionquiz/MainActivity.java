package android.example.com.sciencefictionquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Submit(View view){
        /**
         * This method is called when the Submit button is clicked.
         * Declaring each answer wrong until it passes
         */
        Boolean answer1Correct = false;
        Boolean answer2Correct = false;
        Boolean answer3Correct = false;
        Boolean answer4Correct = false;
        Boolean answer5Correct = false;
        Boolean answer6Correct = false;
        Boolean answer7Correct = false;
/**
 * These variables are declared now and used for each Radio Question and part of the EditText question
 */
        RadioGroup answersRG;
        RadioButton selectedAnswerRB;
        String selectedAnswerText = "";
        int Score = 0;  //Score Declaration
        /**
         * This method grabs the status of Question 1 Radio Group and checks the text if the correct radio was selected
         */
        answersRG = findViewById(R.id.answers1);
        selectedAnswerRB = (RadioButton)findViewById(answersRG.getCheckedRadioButtonId());
        selectedAnswerText = selectedAnswerRB.getText().toString();
        if(selectedAnswerText.equalsIgnoreCase("Firefly")){
            Score += 1;
            answer1Correct = true;
        }
/**
 * This method grabs the typed string of Question 2 EditText and checks if the correct word was typed, regardless of caps. If its not typed correctly we make a note for later
 */
        EditText Answers2ET = findViewById(R.id.answers2);
        selectedAnswerText = Answers2ET.getEditableText().toString();
        if(selectedAnswerText.equalsIgnoreCase("Enterprise")){
            Score += 1;
            answer2Correct = true;
        }
        answersRG = findViewById(R.id.answers3);
        selectedAnswerRB = (RadioButton)findViewById(answersRG.getCheckedRadioButtonId());
        selectedAnswerText = selectedAnswerRB.getText().toString();
        if(selectedAnswerText.equalsIgnoreCase("Jedi Knights")){
            Score += 1;
            answer3Correct = true;
        }
        answersRG = findViewById(R.id.answers4);
        selectedAnswerRB = (RadioButton)findViewById(answersRG.getCheckedRadioButtonId());
        selectedAnswerText = selectedAnswerRB.getText().toString();
        if(selectedAnswerText.equalsIgnoreCase("Michael Crichton")){
            Score += 1;
            answer4Correct = true;
        }
/**
 * This method grabs the checkmark status for all Question 5 checkboxes and checks if the correct 2 checkboxes were checked and only the correct check boxes. If its not correct we make a note for later
 */
        CheckBox Answer5aCheckBox = findViewById(R.id.answer5a);
        boolean CorrectAnswer5aBool = Answer5aCheckBox.isChecked();
        CheckBox Answer5bCheckBox = findViewById(R.id.answer5b);
        boolean CorrectAnswer5bBool = Answer5bCheckBox.isChecked();
        CheckBox Answer5cCheckBox = findViewById(R.id.answer5c);
        boolean CorrectAnswer5cBool = Answer5cCheckBox.isChecked();
        CheckBox Answer5dCheckBox = findViewById(R.id.answer5d);
        boolean CorrectAnswer5dBool = Answer5dCheckBox.isChecked();
        if(CorrectAnswer5aBool == false && CorrectAnswer5bBool == true && CorrectAnswer5cBool == false && CorrectAnswer5dBool == true){
            Score += 1;
            answer5Correct = true;
        }
        answersRG = findViewById(R.id.answers6);
        selectedAnswerRB = (RadioButton)findViewById(answersRG.getCheckedRadioButtonId());
        selectedAnswerText = selectedAnswerRB.getText().toString();
        if(selectedAnswerText.equalsIgnoreCase("The Cylons")){
            Score += 1;
            answer6Correct = true;
        }
        answersRG = findViewById(R.id.answers7);
        selectedAnswerRB = (RadioButton)findViewById(answersRG.getCheckedRadioButtonId());
        selectedAnswerText = selectedAnswerRB.getText().toString();
        if(selectedAnswerText.equalsIgnoreCase("TARDIS")){
            Score += 1;
            answer7Correct = true;
        }
        /**
         * Start creating the Toast message and if its all correct, show a 7/7 awesome toast message. Else show how many correctly answered and then showing additional toast windows with correct answers
         */
        CharSequence scoreText = "You got ";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        if(Score == 7){
            scoreText += "7 Out of 7, that's Awesome!";
            Toast toast = Toast.makeText(context, scoreText, duration);
            toast.show();
        }
        else {
            scoreText += Score + " out of 7. Correct Answers to follow.";
            Toast toast = Toast.makeText(context, scoreText, duration);
            toast.show();
            /**
             *  Most the if statements are checking for the wrong answer for the radio group questions or the passed on notes for Edittext question or checkbox question.
             */
            if (answer1Correct == false) {
                CharSequence text = "Question 1 correct answer was 'Firefly'";
                Toast toastA1 = Toast.makeText(context, text, duration);
                toastA1.show();
            }
            if (answer2Correct == false) {

                CharSequence text = "Question 2 correct answer was 'Enterprise'";
                Toast toastA2 = Toast.makeText(context, text, duration);
                toastA2.show();
            }
            if (answer3Correct == false) {
                CharSequence text = "Question 3 correct answer was 'Jedi Knights'";
                Toast toastA3 = Toast.makeText(context, text, duration);
                toastA3.show();
            }
            if (answer4Correct == false) {
                CharSequence text = "Question 4 correct answer was 'Michael Crichton'";
                Toast toastA4 = Toast.makeText(context, text, duration);
                toastA4.show();
            }
            if (answer5Correct == false) {
                CharSequence text = "Question 5 correct answer was 'Katniss Everdeen' AND 'Peeta Mellark'";
                Toast toastA5 = Toast.makeText(context, text, duration);
                toastA5.show();
            }
            if (answer6Correct == false) {
                CharSequence text = "Question 6 correct answer was 'The Cylons'";
                Toast toastA6 = Toast.makeText(context, text, duration);
                toastA6.show();
            }
            if (answer7Correct == false) {
                CharSequence text = "Question 7 correct answer was 'TARDIS'";
                Toast toastA7 = Toast.makeText(context, text, duration);
                toastA7.show();
            }
        }
    }
}