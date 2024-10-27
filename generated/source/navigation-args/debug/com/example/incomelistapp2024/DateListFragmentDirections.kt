package com.example.incomelistapp2024

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class DateListFragmentDirections private constructor() {
  public companion object {
    public fun actionDateListFragmentToIncomeDetailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dateListFragment_to_incomeDetailsFragment)
  }
}
