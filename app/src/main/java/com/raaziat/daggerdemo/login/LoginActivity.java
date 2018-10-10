package com.raaziat.daggerdemo.login;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import com.raaziat.daggerdemo.R;
        import com.raaziat.daggerdemo.app.App;

        import javax.inject.Inject;

        import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.Presenter presenter;

    EditText FirstName,LastName;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((App) getApplication()).getComponent().inject(this);

        FirstName = findViewById(R.id.firstName);
        LastName = findViewById(R.id.lastName);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return FirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return LastName.getText().toString();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "First Name or last name cannot be empty", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void setFirstName(String firstName) {
        this.FirstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.LastName.setText(lastName);
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User saved successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "User not Available", Toast.LENGTH_SHORT).show();
    }
}
