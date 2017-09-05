package com.shuyu.apprecycler.chat.detail;

import android.content.Context;

import java.util.List;

/**
 * 接口
 * Created by guoshuyu on 2017/9/4.
 */

public class ChatDetailContract {
    public interface IChatDetailView {
        void notifyView();
        Context getContext();
    }

    public interface IChatDetailPresenter<T> {

        void loadMoreData(int page);

        List<T> getDataList();

        void sendMsg(String text);

    }
}