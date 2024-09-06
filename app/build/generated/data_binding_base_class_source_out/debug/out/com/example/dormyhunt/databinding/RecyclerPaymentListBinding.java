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

public final class RecyclerPaymentListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvlistamountdata;

  @NonNull
  public final TextView tvlistapprovedata;

  @NonNull
  public final TextView tvlistdatedata;

  @NonNull
  public final TextView tvlistreferencedata;

  @NonNull
  public final View view;

  private RecyclerPaymentListBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView tvlistamountdata, @NonNull TextView tvlistapprovedata,
      @NonNull TextView tvlistdatedata, @NonNull TextView tvlistreferencedata, @NonNull View view) {
    this.rootView = rootView;
    this.tvlistamountdata = tvlistamountdata;
    this.tvlistapprovedata = tvlistapprovedata;
    this.tvlistdatedata = tvlistdatedata;
    this.tvlistreferencedata = tvlistreferencedata;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RecyclerPaymentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RecyclerPaymentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.recycler_payment_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RecyclerPaymentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvlistamountdata;
      TextView tvlistamountdata = ViewBindings.findChildViewById(rootView, id);
      if (tvlistamountdata == null) {
        break missingId;
      }

      id = R.id.tvlistapprovedata;
      TextView tvlistapprovedata = ViewBindings.findChildViewById(rootView, id);
      if (tvlistapprovedata == null) {
        break missingId;
      }

      id = R.id.tvlistdatedata;
      TextView tvlistdatedata = ViewBindings.findChildViewById(rootView, id);
      if (tvlistdatedata == null) {
        break missingId;
      }

      id = R.id.tvlistreferencedata;
      TextView tvlistreferencedata = ViewBindings.findChildViewById(rootView, id);
      if (tvlistreferencedata == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new RecyclerPaymentListBinding((ConstraintLayout) rootView, tvlistamountdata,
          tvlistapprovedata, tvlistdatedata, tvlistreferencedata, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
