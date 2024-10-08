// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRoomListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnAll;

  @NonNull
  public final AppCompatButton btnAvailable;

  @NonNull
  public final AppCompatButton btnOccupied;

  @NonNull
  public final CardView card;

  @NonNull
  public final ImageView ibBack;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerRequestsList;

  @NonNull
  public final TextView textNoDormitories;

  @NonNull
  public final TextView tvDormName;

  @NonNull
  public final TextView tvRoomList;

  private FragmentRoomListBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnAll, @NonNull AppCompatButton btnAvailable,
      @NonNull AppCompatButton btnOccupied, @NonNull CardView card, @NonNull ImageView ibBack,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerRequestsList,
      @NonNull TextView textNoDormitories, @NonNull TextView tvDormName,
      @NonNull TextView tvRoomList) {
    this.rootView = rootView;
    this.btnAll = btnAll;
    this.btnAvailable = btnAvailable;
    this.btnOccupied = btnOccupied;
    this.card = card;
    this.ibBack = ibBack;
    this.progressBar = progressBar;
    this.recyclerRequestsList = recyclerRequestsList;
    this.textNoDormitories = textNoDormitories;
    this.tvDormName = tvDormName;
    this.tvRoomList = tvRoomList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRoomListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRoomListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_room_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRoomListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAll;
      AppCompatButton btnAll = ViewBindings.findChildViewById(rootView, id);
      if (btnAll == null) {
        break missingId;
      }

      id = R.id.btnAvailable;
      AppCompatButton btnAvailable = ViewBindings.findChildViewById(rootView, id);
      if (btnAvailable == null) {
        break missingId;
      }

      id = R.id.btnOccupied;
      AppCompatButton btnOccupied = ViewBindings.findChildViewById(rootView, id);
      if (btnOccupied == null) {
        break missingId;
      }

      id = R.id.card;
      CardView card = ViewBindings.findChildViewById(rootView, id);
      if (card == null) {
        break missingId;
      }

      id = R.id.ibBack;
      ImageView ibBack = ViewBindings.findChildViewById(rootView, id);
      if (ibBack == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recyclerRequestsList;
      RecyclerView recyclerRequestsList = ViewBindings.findChildViewById(rootView, id);
      if (recyclerRequestsList == null) {
        break missingId;
      }

      id = R.id.textNoDormitories;
      TextView textNoDormitories = ViewBindings.findChildViewById(rootView, id);
      if (textNoDormitories == null) {
        break missingId;
      }

      id = R.id.tvDormName;
      TextView tvDormName = ViewBindings.findChildViewById(rootView, id);
      if (tvDormName == null) {
        break missingId;
      }

      id = R.id.tvRoomList;
      TextView tvRoomList = ViewBindings.findChildViewById(rootView, id);
      if (tvRoomList == null) {
        break missingId;
      }

      return new FragmentRoomListBinding((ConstraintLayout) rootView, btnAll, btnAvailable,
          btnOccupied, card, ibBack, progressBar, recyclerRequestsList, textNoDormitories,
          tvDormName, tvRoomList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
