package com.tje.tablayoutpractice.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tje.tablayoutpractice.R;
import com.tje.tablayoutpractice.databinding.FragmentChatListBinding;
import com.tje.tablayoutpractice.databinding.FragmentFormBinding;

public class ChatListFragment extends Fragment {

    FragmentChatListBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat_list, container, false);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.welcomeMsgTxt.setText("채팅 리스트 뷰");
    }
}
