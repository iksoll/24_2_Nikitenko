package com.example.incomelistapp2024

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToDateListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_dateListFragment)

    public fun actionLoginFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment)
  }
}
