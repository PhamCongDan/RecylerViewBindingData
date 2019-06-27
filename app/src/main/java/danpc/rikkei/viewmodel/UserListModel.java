package danpc.rikkei.viewmodel;

import android.databinding.ObservableArrayList;
import android.view.View;
import android.widget.Toast;


import java.util.Random;

import danpc.rikkei.model.User;

public class UserListModel {
    public ObservableArrayList<User> lstUser = new ObservableArrayList<>();
    private int sizeUser = 500;

    public UserListModel() {
        Random r = new Random();
        for (int i = 0; i <sizeUser; i++) {
            User user = new User();
            String firstName = "dan " + i;
            String lastName = "pc " + i;

            user.setFirstName(firstName);
            user.setLastName(lastName);
        }
    }

    private void add(User user) {
        lstUser.add(user);
    }

    public void add(View v) {
        add(new User("a", "danpc"));
        Toast.makeText(v.getContext(), "da them", Toast.LENGTH_SHORT).show();
    }

    public void remove (View v) {
        lstUser.remove(0);
        Toast.makeText(v.getContext(), "da xoa", Toast.LENGTH_SHORT).show();
    }
}