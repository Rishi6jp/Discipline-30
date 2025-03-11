package com.example.discipline30.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quotes(
    @StringRes val quoteRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val explainRes: Int
)
