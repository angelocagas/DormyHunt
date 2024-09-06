// Generated by view binder compiler. Do not edit!
package com.example.dormyhunt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dormyhunt.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hbb20.CountryCodePicker;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpLandlordBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView DORMIFY;

  @NonNull
  public final TextView DORMIFY2;

  @NonNull
  public final ConstraintLayout btnAddImage;

  @NonNull
  public final AppCompatButton buttonlandlord;

  @NonNull
  public final CheckBox cbAgreement;

  @NonNull
  public final TextInputEditText confirmPassEt;

  @NonNull
  public final TextInputLayout confirmPasswordLayout;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final TextInputEditText emailEt;

  @NonNull
  public final TextInputLayout emailLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView ivSelectedImage;

  @NonNull
  public final TextView lbletEmergencyFullName;

  @NonNull
  public final TextView lbletEmergencyFullName2;

  @NonNull
  public final TextView lbletbtnAddImage;

  @NonNull
  public final TextView lbletbtnAddImage2;

  @NonNull
  public final TextView lbletemailLayout;

  @NonNull
  public final TextView lbletemailLayout2;

  @NonNull
  public final TextView lbletpassword2Layout;

  @NonNull
  public final TextView lbletpassword2Layout2;

  @NonNull
  public final TextView lbletpasswordLayout;

  @NonNull
  public final TextView lbletpasswordLayout2;

  @NonNull
  public final TextView lblphoneNumberLayout;

  @NonNull
  public final TextView lblphoneNumberLayout2;

  @NonNull
  public final CountryCodePicker loginCountrycode;

  @NonNull
  public final TextInputEditText passET;

  @NonNull
  public final TextInputLayout passwordLayout;

  @NonNull
  public final TextInputEditText phoneNumberEt;

  @NonNull
  public final TextInputLayout phoneNumberLayout;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton rbLandlord;

  @NonNull
  public final RadioButton rbTenant;

  @NonNull
  public final RadioGroup rgRole;

  @NonNull
  public final LinearLayout textView;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextInputEditText usernameEt;

  @NonNull
  public final TextInputLayout usernameLayout;

  private ActivitySignUpLandlordBinding(@NonNull NestedScrollView rootView,
      @NonNull TextView DORMIFY, @NonNull TextView DORMIFY2, @NonNull ConstraintLayout btnAddImage,
      @NonNull AppCompatButton buttonlandlord, @NonNull CheckBox cbAgreement,
      @NonNull TextInputEditText confirmPassEt, @NonNull TextInputLayout confirmPasswordLayout,
      @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputEditText emailEt,
      @NonNull TextInputLayout emailLayout, @NonNull ImageView imageView,
      @NonNull ImageView ivSelectedImage, @NonNull TextView lbletEmergencyFullName,
      @NonNull TextView lbletEmergencyFullName2, @NonNull TextView lbletbtnAddImage,
      @NonNull TextView lbletbtnAddImage2, @NonNull TextView lbletemailLayout,
      @NonNull TextView lbletemailLayout2, @NonNull TextView lbletpassword2Layout,
      @NonNull TextView lbletpassword2Layout2, @NonNull TextView lbletpasswordLayout,
      @NonNull TextView lbletpasswordLayout2, @NonNull TextView lblphoneNumberLayout,
      @NonNull TextView lblphoneNumberLayout2, @NonNull CountryCodePicker loginCountrycode,
      @NonNull TextInputEditText passET, @NonNull TextInputLayout passwordLayout,
      @NonNull TextInputEditText phoneNumberEt, @NonNull TextInputLayout phoneNumberLayout,
      @NonNull ProgressBar progressBar, @NonNull RadioGroup radioGroup,
      @NonNull RadioButton rbLandlord, @NonNull RadioButton rbTenant, @NonNull RadioGroup rgRole,
      @NonNull LinearLayout textView, @NonNull TextView textView1, @NonNull TextView textView2,
      @NonNull TextView textView4, @NonNull TextInputEditText usernameEt,
      @NonNull TextInputLayout usernameLayout) {
    this.rootView = rootView;
    this.DORMIFY = DORMIFY;
    this.DORMIFY2 = DORMIFY2;
    this.btnAddImage = btnAddImage;
    this.buttonlandlord = buttonlandlord;
    this.cbAgreement = cbAgreement;
    this.confirmPassEt = confirmPassEt;
    this.confirmPasswordLayout = confirmPasswordLayout;
    this.constraintLayout2 = constraintLayout2;
    this.emailEt = emailEt;
    this.emailLayout = emailLayout;
    this.imageView = imageView;
    this.ivSelectedImage = ivSelectedImage;
    this.lbletEmergencyFullName = lbletEmergencyFullName;
    this.lbletEmergencyFullName2 = lbletEmergencyFullName2;
    this.lbletbtnAddImage = lbletbtnAddImage;
    this.lbletbtnAddImage2 = lbletbtnAddImage2;
    this.lbletemailLayout = lbletemailLayout;
    this.lbletemailLayout2 = lbletemailLayout2;
    this.lbletpassword2Layout = lbletpassword2Layout;
    this.lbletpassword2Layout2 = lbletpassword2Layout2;
    this.lbletpasswordLayout = lbletpasswordLayout;
    this.lbletpasswordLayout2 = lbletpasswordLayout2;
    this.lblphoneNumberLayout = lblphoneNumberLayout;
    this.lblphoneNumberLayout2 = lblphoneNumberLayout2;
    this.loginCountrycode = loginCountrycode;
    this.passET = passET;
    this.passwordLayout = passwordLayout;
    this.phoneNumberEt = phoneNumberEt;
    this.phoneNumberLayout = phoneNumberLayout;
    this.progressBar = progressBar;
    this.radioGroup = radioGroup;
    this.rbLandlord = rbLandlord;
    this.rbTenant = rbTenant;
    this.rgRole = rgRole;
    this.textView = textView;
    this.textView1 = textView1;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.usernameEt = usernameEt;
    this.usernameLayout = usernameLayout;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpLandlordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpLandlordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up_landlord, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpLandlordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DORMIFY;
      TextView DORMIFY = ViewBindings.findChildViewById(rootView, id);
      if (DORMIFY == null) {
        break missingId;
      }

      id = R.id.DORMIFY2;
      TextView DORMIFY2 = ViewBindings.findChildViewById(rootView, id);
      if (DORMIFY2 == null) {
        break missingId;
      }

      id = R.id.btnAddImage;
      ConstraintLayout btnAddImage = ViewBindings.findChildViewById(rootView, id);
      if (btnAddImage == null) {
        break missingId;
      }

      id = R.id.buttonlandlord;
      AppCompatButton buttonlandlord = ViewBindings.findChildViewById(rootView, id);
      if (buttonlandlord == null) {
        break missingId;
      }

      id = R.id.cbAgreement;
      CheckBox cbAgreement = ViewBindings.findChildViewById(rootView, id);
      if (cbAgreement == null) {
        break missingId;
      }

      id = R.id.confirmPassEt;
      TextInputEditText confirmPassEt = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassEt == null) {
        break missingId;
      }

      id = R.id.confirmPasswordLayout;
      TextInputLayout confirmPasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (confirmPasswordLayout == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.emailEt;
      TextInputEditText emailEt = ViewBindings.findChildViewById(rootView, id);
      if (emailEt == null) {
        break missingId;
      }

      id = R.id.emailLayout;
      TextInputLayout emailLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailLayout == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.ivSelectedImage;
      ImageView ivSelectedImage = ViewBindings.findChildViewById(rootView, id);
      if (ivSelectedImage == null) {
        break missingId;
      }

      id = R.id.lbletEmergencyFullName;
      TextView lbletEmergencyFullName = ViewBindings.findChildViewById(rootView, id);
      if (lbletEmergencyFullName == null) {
        break missingId;
      }

      id = R.id.lbletEmergencyFullName2;
      TextView lbletEmergencyFullName2 = ViewBindings.findChildViewById(rootView, id);
      if (lbletEmergencyFullName2 == null) {
        break missingId;
      }

      id = R.id.lbletbtnAddImage;
      TextView lbletbtnAddImage = ViewBindings.findChildViewById(rootView, id);
      if (lbletbtnAddImage == null) {
        break missingId;
      }

      id = R.id.lbletbtnAddImage2;
      TextView lbletbtnAddImage2 = ViewBindings.findChildViewById(rootView, id);
      if (lbletbtnAddImage2 == null) {
        break missingId;
      }

      id = R.id.lbletemailLayout;
      TextView lbletemailLayout = ViewBindings.findChildViewById(rootView, id);
      if (lbletemailLayout == null) {
        break missingId;
      }

      id = R.id.lbletemailLayout2;
      TextView lbletemailLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (lbletemailLayout2 == null) {
        break missingId;
      }

      id = R.id.lbletpassword2Layout;
      TextView lbletpassword2Layout = ViewBindings.findChildViewById(rootView, id);
      if (lbletpassword2Layout == null) {
        break missingId;
      }

      id = R.id.lbletpassword2Layout2;
      TextView lbletpassword2Layout2 = ViewBindings.findChildViewById(rootView, id);
      if (lbletpassword2Layout2 == null) {
        break missingId;
      }

      id = R.id.lbletpasswordLayout;
      TextView lbletpasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (lbletpasswordLayout == null) {
        break missingId;
      }

      id = R.id.lbletpasswordLayout2;
      TextView lbletpasswordLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (lbletpasswordLayout2 == null) {
        break missingId;
      }

      id = R.id.lblphoneNumberLayout;
      TextView lblphoneNumberLayout = ViewBindings.findChildViewById(rootView, id);
      if (lblphoneNumberLayout == null) {
        break missingId;
      }

      id = R.id.lblphoneNumberLayout2;
      TextView lblphoneNumberLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (lblphoneNumberLayout2 == null) {
        break missingId;
      }

      id = R.id.login_countrycode;
      CountryCodePicker loginCountrycode = ViewBindings.findChildViewById(rootView, id);
      if (loginCountrycode == null) {
        break missingId;
      }

      id = R.id.passET;
      TextInputEditText passET = ViewBindings.findChildViewById(rootView, id);
      if (passET == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      TextInputLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
        break missingId;
      }

      id = R.id.phoneNumberEt;
      TextInputEditText phoneNumberEt = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberEt == null) {
        break missingId;
      }

      id = R.id.phoneNumberLayout;
      TextInputLayout phoneNumberLayout = ViewBindings.findChildViewById(rootView, id);
      if (phoneNumberLayout == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = ViewBindings.findChildViewById(rootView, id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.rbLandlord;
      RadioButton rbLandlord = ViewBindings.findChildViewById(rootView, id);
      if (rbLandlord == null) {
        break missingId;
      }

      id = R.id.rbTenant;
      RadioButton rbTenant = ViewBindings.findChildViewById(rootView, id);
      if (rbTenant == null) {
        break missingId;
      }

      id = R.id.rgRole;
      RadioGroup rgRole = ViewBindings.findChildViewById(rootView, id);
      if (rgRole == null) {
        break missingId;
      }

      id = R.id.textView;
      LinearLayout textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.usernameEt;
      TextInputEditText usernameEt = ViewBindings.findChildViewById(rootView, id);
      if (usernameEt == null) {
        break missingId;
      }

      id = R.id.usernameLayout;
      TextInputLayout usernameLayout = ViewBindings.findChildViewById(rootView, id);
      if (usernameLayout == null) {
        break missingId;
      }

      return new ActivitySignUpLandlordBinding((NestedScrollView) rootView, DORMIFY, DORMIFY2,
          btnAddImage, buttonlandlord, cbAgreement, confirmPassEt, confirmPasswordLayout,
          constraintLayout2, emailEt, emailLayout, imageView, ivSelectedImage,
          lbletEmergencyFullName, lbletEmergencyFullName2, lbletbtnAddImage, lbletbtnAddImage2,
          lbletemailLayout, lbletemailLayout2, lbletpassword2Layout, lbletpassword2Layout2,
          lbletpasswordLayout, lbletpasswordLayout2, lblphoneNumberLayout, lblphoneNumberLayout2,
          loginCountrycode, passET, passwordLayout, phoneNumberEt, phoneNumberLayout, progressBar,
          radioGroup, rbLandlord, rbTenant, rgRole, textView, textView1, textView2, textView4,
          usernameEt, usernameLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
