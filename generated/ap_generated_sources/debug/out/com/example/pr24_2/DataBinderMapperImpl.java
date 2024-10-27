package com.example.pr24_2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.pr24_2.databinding.ActivityMainBindingImpl;
import com.example.pr24_2.databinding.FragmentDateListBindingImpl;
import com.example.pr24_2.databinding.FragmentIncomeDetailsBindingImpl;
import com.example.pr24_2.databinding.FragmentLoginBindingImpl;
import com.example.pr24_2.databinding.FragmentRegisterBindingImpl;

import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTDATELIST = 2;

  private static final int LAYOUT_FRAGMENTINCOMEDETAILS = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTREGISTER = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.incomelistapp2024.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.incomelistapp2024.R.layout.fragment_date_list, LAYOUT_FRAGMENTDATELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.incomelistapp2024.R.layout.fragment_income_details, LAYOUT_FRAGMENTINCOMEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.incomelistapp2024.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.incomelistapp2024.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATELIST: {
          if ("layout/fragment_date_list_0".equals(tag)) {
            return new FragmentDateListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_date_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINCOMEDETAILS: {
          if ("layout/fragment_income_details_0".equals(tag)) {
            return new FragmentIncomeDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_income_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.incomelistapp2024.R.layout.activity_main);
      sKeys.put("layout/fragment_date_list_0", com.example.incomelistapp2024.R.layout.fragment_date_list);
      sKeys.put("layout/fragment_income_details_0", com.example.incomelistapp2024.R.layout.fragment_income_details);
      sKeys.put("layout/fragment_login_0", com.example.incomelistapp2024.R.layout.fragment_login);
      sKeys.put("layout/fragment_register_0", com.example.incomelistapp2024.R.layout.fragment_register);
    }
  }
}
