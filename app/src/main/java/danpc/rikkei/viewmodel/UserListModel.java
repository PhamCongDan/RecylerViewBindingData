package danpc.rikkei.viewmodel;

import android.databinding.ObservableArrayList;
import android.view.View;
import android.widget.Toast;


import java.util.Random;

import danpc.rikkei.model.User;

public class UserListModel {
    private MainActivityContact.View view;
    public ObservableArrayList<User> lstUser = new ObservableArrayList<>();
    private int sizeUser = 10;

    public UserListModel(MainActivityContact.View view) {
        this.view = view;
        lstUser.add(new User("1","11"));
        lstUser.add(new User("2","22"));

//        Random r = new Random();
//        for (int i = 0; i <sizeUser; i++) {
//            User user = new User();
//            String firstName = "dan " + r.nextInt();
//            String lastName = "pc " + r.nextInt();
//
//            user.setFirstName(firstName);
//            user.setLastName(lastName);
//            add(user);
//        }
    }

    public void add(User user) {
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

    public void addUser (User user) {
        this.view.showData(user);
        lstUser.add(user);
    }
}