package com.bookmark.domain.usecase.profile.goal

import com.bookmark.domain.repository.BookRepository
import javax.inject.Inject

class GetReadingGoals @Inject constructor(private val repository : BookRepository) {
    fun invoke() {}
}