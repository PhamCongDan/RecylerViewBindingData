package danpc.rikkei.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import danpc.rikkei.model.User;
import danpc.rikkei.recylerviewbindingdata.R;
import danpc.rikkei.recylerviewbindingdata.databinding.ActivityMainBinding;
import danpc.rikkei.viewmodel.MainActivityContact;
import danpc.rikkei.viewmodel.MainActivityModel;
import danpc.rikkei.viewmodel.UserListModel;

public class MainActivity extends AppCompatActivity implements MainActivityContact.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
    }

    private void initBinding() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainActivityModel mainActivityModel = new MainActivityModel("Danh sach User");
        binding.setMain(mainActivityModel);

        UserListModel infors = new UserListModel(MainActivity.this);
        binding.setInfors(infors);

        User user = new User("dan", "pham");
        binding.setUser(user);

    }

    @Override
    public void showData(User user) {

        Toast.makeText(this, user.getFirstName(), Toast.LENGTH_SHORT).show();

    }
}
