// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LandlordConversationsFragmentBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout swapRefreshLayout;

  @NonNull
  public final TextView textNoConversations;

  private LandlordConversationsFragmentBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView,
      @NonNull SwipeRefreshLayout swapRefreshLayout, @NonNull TextView textNoConversations) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.recyclerView = recyclerView;
    this.swapRefreshLayout = swapRefreshLayout;
    this.textNoConversations = textNoConversations;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LandlordConversationsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LandlordConversationsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.landlord_conversations_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LandlordConversationsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      SwipeRefreshLayout swapRefreshLayout = (SwipeRefreshLayout) rootView;

      id = R.id.textNoConversations;
      TextView textNoConversations = ViewBindings.findChildViewById(rootView, id);
      if (textNoConversations == null) {
        break missingId;
      }

      return new LandlordConversationsFragmentBinding((SwipeRefreshLayout) rootView, progressBar,
          recyclerView, swapRefreshLayout, textNoConversations);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
