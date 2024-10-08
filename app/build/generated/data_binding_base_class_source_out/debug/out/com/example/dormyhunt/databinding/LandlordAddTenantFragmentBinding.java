// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LandlordAddTenantFragmentBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Button btnAddTenant;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final CheckBox cbAgreement;

  @NonNull
  public final EditText etTenantAddress;

  @NonNull
  public final EditText etTenantEmail;

  @NonNull
  public final EditText etTenantName;

  @NonNull
  public final EditText etTenantPhoneNumber;

  @NonNull
  public final ImageView ivDisplayPicture;

  @NonNull
  public final ImageView ivDormifyIcon;

  @NonNull
  public final ImageView ivNotification;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final Spinner spinnerDormName;

  @NonNull
  public final Spinner spinnerRoomNo;

  @NonNull
  public final TextView tvAddTenants;

  @NonNull
  public final TextView tvDormify;

  private LandlordAddTenantFragmentBinding(@NonNull NestedScrollView rootView,
      @NonNull Button btnAddTenant, @NonNull Button btnCancel, @NonNull CheckBox cbAgreement,
      @NonNull EditText etTenantAddress, @NonNull EditText etTenantEmail,
      @NonNull EditText etTenantName, @NonNull EditText etTenantPhoneNumber,
      @NonNull ImageView ivDisplayPicture, @NonNull ImageView ivDormifyIcon,
      @NonNull ImageView ivNotification, @NonNull NestedScrollView nestedScrollView,
      @NonNull Spinner spinnerDormName, @NonNull Spinner spinnerRoomNo,
      @NonNull TextView tvAddTenants, @NonNull TextView tvDormify) {
    this.rootView = rootView;
    this.btnAddTenant = btnAddTenant;
    this.btnCancel = btnCancel;
    this.cbAgreement = cbAgreement;
    this.etTenantAddress = etTenantAddress;
    this.etTenantEmail = etTenantEmail;
    this.etTenantName = etTenantName;
    this.etTenantPhoneNumber = etTenantPhoneNumber;
    this.ivDisplayPicture = ivDisplayPicture;
    this.ivDormifyIcon = ivDormifyIcon;
    this.ivNotification = ivNotification;
    this.nestedScrollView = nestedScrollView;
    this.spinnerDormName = spinnerDormName;
    this.spinnerRoomNo = spinnerRoomNo;
    this.tvAddTenants = tvAddTenants;
    this.tvDormify = tvDormify;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static LandlordAddTenantFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LandlordAddTenantFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.landlord_add_tenant_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LandlordAddTenantFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAddTenant;
      Button btnAddTenant = ViewBindings.findChildViewById(rootView, id);
      if (btnAddTenant == null) {
        break missingId;
      }

      id = R.id.btnCancel;
      Button btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.cbAgreement;
      CheckBox cbAgreement = ViewBindings.findChildViewById(rootView, id);
      if (cbAgreement == null) {
        break missingId;
      }

      id = R.id.etTenantAddress;
      EditText etTenantAddress = ViewBindings.findChildViewById(rootView, id);
      if (etTenantAddress == null) {
        break missingId;
      }

      id = R.id.etTenantEmail;
      EditText etTenantEmail = ViewBindings.findChildViewById(rootView, id);
      if (etTenantEmail == null) {
        break missingId;
      }

      id = R.id.etTenantName;
      EditText etTenantName = ViewBindings.findChildViewById(rootView, id);
      if (etTenantName == null) {
        break missingId;
      }

      id = R.id.etTenantPhoneNumber;
      EditText etTenantPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (etTenantPhoneNumber == null) {
        break missingId;
      }

      id = R.id.ivDisplayPicture;
      ImageView ivDisplayPicture = ViewBindings.findChildViewById(rootView, id);
      if (ivDisplayPicture == null) {
        break missingId;
      }

      id = R.id.ivDormifyIcon;
      ImageView ivDormifyIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivDormifyIcon == null) {
        break missingId;
      }

      id = R.id.ivNotification;
      ImageView ivNotification = ViewBindings.findChildViewById(rootView, id);
      if (ivNotification == null) {
        break missingId;
      }

      NestedScrollView nestedScrollView = (NestedScrollView) rootView;

      id = R.id.spinnerDormName;
      Spinner spinnerDormName = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDormName == null) {
        break missingId;
      }

      id = R.id.spinnerRoomNo;
      Spinner spinnerRoomNo = ViewBindings.findChildViewById(rootView, id);
      if (spinnerRoomNo == null) {
        break missingId;
      }

      id = R.id.tvAddTenants;
      TextView tvAddTenants = ViewBindings.findChildViewById(rootView, id);
      if (tvAddTenants == null) {
        break missingId;
      }

      id = R.id.tvDormify;
      TextView tvDormify = ViewBindings.findChildViewById(rootView, id);
      if (tvDormify == null) {
        break missingId;
      }

      return new LandlordAddTenantFragmentBinding((NestedScrollView) rootView, btnAddTenant,
          btnCancel, cbAgreement, etTenantAddress, etTenantEmail, etTenantName, etTenantPhoneNumber,
          ivDisplayPicture, ivDormifyIcon, ivNotification, nestedScrollView, spinnerDormName,
          spinnerRoomNo, tvAddTenants, tvDormify);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
