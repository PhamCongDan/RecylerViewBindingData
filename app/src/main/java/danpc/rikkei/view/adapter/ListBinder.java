package danpc.rikkei.view.adapter;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import danpc.rikkei.model.User;

public class ListBinder {
    @BindingAdapter({"bind:items"})
    public static void bindList(RecyclerView recyclerView, ObservableArrayList<User> lstUser) {
        UserAdapter adapter = new UserAdapter(lstUser);

        LinearLayoutManager layoutManager = new LinearLayoutManager(null, RecyclerView.VERTICAL, false);
//
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}
