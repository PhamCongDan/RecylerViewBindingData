package danpc.rikkei.viewmodel;

import danpc.rikkei.model.User;

public interface MainActivityContact {
    public interface  Presenter {
        void onShowData (User user);
    }

    public interface View {
        void showData (User user);
    }
}
