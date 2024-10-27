package com.example.incomelistapp2024

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class RegisterFragmentDirections private constructor() {
  public companion object {
    public fun actionRegisterFragmentToDateListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_registerFragment_to_dateListFragment)
  }
}
