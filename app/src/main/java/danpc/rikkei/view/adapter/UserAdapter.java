package danpc.rikkei.view.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.databinding.DataBindingUtil;
import java.util.ArrayList;

import danpc.rikkei.model.User;
import danpc.rikkei.recylerviewbindingdata.R;
import danpc.rikkei.recylerviewbindingdata.databinding.ItemUserBinding;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    ArrayList<User> lstUser;
//    Context context;

    public UserAdapter(ArrayList<User> lstUser) {
        this.lstUser = lstUser;
//        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = inflater.inflate(R.layout.item_user, parent, false);

        ItemUserBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_user, parent, false);
        binding.setUser(lstUser.get(viewType));
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtFirstName.setText(lstUser.get(position).getFirstName());
        holder.txtLastName.setText(lstUser.get(position).getLastName());

    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtFirstName;
        TextView txtLastName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtFirstName = itemView.findViewById(R.id.txtFirstName);
            txtLastName = itemView.findViewById(R.id.txtLastName);
        }
    }
}
