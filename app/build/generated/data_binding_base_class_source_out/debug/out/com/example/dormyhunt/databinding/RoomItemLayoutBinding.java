// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RoomItemLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView lblSlash;

  @NonNull
  public final TextView textAvailability;

  @NonNull
  public final TextView textCapacity;

  @NonNull
  public final TextView textMaxCapacity;

  @NonNull
  public final TextView textRoomNumber;

  private RoomItemLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView lblSlash,
      @NonNull TextView textAvailability, @NonNull TextView textCapacity,
      @NonNull TextView textMaxCapacity, @NonNull TextView textRoomNumber) {
    this.rootView = rootView;
    this.lblSlash = lblSlash;
    this.textAvailability = textAvailability;
    this.textCapacity = textCapacity;
    this.textMaxCapacity = textMaxCapacity;
    this.textRoomNumber = textRoomNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RoomItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RoomItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.room_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RoomItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lblSlash;
      TextView lblSlash = ViewBindings.findChildViewById(rootView, id);
      if (lblSlash == null) {
        break missingId;
      }

      id = R.id.textAvailability;
      TextView textAvailability = ViewBindings.findChildViewById(rootView, id);
      if (textAvailability == null) {
        break missingId;
      }

      id = R.id.textCapacity;
      TextView textCapacity = ViewBindings.findChildViewById(rootView, id);
      if (textCapacity == null) {
        break missingId;
      }

      id = R.id.textMaxCapacity;
      TextView textMaxCapacity = ViewBindings.findChildViewById(rootView, id);
      if (textMaxCapacity == null) {
        break missingId;
      }

      id = R.id.textRoomNumber;
      TextView textRoomNumber = ViewBindings.findChildViewById(rootView, id);
      if (textRoomNumber == null) {
        break missingId;
      }

      return new RoomItemLayoutBinding((ConstraintLayout) rootView, lblSlash, textAvailability,
          textCapacity, textMaxCapacity, textRoomNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
