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

public final class ItemPaymentHistoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView textPaymentDate;

  @NonNull
  public final TextView textPaymentId;

  @NonNull
  public final TextView textStatus;

  private ItemPaymentHistoryBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView textPaymentDate, @NonNull TextView textPaymentId,
      @NonNull TextView textStatus) {
    this.rootView = rootView;
    this.textPaymentDate = textPaymentDate;
    this.textPaymentId = textPaymentId;
    this.textStatus = textStatus;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPaymentHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPaymentHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_payment_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPaymentHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textPaymentDate;
      TextView textPaymentDate = ViewBindings.findChildViewById(rootView, id);
      if (textPaymentDate == null) {
        break missingId;
      }

      id = R.id.textPaymentId;
      TextView textPaymentId = ViewBindings.findChildViewById(rootView, id);
      if (textPaymentId == null) {
        break missingId;
      }

      id = R.id.textStatus;
      TextView textStatus = ViewBindings.findChildViewById(rootView, id);
      if (textStatus == null) {
        break missingId;
      }

      return new ItemPaymentHistoryBinding((ConstraintLayout) rootView, textPaymentDate,
          textPaymentId, textStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
