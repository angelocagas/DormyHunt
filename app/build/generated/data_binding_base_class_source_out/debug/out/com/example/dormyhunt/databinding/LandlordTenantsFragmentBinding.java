// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LandlordTenantsFragmentBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerTenants;

  @NonNull
  public final SwipeRefreshLayout swapRefreshLayout;

  @NonNull
  public final TextView textNoDormitories;

  @NonNull
  public final TextView tvDormListings;

  @NonNull
  public final CardView tvDormListings2;

  private LandlordTenantsFragmentBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerTenants,
      @NonNull SwipeRefreshLayout swapRefreshLayout, @NonNull TextView textNoDormitories,
      @NonNull TextView tvDormListings, @NonNull CardView tvDormListings2) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.recyclerTenants = recyclerTenants;
    this.swapRefreshLayout = swapRefreshLayout;
    this.textNoDormitories = textNoDormitories;
    this.tvDormListings = tvDormListings;
    this.tvDormListings2 = tvDormListings2;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LandlordTenantsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LandlordTenantsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.landlord_tenants_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LandlordTenantsFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.recyclerTenants;
      RecyclerView recyclerTenants = ViewBindings.findChildViewById(rootView, id);
      if (recyclerTenants == null) {
        break missingId;
      }

      SwipeRefreshLayout swapRefreshLayout = (SwipeRefreshLayout) rootView;

      id = R.id.textNoDormitories;
      TextView textNoDormitories = ViewBindings.findChildViewById(rootView, id);
      if (textNoDormitories == null) {
        break missingId;
      }

      id = R.id.tvDormListings;
      TextView tvDormListings = ViewBindings.findChildViewById(rootView, id);
      if (tvDormListings == null) {
        break missingId;
      }

      id = R.id.tvDormListings2;
      CardView tvDormListings2 = ViewBindings.findChildViewById(rootView, id);
      if (tvDormListings2 == null) {
        break missingId;
      }

      return new LandlordTenantsFragmentBinding((SwipeRefreshLayout) rootView, progressBar,
          recyclerTenants, swapRefreshLayout, textNoDormitories, tvDormListings, tvDormListings2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
