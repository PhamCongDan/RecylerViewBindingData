package danpc.rikkei.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import danpc.rikkei.model.User;
import danpc.rikkei.recylerviewbindingdata.R;
import danpc.rikkei.recylerviewbindingdata.databinding.ActivityMainBinding;
import danpc.rikkei.view.adapter.UserAdapter;
import danpc.rikkei.viewmodel.MainActivityModel;
import danpc.rikkei.viewmodel.UserListModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
    }

    private void addControls() {
        RecyclerView recyclerView = findViewById(R.id.rclUser);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        ArrayList<User> lstUser = new ArrayList<>();
        lstUser.add(new User("dan", "pc"));
        lstUser.add(new User("hung", "dx"));

        UserAdapter adapter = new UserAdapter(lstUser);
        recyclerView.setAdapter(adapter);
    }

    private void initBinding() {
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityModel mainActivityModel = new MainActivityModel("Danh sach User");
        binding.setMain(mainActivityModel);

        UserListModel infors = new UserListModel();
        binding.setInfors(infors);
    }


}
